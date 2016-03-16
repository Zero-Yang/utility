package com.zero.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberUtils {
	/**
	 * 小数格式化
	 * @param value String 原值
	 * @param precision int  精度
	 * @param round boolean 四舍五入
	 * @return
	 */
	public static String numberFormat(String value,int precision,boolean round){
		return new BigDecimal(value).setScale(precision,round==true?0:1).toString();
	}
	
	/**
	 * 小数格式化<br>
	 * 格式化表达式如：
	 * 0:取一位整数<br>
	 * 0.00:取一位整数两位小数<br>
	 * 00.000:取两位整数和三位小数，整数不足部分以0填补<br>
	 * #:取所有整数部分   <br>
	 * #.##%:以百分比方式计数，并取两位小数<br>
	 * #.#####E0:显示为科学计数法，并取五位小数  <br>
	 * 00.####E0:显示为两位整数的科学计数法，并取四位小数<br>
	 * ,###:每三位以逗号进行分隔<br>
	 * 光速大小为每秒,###米：将格式嵌入文本 <br>
	 * @param expression 格式化表达式
	 * @param value 值
	 * @return
	 */
	public static String doubleFormat(String expression,double value){
		return new DecimalFormat(expression).format(value);
	}
	
	/**
	 * 根据地区格式化数字
	 * @param expression 格式化表达式
	 * @param value 值
	 * @param locale 地区Locale的地区静态常量
	 * @see NumberUtils#doubleFormat(String, double)
	 * @return
	 */
	public static String doubleFormat(String expression,double value,Locale locale){
		
		DecimalFormat df = null;   
        try {   
            df = (DecimalFormat)   
                NumberFormat.getInstance(locale);
        }   
        catch (ClassCastException e) {   
            System.err.println(e);   
        }
        
        df.applyPattern(expression);
        
        return df.format(value);
		
	}
}
