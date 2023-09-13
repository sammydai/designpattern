package cn.dwt.abstractfactory;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 17:52]
 */
public class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
