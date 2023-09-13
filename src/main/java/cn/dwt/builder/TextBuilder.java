package cn.dwt.builder;

/**
 * TextBuilder
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 16:37]
 */
public class TextBuilder extends Builder {
	private StringBuffer buffer = new StringBuffer();

	@Override

	public void makeTitle(String title) {
		buffer.append("================\n");
		buffer.append(title);
		buffer.append("\n");
	}

	@Override
	public void makeString(String str) {
		buffer.append("================\n");
		buffer.append(str);
		buffer.append("\n");
		buffer.append("================\n");
	}

	@Override
	public void makeItems(String[] items) {
		for (String item : items) {
			buffer.append("================\n");
			buffer.append(item);
			buffer.append("\n");
			buffer.append("================\n");
		}
	}

	@Override
	public void close() {
		buffer.append("================\n");
	}

	public String getResult() {
		return buffer.toString();
	}
}
