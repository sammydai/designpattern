package cn.dwt.abstractfactory;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 17:53]
 */
public class Square implements Shape{
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
