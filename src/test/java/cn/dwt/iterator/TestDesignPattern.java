package cn.dwt.iterator;

import cn.dwt.abstractfactory.AbstractFactory;
import cn.dwt.abstractfactory.Color;
import cn.dwt.abstractfactory.FactoryProducer;
import cn.dwt.abstractfactory.Shape;
import cn.dwt.adapter.Print;
import cn.dwt.adapter.PrintBanner;
import cn.dwt.builder.Director;
import cn.dwt.builder.TextBuilder;
import cn.dwt.prototype.Manager;
import cn.dwt.prototype.MessageBox;
import cn.dwt.prototype.Product;
import cn.dwt.prototype.UnderlinePen;
import cn.dwt.templatemethod.AbstractDisplay;
import cn.dwt.templatemethod.CharDisplay;
import org.junit.Test;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 10:56]
 */
public class TestDesignPattern {

	@Test
	public void testIterator() {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}

	@Test
	public void testAdapter() {
		Print pb = new PrintBanner("hello");
		pb.printWeak();
		pb.printStrong();
	}

	@Test
	public void testAdapterNew() {
		System.out.println("testAdapterNew");
		cn.dwt.adapter.proxy.PrintNew pb = new cn.dwt.adapter.proxy.PrintBanner("hellow");
		pb.printWeak();
		pb.printStrong();
	}

	@Test
	public void testTemplateMethod() {
		AbstractDisplay charDisplay = new CharDisplay('o');
		charDisplay.display();
	}

	@Test
	public void testProtoType() {
		Manager manager = new Manager();
		MessageBox messageBox = new MessageBox();
		UnderlinePen underlinePen = new UnderlinePen();
		manager.register("messageBox",messageBox);
		manager.register("underlinePen",underlinePen);
		Product p1 = manager.create("underlinePen");
		p1.use("aaa");
		Product p2 = manager.create("messageBox");
		p2.use("bbb");
	}

	@Test
	public void testBuilder() {
		TextBuilder textBuilder = new TextBuilder();
		Director director = new Director(textBuilder);
		director.constructor();
		System.out.println(textBuilder.getResult());
	}

	@Test
	public void AbstractFactoryPatternDemo() {
		//获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		//获取形状为 Circle 的对象
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		//调用 Circle 的 draw 方法
		shape1.draw();


		//获取形状为 Square 的对象
		Shape shape3 = shapeFactory.getShape("SQUARE");

		//调用 Square 的 draw 方法
		shape3.draw();

		//获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		//获取颜色为 Red 的对象
		Color color1 = colorFactory.getColor("RED");

		//调用 Red 的 fill 方法
		color1.fill();

		//获取颜色为 Green 的对象
		Color color2 = colorFactory.getColor("Black");

		//调用 Green 的 fill 方法
		color2.fill();
	}

}
