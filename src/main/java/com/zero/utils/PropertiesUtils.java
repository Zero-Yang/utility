package com.zero.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
	
	/**
	 * 读取Properties配置文件内容
	 * @param filePath
	 * @return Properties
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static Properties readProperties(String filePath) throws FileNotFoundException, IOException{
		Properties properties=new Properties();
		properties.load(new FileInputStream(new File(filePath)));
		return properties;
	}
	
	/**
	 * 写key-value到properties文件 相同的key会被覆盖 追加不同的key-value
	 * @param key 键
	 * @param value 值
	 * @param filePath 文件路径
	 * @param comment key-value的注释
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void writeProperties(String key,String value,String comment,String filePath) throws FileNotFoundException, IOException{
		Properties properties=new Properties();
		
		File file=new File(filePath);
		if(file.exists()){
			FileInputStream fis=new FileInputStream(file);
			properties.load(fis);
			fis.close();
		}
		properties.setProperty(key, value);
		properties.store(new FileOutputStream(new File(filePath)), comment);
	}

}
