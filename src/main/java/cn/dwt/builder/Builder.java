package cn.dwt.builder;

/**
 * Builder
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 16:32]
 */
public abstract class Builder {
	public abstract void makeTitle(String title);

	public abstract void makeString(String str);

	public abstract void makeItems(String[] items);

	public abstract void close();
}
