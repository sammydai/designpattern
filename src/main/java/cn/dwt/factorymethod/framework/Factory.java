package cn.dwt.factorymethod.framework;

/**
 * 工厂类
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 13:43]
 */
public abstract class Factory {


	/**
	 * 使用模板方式创建
	 * @param owner
	 * @return {@link Product}
	 */
	public final Product create(String owner){
		Product product = createProduct(owner);
		registryProduct(product);
		return product;
	}

	protected abstract void registryProduct(Product product);

	protected abstract Product createProduct(String owner);
}
