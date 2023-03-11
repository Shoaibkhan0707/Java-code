import java.sql.*;
class mydao {
    String url;
    String username;
    String password;
    mydao(String host,int port,String db,String un,String pass){
        username=un;
        password=pass;
        url="jdbc:mysql://"+host+":"+port+"/"+db;
    }
    public Statement dbConnector()throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url,username,password).createStatement();
    }
    public void storeData(Statement st,String query)throws SQLException{
        st.execute(query);
    }
    public ResultSet fetchdata(Statement st,String query)throws SQLException {
       return  st.executeQuery(query);
    }
}
class mdao {
    public static void main(String args[]) {
        mydao m = new mydao("localhost", 3306, "user", "shoaib", "admin@123");
        try {
            Statement st = m.dbConnector();
            String query = "select node,connected_nodes from graph";
            ResultSet rs=m.fetchData(st, query);
        }
        catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        catch (ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }
    }
}

