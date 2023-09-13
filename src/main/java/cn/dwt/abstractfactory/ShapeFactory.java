package cn.dwt.abstractfactory;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 17:55]
 */
public class ShapeFactory extends AbstractFactory{
	@Override
	public Color getColor(String color) {
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		if(shapeType == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}
}
