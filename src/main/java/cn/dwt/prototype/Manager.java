package cn.dwt.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Manager
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 16:10]
 */
public class Manager {

	private Map<String, Object> showcase = new HashMap<>();

	public void register(String name, Object proto) {
		showcase.put(name, proto);
	}

	public Product create(String protoname) {
		Product product = (Product) showcase.get(protoname);
		return product.createClone();
	}
}
