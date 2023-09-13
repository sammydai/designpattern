package cn.dwt.adapter;

/**
 * 实际情况
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 11:53]
 */
public class Banner {
	private String str;

	public Banner(String str) {
		this.str = str;
	}

	public void showWithParen() {
		System.out.println("("+str+")");
	}

	public void showWithAster() {
		System.out.println("*"+str+"*");
	}
}
