package cn.dwt.flyweight;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/15 13:42]
 */
public class Main {
	public static void main(String[] args) {
		LetterFactory factory = LetterFactory.getInstance();
		String word = "easiness";
		addLetterByName(factory, word);
		getLetter(factory, word);
	}

	private static void getLetter(LetterFactory factory, String word) {
		for (char c : word.toCharArray()) {
			System.out.println(factory.get(c + ""));
		}
	}

	private static void addLetterByName(LetterFactory factory, String word) {
		for (char c : word.toCharArray()) {
			factory.add(new Letter(c + ""));
		}
	}
}
