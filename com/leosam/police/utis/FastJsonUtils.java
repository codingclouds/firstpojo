package com.leosam.police.utis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * JSON工具类，使用fastjson实现。
 * 
 * @author congli216488
 * @since 2018-10-4 23:30:05
 */
public final class FastJsonUtils {
	public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	/**
	 * 输出值为null的字段
	 */
	public static final SerializerFeature WRITE_MAP_NULL_VALUE = SerializerFeature.WriteMapNullValue;
	/**
	 * list字段如果为null，输出为[]，而不是null
	 */
	public static final SerializerFeature WRITE_NULL_LIST_AS_EMPTY = SerializerFeature.WriteNullListAsEmpty;
	/**
	 * 字符类型字段如果为null,输出为"",而非null
	 */
	public static final SerializerFeature WRITE_NULL_NUMBER_AS_ZERO = SerializerFeature.WriteNullNumberAsZero;
	/**
	 * Boolean字段如果为null,输出为false,而非null
	 */
	public static final SerializerFeature WRITE_NULL_BOOLEAN_AS_FALSE = SerializerFeature.WriteNullBooleanAsFalse;
	/**
	 * 数值字段如果为null，输出为0，而不是null
	 */
	public static final SerializerFeature WRITE_NULL_AS_EMPTY = SerializerFeature.WriteNullStringAsEmpty;
	private static final SerializeConfig CONFIG;
	private static final SerializerFeature[] FEATURES = {
	        // 输出Map空置字段
	        WRITE_MAP_NULL_VALUE,
	        // list字段如果为null，输出为[]，而不是null
	        WRITE_NULL_LIST_AS_EMPTY,
	        // 数值字段如果为null，输出为0，而不是null
	        WRITE_NULL_NUMBER_AS_ZERO,
	        // Boolean字段如果为null，输出为false，而不是null
	        WRITE_NULL_BOOLEAN_AS_FALSE,
	        // 字符类型字段如果为null，输出为""，而不是null
	        WRITE_NULL_AS_EMPTY };

	static {
		CONFIG = new SerializeConfig();
		// 使用和json-lib兼容的日期输出格式
		CONFIG.put(Date.class, new JSONLibDataFormatSerializer());
		// 使用和json-lib兼容的日期输出格式
		CONFIG.put(java.sql.Date.class, new JSONLibDataFormatSerializer());
	}

	/**
	 * 防止实例化
	 */
	private FastJsonUtils() {

	}

	/**
	 * 将对象序列化成json字符串。
	 * 
	 * @param object 要被序列化的对象
	 * @return json字符串
	 */
	public static String toJSON(Object object) {
		return JSON.toJSONString(object);
	}

	/**
	 * 将Map序列化成json字符串。
	 * 
	 * @param map
	 * @param <K>
	 * @param <V>
	 * @return
	 */
	public static <K, V> String toJSON(Map<K, V> map) {
		return JSONObject.toJSONString(map);
	}

	/**
	 * 将java类型的对象转换为JSON格式的字符串
	 *
	 * @param object java类型的对象
	 * @param features
	 * @see FastJsonUtils#WRITE_MAP_NULL_VALUE
	 * @see FastJsonUtils#WRITE_NULL_AS_EMPTY
	 * @see FastJsonUtils#WRITE_NULL_BOOLEAN_AS_FALSE
	 * @return JSON格式的字符串
	 */
	public static String toJSON(Object object, SerializerFeature... features) {
		return JSON.toJSONString(object, features);
	}

	public static String toJSON(Object object, SerializeConfig config, SerializerFeature... features) {
		return JSON.toJSONString(object, config, features);
	}

	/**
	 * 将对象序列化成json字符串。
	 * 
	 * @param object
	 * @return
	 */
	public static String toJSONNoFeatures(Object object) {
		return JSON.toJSONString(object, CONFIG);
	}

	/**
	 * 将对象序列化成json字符串。
	 * 
	 * @param object
	 * @return
	 */
	public static String toJSONWithFeatures(Object object) {
		return JSON.toJSONString(object, CONFIG, FEATURES);
	}

	public static final <T> String toDateJson(final T object, String dateFormat) {
		if (null == dateFormat || "".equals(dateFormat)) {
			dateFormat = DATE_FORMAT;
		}
		final SerializeConfig configMapping = new SerializeConfig();
		configMapping.put(Date.class, new SimpleDateFormatSerializer(dateFormat));
		return toJSON(object, configMapping, WRITE_MAP_NULL_VALUE);
	}

	/**
	 * 将对象序列化成字节数组
	 * 
	 * @param obj 要被序列化的对象
	 * @return 字节数组
	 * @return
	 */
	public static byte[] toJsonBytes(Object obj) {
		return JSON.toJSONBytes(obj, SerializerFeature.WriteDateUseDateFormat);
	}

