package cn.dwt.adapter.proxy;

/**
 * PrintBanner
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 12:03]
 */
public class PrintBanner extends PrintNew{

	private Banner banner;

	public PrintBanner(String str) {
		this.banner = new Banner(str);
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
}
