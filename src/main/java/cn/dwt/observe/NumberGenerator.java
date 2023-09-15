package cn.dwt.observe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * NumberGenerator
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/15 15:09]
 */
public abstract class NumberGenerator {

	private List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer observer) {//注册观察者
		observers.add(observer);
	}

	public void deleteobserver(Observer observer) {//删除观察者
		observers.remove(observer);
	}

	public void notifyObservers() {
		Iterator iterator = observers.listIterator();
		while (iterator.hasNext()) {
			Observer o = (Observer) iterator.next();
			o.update(this);
		}
	}

	public abstract int getNumber();//获取数值

	public abstract void execute();//生成数值

}
