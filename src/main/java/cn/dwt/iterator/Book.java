package cn.dwt.iterator;

/**
 * 书
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 10:24]
 */
public class Book {

	public Book(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
