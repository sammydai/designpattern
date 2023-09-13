package cn.dwt.abstractfactory;

/**
 * FactoryProducer
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 17:58]
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		} else if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		return null;
	}
}
