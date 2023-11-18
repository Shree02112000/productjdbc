import java.sql.*;
public class Productinsert {
public static void insert()throws Exception {
	String url="jdbc:mysql://127.0.0.1:3306/rk";
	String username="root";
	String password="0211";
	String Query="insert into product values(?,?,?)";
	Connection con=DriverManager.getConnection(url, username, password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setInt(1, 1);
	pst.setString(2, "shree");
	pst.setString(3, "shree@gmail.com");
	pst.executeUpdate();
	con.close();
	
}public static void main(String[]args) throws Exception{
	insert();
}
}
