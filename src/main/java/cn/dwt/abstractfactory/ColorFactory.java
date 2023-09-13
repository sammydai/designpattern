package cn.dwt.abstractfactory;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 17:57]
 */
public class ColorFactory extends AbstractFactory{
	@Override
	public Color getColor(String color) {
		if(color == null){
			return null;
		}
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		} else if(color.equalsIgnoreCase("BLACK")){
			return new Black();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}
}
