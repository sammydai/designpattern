package cn.dwt.abstractfactory;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 17:54]
 */
public abstract class AbstractFactory {

	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}
