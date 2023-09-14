package cn.dwt.visitor;

import java.util.Iterator;

/**
 * ListVisitor
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/14 15:05]
 */
public class ListVisitor extends Visitor{

	private String currentdir = "";

	public void visit(File file) {                  // 在访问文件时被调用
		System.out.println(currentdir + "/" + file);
	}
	public void visit(Directory directory) {   // 在访问文件夹时被调用
		System.out.println(currentdir + "/" + directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
		currentdir = savedir;
	}

}
