package singletonHandson;

public class DBconn {

	private static DBconn con=new DBconn();
    private DBconn() {
    	
    }
	public static DBconn getInstance()  {

     return con;	
	}
	
	
}