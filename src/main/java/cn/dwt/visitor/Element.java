package cn.dwt.visitor;

public interface Element {
	void accept(Visitor visitor);
}
