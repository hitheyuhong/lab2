package tutorial;

import java.sql.*;
import java.util.*;

public class LoginDB {
	private static String DRIVER_MYSQL = "com.mysql.jdbc.Driver";    //MySQL JDBC�����ַ���
    private static String URL = "jdbc:mysql://localhost:3306/bookname_1?useSSL=false";
    private static Statement st;
    private Connection connection = null;
    public void connectsql()                           //�������ݿ�
	{
		 try
	        {
	            Class.forName(DRIVER_MYSQL).newInstance();     //����JDBC����
	            //System.out.println("Driver Load Success.");
	            connection = DriverManager.getConnection(URL,"root","1234");   //�������ݿ����Ӷ�����ʹ����ƽ̨�����ݿ���Ҫ������Щ��Ϣ
	            st = connection.createStatement();       //����Statement����
	        } 
		 catch (Exception e)
	        {
	            e.printStackTrace();
	            System.out.println("failed------------------------------");
	        }
	}
    public ResultSet query(String sql)                
    {
        ResultSet result = null;
        try
        {
            result = st.executeQuery(sql);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        return result;
    }
    public ArrayList<BOOK> findbks(String sql)     //����ISBN��������������������һ����̬���� 
	{
		ResultSet rs = null;
		ArrayList<BOOK> bklist = new ArrayList<BOOK>();
		try
        {
            rs = st.executeQuery(sql);
            while(rs.next())
            {
            	BOOK bk = new BOOK();
            	 
            	bk.setISBN(rs.getString("ISBN"));
            	bk.setTitle(rs.getString("Title"));
            	bk.setAuthorID(rs.getString("AuthorID"));
            	bk.setPublishDate(rs.getString("PublishDate"));
            	bk.setPrice(rs.getString("Price"));
            	bk.setPublisher(rs.getString("Publisher"));
            	bklist.add(bk);
            }
        } 
		catch (SQLException e)
        {
            e.printStackTrace();
        }
		return bklist;
	}
    public void executeSql(String sql) {     //ִ��һ��Ĳ�������
    	try
        {
            st.execute(sql);
        } catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void close()   //�Ͽ�����
	{
		try {
			connection.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return ;
	}
 
}
