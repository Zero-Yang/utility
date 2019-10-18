package com.zero.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapUtils {
	/**
	 * 忽略Key大小写
	 * 
	 * @param map
	 * @param key
	 *            必须是String类型
	 * @throws Exception
	 */
	public static Object getIgnoreCase(Map<String, Object> map, String key) {
		return get(map, key);
	}

	/**
	 * 删除某个或者多个Key
	 * 
	 * @param map
	 * @param key
	 */
	public static <K,V>  Map<K,V> removeKey(Map<K,V> map, Object...key) {
		for(Object k:key){
			map.remove(k);
		}
		return map;
	}

	/**
	 * 判断Map中是否存在某个Key
	 * 
	 * @param map
	 * @param key
	 * @return
	 */
	public static boolean hasKey(Map<Object, Object> map, Object key) {
		if (map.containsKey(key)) {
			return true;
		}
		return false;
	}

	/**
	 * 根据Key获取Value，非map.get()方法，而是去遍历，通过KE忽略大小写来比较，如果想等，则返回value
	 * 
	 * @param map
	 * @param key
	 * @return
	 */
	private static Object get(Map<String, Object> map, String key) {
		if (!check(map, key))
			return null;
		Iterator<Entry<String, Object>> it = map.entrySet().iterator();
		Entry<String, Object> entry = null;
		while (it.hasNext()) {
			entry = it.next();
			if (entry.getKey().toUpperCase().equalsIgnoreCase(key.toUpperCase())) {
				return entry.getValue();
			}
		}
		return null;
	}
	
	public static Long getAsLong(Map<String, Object> map, Object key) {
		if (!check(map, key))
			return null;
		Object v = map.get(key);
		if (v == null)
			return null;
		if (v instanceof Long) {
			return (Long) v;
		} else {
			return Long.parseLong(v.toString());
		}
	}
	
	public static Long getAsLongIgnoreCase(Map<String, Object> map, String key) {
		if (!check(map, key))
			return null;
		Object v = get(map, key);
		if (v == null)
			return null;
		if (v instanceof Long) {
			return (Long) v;
		} else {
			return Long.parseLong(v.toString());
		}
	}
	
	public static Integer getAsInt(Map<String, Object> map, Object key) {
		if (!check(map, key))
			return null;
		Object v = map.get(key);
		if (v == null)
			return null;
		if (v instanceof Integer) {
			return (Integer) v;
		} else {
			return Integer.parseInt(v.toString());
		}
	}

	public static Integer getAsIntIgnoreCase(Map<String, Object> map, String key) {
		if (!check(map, key))
			return null;
		Object v = get(map, key);
		if (v == null)
			return null;
		if (v instanceof Integer) {
			return (Integer) v;
		} else {
			return Integer.parseInt(v.toString());
		}
	}

	public static String getAsString(Map<String, Object> map, Object key) {
		if (!check(map, key))
			return null;
		Object v = map.get(key);
		if (v == null)
			return null;
		if (v instanceof String) {
			return (String) v;
		} else {
			return v.toString();
		}
	}

	public static String getAsStringIgnoreCase(Map<String, Object> map, String key) {
		if (!check(map, key))
			return null;
		Object v = get(map, key);
		if (v == null)
			return null;
		if (v instanceof String) {
			return (String) v;
		} else {
			return v.toString();
		}
	}

	public static Float getAsFloat(Map<String, Object> map, Object key) {
		if (!check(map, key))
			return null;
		Object v = map.get(key);
		if (v == null)
			return null;
		if (v instanceof Float) {
			return (Float) v;
		} else {
			return Float.parseFloat(v.toString());
		}
	}

	public static Float getAsFloatIgnoreCase(Map<String, Object> map, String key) {
		if (!check(map, key))
			return null;
		Object v = get(map, key);
		if (v instanceof Float) {
			return (Float) v;
		} else {
			return Float.parseFloat(v.toString());
		}
	}

	public static Double getAsDouble(Map<String, Object> map, Object key) {
		if (!check(map, key))
			return null;
		Object v = map.get(key);
		if (v == null)
			return null;
		if (v instanceof Double) {
			return (Double) v;
		} else {
			return Double.parseDouble(v.toString());
		}
	}

	public static Double getAsDoubleIgnoreCase(Map<String, Object> map, String key) {
		if (!check(map, key))
			return null;
		Object v = get(map, key);
		if (v == null)
			return null;
		if (v instanceof Double) {
			return (Double) v;
		} else {
			return Double.parseDouble(v.toString());
		}
	}

	public static Date getAsDate(Map<String, Object> map, Object key, String dateFormat) throws Exception {
		if (!check(map, key))
			return null;
		Object v = map.get(key);
		if (v == null)
			return null;
		if (v instanceof Date) {
			return (Date) v;
		} else if (v instanceof Long) {
			return new Date((Long) v);
		} else if (v instanceof String) {
			if (StringUtil.isBlank(dateFormat))
				throw new Exception("Please make a date format");
			return new SimpleDateFormat(dateFormat).parse(v.toString());
		} else {
			throw new Exception("Sorry,I don't know how to parse this value to a date");
		}
	}

	public static Date getAsDateIgnoreCase(Map<String, Object> map, String key, String dateFormat) throws Exception {
		if (!check(map, key))
			return null;
		Object v = get(map, key);
		if (v == null)
			return null;
		if (v instanceof Date) {
			return (Date) v;
		} else if (v instanceof Long) {
			return new Date((Long) v);
		} else if (v instanceof String) {
			if (StringUtil.isBlank(dateFormat))
				throw new Exception("Please make a date format");
			return new SimpleDateFormat(dateFormat).parse(v.toString());
		} else {
			throw new Exception("Sorry,I don't know how to parse this value to a date");
		}
	}

	public static Character getAsChar(Map<String, Object> map, Object key) {
		if (!check(map, key))
			return null;
		Object v = map.get(key);
		if (v == null)
			return null;
		if (v instanceof Character) {
			return (Character) v;
		} else {
			return v.toString().charAt(0);
		}
	}

	public static Character getAsCharIgnore(Map<String, Object> map, String key) {
		if (!check(map, key))
			return null;
		Object v = get(map, key);
		if (v == null)
			return null;
		if (v instanceof Character) {
			return (Character) v;
		} else {
			return v.toString().charAt(0);
		}
	}

	public static Short getAsShort(Map<String, Object> map, Object key) {
		if (!check(map, key))
			return null;
		Object v = map.get(key);
		if (v == null)
			return null;
		if (v instanceof Short) {
			return (Short) v;
		} else {
			return Short.parseShort(v.toString());
		}
	}

	public static Short getAsShortIgnoreCase(Map<String, Object> map, String key) {
		if (!check(map, key))
			return null;
		Object v = get(map, key);
		if (v == null)
			return null;
		if (v instanceof Short) {
			return (Short) v;
		} else {
			return Short.parseShort(v.toString());
		}
	}

	public static Object getAsObject(Map<String, Object> map, Object key) {
		if (!check(map, key))
			return null;
		return map.get(key);
	}

	public static Object getAsObject(Map<String, Object> map, String key) {
		if (!check(map, key))
			return null;
		return get(map, key);
	}

	public static Boolean getAsBoolean(Map<String, Object> map, Object key) {
		if (!check(map, key))
			return null;
		Object v = map.get(key);
		if (v == null)
			return null;
		if (v instanceof Short) {
			return (Boolean) v;
		} else {
			return Boolean.parseBoolean(v.toString());
		}
	}

	public static Boolean getAsBooleanIgnoreCase(Map<String, Object> map, String key) {
		if (!check(map, key))
			return null;
		Object v = get(map, key);
		if (v == null)
			return null;
		if (v instanceof Short) {
			return (Boolean) v;
		} else {
			return Boolean.parseBoolean(v.toString());
		}
	}

	private static boolean check(Map<String, Object> map, Object key) {
		if (map == null || map.size() == 0 || key == null)
			return false;
		return true;
	}

	public static void main(String[] args) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("age", 0);
		map.put("sex", "男");
		map.put("birthday", new Date());
		map.put("record", true);
		System.out.println(MapUtils.getAsString(map, "sex"));
		System.out.println(MapUtils.getAsInt(map, "age"));
		System.out.println(MapUtils.getAsBoolean(map, "record"));
		System.out.println(MapUtils.getAsDate(map, "birthday", "yyyy-mm-dd HH:mm:ss"));
	}
}
