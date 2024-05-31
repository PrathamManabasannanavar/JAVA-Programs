import java.sql.*;

class DataBaseConnectivity1 {
    public static void displayDatabase(ResultSet rs) throws Exception{
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +  rs.getString(3) + " " + rs.getFloat(4));
            }  
    }
    public static void main(String args[]) {
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", null);
            Statement st = con.createStatement();
            String query = "select * from studenttable";
            ResultSet rs = st.executeQuery(query.toString());
            // rs.next(); //not necessary
            // displayDatabase(rs);
            // query = "delete from studenttable where Name='Nayan'";
            // st.executeUpdate(query);
            // displayDatabase(rs); //it is throwing error because I think after updating the database the rs is discarded by the Garbage collectors so I can't use it further
            // query = "insert into studenttable values(2,'Nayan','2sd22err90', 9.8)";
            // st.executeUpdate(query);
            st.executeUpdate("update studenttable set Name='Gagan' where `roll no`=2");
            displayDatabase(st.executeQuery("select * from studenttable"));
            con.close();
            st.close();
        } catch (Exception e) {
            System.out.println("in catch " + e);
        }
    }
}