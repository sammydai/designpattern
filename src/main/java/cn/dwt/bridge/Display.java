package cn.dwt.bridge;

/**
 * Display
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/14 11:39]
 */
public class Display {

	private DisplayImpl impl;

	public Display(DisplayImpl impl) {
		this.impl = impl;
	}

	public void open() {
		impl.rawopen();
	}

	public void print() {
		impl.rawprint();
	}

	public void close() {
		impl.rawclose();
	}

	public final void display() {
		open();
		print();
		close();
	}

}
