package cn.dwt.iterator;

/**
 * 遍历书架的类
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 10:33]
 */
public class BookShelfIterator implements Iterator {

	private BookShelf bookShelf;

	private int index = 0;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		int length = bookShelf.getLength();
		if (index < length) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
