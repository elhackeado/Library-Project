import java.sql.*;

public class DB 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	public DB() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost/library";
		con = DriverManager.getConnection(url,"root","thakur");
		stmt = con.createStatement();
	}
	
	public void update(String qry) throws Exception
	{
		stmt.executeUpdate(qry);
	}
	
	public ResultSet execute(String qry) throws Exception
	{
		rs=stmt.executeQuery(qry);
		return rs;
	}
        
        public int getbookcatid() throws Exception
        {
            String qry = "select ifnull(max(bookcatid),0)max from tbbookcat";
            rs = stmt.executeQuery(qry);
            rs.next();
            int n = rs.getInt("max");
            n++;
            return n;
        }
        
         public int bookid() throws Exception
        {
            String qry = "select ifnull(max(bookid),0)max from tbbook";
            rs = stmt.executeQuery(qry);
            rs.next();
            int n = rs.getInt("max");
            n++;
            return n;
        }
         
         public int getissueid() throws Exception
        {
            String qry = "select ifnull(max(issueid),0)max from tbissue";
            rs = stmt.executeQuery(qry);
            rs.next();
            int n = rs.getInt("max");
            n++;
            return n;
        }
         public int getfineid() throws Exception
        {
            String qry = "select ifnull(max(fineid),0)max from tbfine";
            rs = stmt.executeQuery(qry);
            rs.next();
            int n = rs.getInt("max");
            n++;
            return n;
        }
}