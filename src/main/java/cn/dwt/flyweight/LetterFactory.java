package cn.dwt.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/15 13:38]
 */
public class LetterFactory {
	private Map<String,Letter> map;

	private static LetterFactory instance = new LetterFactory();

	private LetterFactory() {
		map = new HashMap<>();
	}

	public static LetterFactory getInstance() {
		return instance;
	}

	public void add(Letter letter) {
		if (letter != null && !map.containsKey(letter.getName())) {
			map.put(letter.getName(), letter);
		}
		System.out.println("map.size:"+map.size());
	}

	public Letter get(String name) {
		return map.get(name);
	}
}
