package cn.dwt.templatemethod;

/**
 * Char打印
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 15:30]
 */
public class CharDisplay extends AbstractDisplay{
	private char ch;

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	public void open() {
		System.out.println("<<");
	}

	@Override
	public void print() {
		System.out.println(ch);
	}

	@Override
	public void close() {
		System.out.println(">>");

	}
}
