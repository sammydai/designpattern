package cn.dwt.observe;

import java.util.Random;

/**
 * RandomNumberGenerator
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/15 15:13]
 */
public class RandomNumberGenerator extends NumberGenerator{
	private Random random = new Random();
	private int number;

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void execute() {
		for (int i = 0;i < 5;i++) {
			//产生新的数值后通知所有观察者
			number = random.nextInt(5);
			notifyObservers();
		}
	}
}
