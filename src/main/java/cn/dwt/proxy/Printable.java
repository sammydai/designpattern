package cn.dwt.proxy;

public interface Printable {
	//设置打印机的名字
	void setPrinterName(String name);
	//获取打印机的名字
	String getPrinterName();
	//显示文字（打印输出）
	void print(String string);
}

