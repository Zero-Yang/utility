package com.zero.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipUtils {
	/**
	 * 压缩目录，注意，中文乱码，目录中不能有嵌套的目录,将不会被压缩到压缩文件中
	 * @param dir 目录
	 * @param dest 目标压缩文件.zip
	 * @throws Exception
	 */
	public static void zip(String dir,String dest) throws Exception{
		
		File directory=new File(dir);
		if(!directory.isDirectory())throw new Exception("\""+dir+"\"不是一个目录");
		
		File destination=new File(dest);
		OutputStream os=new FileOutputStream(destination);
		BufferedOutputStream bos=new BufferedOutputStream(os);
		ZipOutputStream zos=new ZipOutputStream(bos);
		
		File[] files=directory.listFiles(); 
		
		InputStream is=null;
		byte[] buffer=new byte[1024];
		int length=0;
		
		for(File file:files){
			if(file.isDirectory())continue;
			is=new FileInputStream(file);
			zos.putNextEntry(new ZipEntry(file.getName()));
			while ((length=is.read(buffer))!=-1) {
				zos.write(buffer, 0, length);
			}
		}
		zos.closeEntry();
		zos.close();
	}
	
	/**
	 * 压缩一个或者多个文件
	 * @param dest 目标压缩文件.zip
	 * @param src 单个文件路径字符串或者文件路径字符串数组
	 * @throws Exception
	 */
	public static void zip(String dest,String... src) throws Exception{
		
		File destination=new File(dest);
		OutputStream os=new FileOutputStream(destination);
		BufferedOutputStream bos=new BufferedOutputStream(os);
		ZipOutputStream zos=new ZipOutputStream(bos);
		
		InputStream is=null;
		byte[] buffer=new byte[1024];
		int length=0;
		File file=null;
		
		for(String s:src){
			file=new File(s);
			is=new FileInputStream(file);
			zos.putNextEntry(new ZipEntry(file.getName()));
			while ((length=is.read(buffer))!=-1) {
				zos.write(buffer, 0, length);
			}
		}
		zos.closeEntry();
		zos.close();
	}
	
	/**
	 * 文件解压缩 注意 不能有中文文件名
	 * @param zipSrc zip文件路径
	 * @param dest 解压的路径，无需以“\\”或者“/”结尾
	 * @throws IOException
	 */
	public static void unzip(String zipSrc,String dest) throws IOException{
		
		//为了适配不同操作系统的文件路径的分隔符
		String systemSeparator=System.getProperty("file.separator");
		System.out.println(systemSeparator);
		
		CheckedInputStream cis=new CheckedInputStream(new FileInputStream(new File(zipSrc)), new CRC32());
		ZipInputStream zis=new ZipInputStream(cis);
		ZipEntry ze=null;
		FileOutputStream fos=null;
		byte[] buffer=new byte[1024];
		int length=0;
		
		if(!new File(dest).exists())new File(dest).mkdirs();
		
		while((ze=zis.getNextEntry())!=null){
			String fileName=dest+File.separator+ze.getName();
			//都替换一遍省心
			fileName=fileName.replace("\\", systemSeparator).replace("/", systemSeparator);
			if(fileName.lastIndexOf(systemSeparator)!=-1)new File(fileName.substring(0,fileName.lastIndexOf(systemSeparator))).mkdirs();
			if(fileName.lastIndexOf(systemSeparator)==fileName.length()-1)continue;
			System.out.println(fileName);
			fos=new FileOutputStream(fileName);
			while ((length=zis.read(buffer))!=-1) {
				fos.write(buffer, 0, length);
			}
			fos.close();
		}
		zis.closeEntry();
		zis.close();
	}

}
