package cn.dwt.templatemethod;

/**
 * 模板工程类
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 15:29]
 */
public abstract class AbstractDisplay {

	public abstract void open();

	public abstract void print();

	public abstract void close();

	public void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
