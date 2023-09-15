package cn.dwt.proxy;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/15 13:50]
 */
public class Main {
	public static void main(String[] args) {
		Printable p = new PrinterProxy("Alice");
		System.out.println("现在的名字是 " + p.getPrinterName() + "。");
		p.setPrinterName("Bob");
		System.out.println("现在的名字是 " + p.getPrinterName() + "。");
		p.print("Hello, world.");
	}
}

