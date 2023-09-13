package cn.dwt.factorymethod.card;

import cn.dwt.factorymethod.framework.Factory;
import cn.dwt.factorymethod.framework.Product;

import java.util.List;

/**
 * IDCardFactory
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 13:50]
 */
public class IDCardFactory extends Factory {

	private List<String> owners;

	@Override
	protected void registryProduct(Product product) {
		this.owners.add(((IDCard) product).getOwner());
	}

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	public List<String> getOwners() {
		return owners;
	}

	public void setOwners(List<String> owners) {
		this.owners = owners;
	}
}