	/**
	 * 将json反序列化成java对象。Class 只能是JavaBean对象及其数组对象，不能是集合，Map。<br>
	 * 当然，JavaBean内部是可以包含集合，Map的。
	 * 
	 * @param text
	 * @return
	 */
	public static Object toBean(String text) {
		return JSON.parse(text);
	}

	public static JSONObject toJSONObject(String text) {
		return JSON.parseObject(text);
	}


	/**
	 * 将json反序列化成java对象。
	 * 
	 * @param text
	 * @param clazz
	 * @param <T>
	 * @return
	 */
	public static <T> T toBean(String text, Class<T> clazz) {
		return JSON.parseObject(text, clazz);
	}

	/**
	 * 将json反序列化成java对象。
	 * 
	 * @param text
	 * @param type
	 * @param <T>
	 * @return
	 */
	public static <T> T toBean(String text, Type type) {
		return JSON.parseObject(text, type);
	}

	/**
	 * 将json反序列化成java对象。适用于任何Java对象。TypeReference用法如：<br>
	 * new TypeReference<Map<String, List<User>>>(){}， new TypeReference<List<User>>(){}， new TypeReference<User>(){}， new TypeReference<User[]>(){} 泛型参数Map<String, List<User>>，List<User>，User，User[]即为你要反序列化的目标类型。 PageVO<ResultVO> pageVO1 =
	 * FastJsonUtils.toBean(s, new
	 * TypeReference<PageVO<ResultVO>>() {});
	 * 
	 * @param text json字符串
	 * @param typeReference 泛型类型引用
	 * @return
	 */
	public static <T> T toBean(String text, TypeReference<T> typeReference) {
		return JSON.parseObject(text, typeReference.getType());
	}

	public static <T> T toBean(String text, String field, Class<T> clazz) {
		JSONObject jsonObject = JSON.parseObject(text);
		return jsonObject.getObject(field, clazz);
	}

	/**
	 * 转换为数组
	 * 
	 * @param text
	 * @param <T>
	 * @return
	 */
	public static <T> Object[] toArray(String text) {
		return toArray(text, null);
	}

	/**
	 * 转换为数组
	 * 
	 * @param text
	 * @param clazz
	 * @param <T>
	 * @return
	 */
	public static <T> Object[] toArray(String text, Class<T> clazz) {
		return JSON.parseArray(text, clazz).toArray();
	}

	/**
	 * 转换为List
	 * 
	 * @param text
	 * @param clazz
	 * @param <T>
	 * @return
	 */
	public static <T> List<T> toList(String text, Class<T> clazz) {
		return JSON.parseArray(text, clazz);
	}

	public static <T> List<T> toList(String text, String field, Class<T> clazz) {
		JSONObject jsonObject = JSON.parseObject(text);
		return JSON.parseArray(jsonObject.getString(field), clazz);
	}

	@SuppressWarnings("unchecked")
	public static <K, V> Map<K, V> toMap(String text) {
		return (Map<K, V>) JSONObject.parseObject(text);
	}

	/**
	 * 对MapObject类型数据进行解析
	 * 
	 * @param json
	 * @return
	 */
	public static Map<String, Object> toMapObj(String json) {
		return JSON.parseObject(json, new TypeReference<Map<String, Object>>() {
		});
	}

	/**
	 * 功能描述：把JSON数据转换成较为复杂的List<Map<String, Object>>
	 * 
	 * @param jsonData
	 * @return
	 */
	public static List<Map<String, Object>> toListMap(String jsonData) {
		return JSON.parseObject(jsonData, new TypeReference<List<Map<String, Object>>>() {
		});
	}

	public static String formatJson(String s) {
		int level = 0;
		// 存放格式化的json字符串
		StringBuffer jsonForMatStr = new StringBuffer();
		// 将字符串中的字符逐个按行输出
		for (int index = 0; index < s.length(); index++) {
			// 获取s中的每个字符

			char c = s.charAt(index);
			if (level > 0 && '\n' == jsonForMatStr.charAt(jsonForMatStr.length() - 1)) {
				jsonForMatStr.append(getLevelStr(level));
			}
			// 遇到{和[要增加空格和换行，遇到}和]要减少空格，以对应，遇到,要换行
			switch (c) {
			case '{':
			case '[':
				jsonForMatStr.append(c + "\n");
				level++;
				break;
			case ',':
				jsonForMatStr.append(c + "\n");
				break;
			case '}':
			case ']':
				jsonForMatStr.append("\n");
				level--;
				jsonForMatStr.append(getLevelStr(level));
				jsonForMatStr.append(c);
				break;
			default:
				jsonForMatStr.append(c);
				break;
			}
		}
		return jsonForMatStr.toString();

	}

	private static String getLevelStr(int level) {
		StringBuffer levelStr = new StringBuffer();
		for (int levelI = 0; levelI < level; levelI++) {
			levelStr.append("\t");
		}
		return levelStr.toString();
	}

}
