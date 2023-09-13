package cn.dwt.prototype;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 16:06]
 */
public class MessageBox implements Product{
	@Override
	public void use(String s) {
		System.out.println("this is message box"+s);
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
		return p;
	}
}
