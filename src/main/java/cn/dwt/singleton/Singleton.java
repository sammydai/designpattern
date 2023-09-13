package cn.dwt.singleton;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 15:47]
 */
public class Singleton {
	private static Singleton instance = null;

	private Singleton() {
	}

	public Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
