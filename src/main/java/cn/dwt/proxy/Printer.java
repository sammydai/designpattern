package cn.dwt.proxy;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/15 13:50]
 */
public class Printer implements Printable {

	private String name;

	public Printer() {
		//构造函数里有“重活”，不方便打印，因此要将打印工作交给代理
		heavyJob("正在生成Printer的实例");
	}
	public Printer(String name) {
		this.name = name;
		heavyJob("正在生成Printer的实例（" + name + "）");
	}

	/**
	 * 设置打印机的名字
	 */
	@Override
	public void setPrinterName(String name) {
		this.name = name;
	}

	/**
	 * 获取打印机的名字
	 */
	@Override
	public String getPrinterName() {
		return name;
	}

	@Override
	public void print(String string) {
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}

	/**
	 * 一个重活，每秒只显示一个点，Printer类会因为构造函数里有该方法
	 * 而不方便打印，所以我们才将打印工作交给代理
	 */
	private void heavyJob(String msg) {
		System.out.print(msg);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.print(".");
		}
		System.out.println("结束。");
	}
}

