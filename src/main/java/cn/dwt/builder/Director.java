package cn.dwt.builder;

/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 16:35]
 */
public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void constructor() {
		builder.makeTitle("Greeting");
		builder.makeItems(new String[]{"Morning","Afternoon"});
		builder.makeString("morning to afternoot");
		builder.close();
	}
}
