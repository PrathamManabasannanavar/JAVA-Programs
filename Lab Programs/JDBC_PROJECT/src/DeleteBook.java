import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteBook {
		// TODO Auto-generated method stub
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
				String sql = "delete from book where id=1";
				
				int rs = stmt.executeUpdate(sql);
				if(rs >=0)
					System.out.println("delt6ed");
				else
					System.out.println("not deleted");
				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
}


