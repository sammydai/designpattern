package cn.dwt.abstractfactory;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 17:53]
 */
public class Black implements Color{
	@Override
	public void fill() {
		System.out.println("Inside Black::fill() method.");
	}
}
