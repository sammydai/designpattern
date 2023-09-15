package cn.dwt.proxy;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/15 13:50]
 */
public class PrinterProxy implements Printable{

	//名字
	private String name;
	//“本人”
	private Printer real;

	public PrinterProxy() {}
	public PrinterProxy(String name) {
		this.name = name;
	}

	/**
	 * setPrinterName方法用于设置新的打印机名字。
	 * 如果real字段不为null(也就是已经生成了“本人”)，那么会设置“本人”的名字"，
	 同时设置自己( PrinterProxy的实例)的名字。
	 * 但是当real字段为null时(即还没有生成“本人”)，那么只会设置自己( PrinterProxy的实例)的名字。
	 */
	@Override
	public synchronized void setPrinterName(String name) {
		if (real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}

	/**
	 * 返回自己的name字段
	 * @return 自己的name字段
	 */
	@Override
	public String getPrinterName() {
		return name;
	}

	/**
	 * print方法已经超出了代理人的工作范围，因此它会调用realize方法来生成本人
	 * @param string 打印机的名字
	 */
	@Override
	public void print(String string) {
		realize();
		real.print(string);
	}

	/**
	 * 调用realize方法后，real字段中会保存本人(Print类的实例)，
	 * 因此可以调用real.print方法。这就是“委托”
	 */
	private synchronized void realize() {
		if (real == null) {
			real = new Printer(name);
		}
	}
}

