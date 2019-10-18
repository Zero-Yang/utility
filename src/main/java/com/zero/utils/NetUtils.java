package com.zero.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class NetUtils {

	/**
	 * IP地址是否可达
	 * @param ip
	 * @return boolean
	 */
	public static boolean isReachable(String ip) {
		InetAddress address;
		try {
			address = InetAddress.getByName(ip);
			if (address.isReachable(5000)) {
				return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * 判断网址是否有效<br>
	 * <b>注意</b> 对于404页面，如果被电信或者联通劫持了，也会返回200的状态，这个是不准确的
	 * @param url URL对象
	 * @return boolean
	 */
	public static boolean isReachable(URL url){
		
		boolean reachable=false;
		HttpURLConnection httpconn=null;
		HttpsURLConnection httpsconn=null;
		int code=0;
		
		try {
			if(url.getProtocol().equals("https")){
				httpsconn=(HttpsURLConnection)url.openConnection();
				code=httpsconn.getResponseCode();
			}else{
				httpconn=(HttpURLConnection)url.openConnection();
				code=httpconn.getResponseCode();
			}
			System.out.println(code);
			if(code==200){
				reachable=true;
			}
		} catch (Exception e) {
			reachable=false;
		}
		
		return reachable;
	}
	
	/**
	 * 实现Ping命令
	 * @param ip
	 * @return Ping的字符串换行使用java的换行符"\n"，如果ping不同返回null
	 */
	public static String ping(String ip) {
		String res = "";
		String line = null;
		try {
			Process pro = Runtime.getRuntime().exec("ping " + ip);
			BufferedReader buf = new BufferedReader(new InputStreamReader(pro.getInputStream(), "GBK"));
			while ((line = buf.readLine()) != null) {
				if (!line.equals("")) {
					res+=String.valueOf(line)+"\n";
				}
			}
		} catch (Exception e) {
			res = null;
		}
		return res;
	}
}
