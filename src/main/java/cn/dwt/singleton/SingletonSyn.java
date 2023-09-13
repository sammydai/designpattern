package cn.dwt.singleton;

/**
 * 双重检查
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 15:47]
 */
public class SingletonSyn {
	private static SingletonSyn instance = null;

	private SingletonSyn() {
	}

	public SingletonSyn getInstance() {
		if (instance == null) {
			synchronized (SingletonSyn.class) {
				if (instance == null) {
					instance = new SingletonSyn();
				}
			}
		}
		return instance;
	}
}

