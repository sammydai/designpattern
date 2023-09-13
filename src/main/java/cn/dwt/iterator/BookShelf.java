package cn.dwt.iterator;

/**
 * 书架
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 10:23]
 */
public class BookShelf implements Aggregate{

	private Book[] books;

	private int last = 0;

	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}

	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}

	public int getLength() {
		return last;
	}

	public Book getBookAt(int index){
		return this.books[index];
	}


	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
