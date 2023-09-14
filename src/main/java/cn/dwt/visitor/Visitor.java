package cn.dwt.visitor;



/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/14 15:04]
 */
public abstract class Visitor {

	public abstract void visit(File file);

	public abstract void visit(Directory directory);

}
