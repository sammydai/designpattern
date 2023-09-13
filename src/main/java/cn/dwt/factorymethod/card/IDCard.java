package cn.dwt.factorymethod.card;

import cn.dwt.factorymethod.framework.Product;

/**
 * IDCard
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/13 13:49]
 */
public class IDCard extends Product {

	private String owner;

	public IDCard(String owner) {
		System.out.println("制作"+owner+"id卡");
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	@Override
	public void use() {
		System.out.println("使用"+owner+"id卡");
	}
}
