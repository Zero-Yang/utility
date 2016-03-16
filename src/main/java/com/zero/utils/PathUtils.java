package com.zero.utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

public class PathUtils {
	/**
	 * 获取项目的绝对路径
	 * @return Sting 获取项目的绝对路径 不同的容器返回的路径不同
	 */
	@Deprecated
	public static String getProjectDrivePath(){
		return System.getProperty("user.dir"); 
	}
	
	/**
	 * 获取所在的盘符
	 * @return String
	 */
	public static String getDrive() {
		  return new File("/").getAbsolutePath();
	}
	
	/**
	 * 获取指定类的路径
	 * @param clazz
	 * @return String
	 */
	public static String getClassDrivePath(Class<?> clazz) {
		  return clazz.getResource("").getPath().substring(1);
	}
	
	/**
	 * 获取项目
	 * @return
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public static String getClassPath(){
		return Thread.currentThread().getContextClassLoader().getResource("").getPath();
	}
	
	public static String getJarPath() throws IOException, URISyntaxException {
		URL url = PathUtils.class.getProtectionDomain().getCodeSource().getLocation();
		String filePath = null;
		try {
			filePath = URLDecoder.decode(url.getPath(), "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1);

		return new File(filePath).getAbsolutePath();
	}
}
