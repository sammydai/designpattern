package cn.dwt.bridge;

/**
 * StringDisplayImpl
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/14 12:11]
 */
public class StringDisplayImpl extends DisplayImpl{

	private String string;

	private int width;

	public StringDisplayImpl(String string) {
		this.string = string;
	}

	@Override
	public void rawopen() {
		printLine();
	}

	@Override
	public void rawclose() {
		printLine();
	}

	@Override
	public void rawprint() {
		System.out.println("|" + string + "|");         // 前后加上"|"并显示
	}

	private void printLine() {
		System.out.print("+");                          // 显示用来表示方框的角的"+"
		for (int i = 0; i < width; i++) {               // 显示width个"-"
			System.out.print("-");                      // 将其用作方框的边框
		}
		System.out.println("+");                        // 显示用来表示方框的角的"+"
	}
}
