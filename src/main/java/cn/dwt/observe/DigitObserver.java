package cn.dwt.observe;

/**
 * DigitObserver
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/15 15:15]
 */
public class DigitObserver implements Observer {
	@Override
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:" + generator.getNumber());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
