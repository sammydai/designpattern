package cn.dwt.bridge;

/**
 * CountDisplay
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/14 12:19]
 */
public class CountDisplay extends Display{

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void multiDisplay(int times) {       // 循环显示times次
		open();
		for (int i = 0; i < times; i++) {
			print();
		}
		close();
	}
}
