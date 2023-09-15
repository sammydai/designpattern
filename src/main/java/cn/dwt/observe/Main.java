package cn.dwt.observe;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/15 15:16]
 */
public class Main {
	public static void main(String[] args) {
		NumberGenerator generator = new RandomNumberGenerator();
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		generator.execute();//被观察者改变状态
	}
}

