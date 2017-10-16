package tutorial;

import java.util.*;

import com.opensymphony.xwork2.ActionSupport;
public class ACTIONS extends ActionSupport{
	public ArrayList<BOOK> rslst1 = new ArrayList<BOOK>();
	public ArrayList<BOOK> rslst2 = new ArrayList<BOOK>();
	public String AuName;
	public String ISbnn;
	public String deISB; 
	public String searchbks(){
		LoginDB ldb=new LoginDB(); 
		ldb.connectsql();
		String sql="select * from book1 where Publisher="+ AuName;
		rslst1=ldb.findbks(sql);
		if(rslst1==null)
			System.out.println("lllll");
		ldb.close();
		return SUCCESS;
	}
	public String showall(){
		LoginDB ldb=new LoginDB();
		ldb.connectsql();
		String sql="delete from book where a.AuthorID= b.AuthorID and b.ISBN="  +"\""+ISbnn+"\"  ";
		rslst2=ldb.findbks(sql);
		ldb.close();
		return SUCCESS;
	}
	public String dele(){
		LoginDB ldb=new LoginDB();
		ldb.connectsql();
		String sql="delete from book where ISBN="+"\""+deISB+"\"";
		ldb.executeSql(sql);
		ldb.close();
		return SUCCESS;
	}
}
