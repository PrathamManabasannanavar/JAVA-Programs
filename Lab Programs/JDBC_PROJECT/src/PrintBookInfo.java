import java.sql.*;

public class PrintBookInfo {
	static final String driver = "com.mysql.jdbc.Driver";
	static final String dburl = "jdbc:mysql://localhost/2sd22cs063";
	static final String user = "root";
	static final String pwd=""; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(dburl, user, pwd);
			Statement stmt = con.createStatement();
			String sql = "select * from book";
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "	" + rs.getString(2) + " " + rs.getDouble(3));
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
