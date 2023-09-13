package cn.dwt.iterator;

import cn.dwt.adapter.Print;
import cn.dwt.adapter.PrintBanner;
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

}
