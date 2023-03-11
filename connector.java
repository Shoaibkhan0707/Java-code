import java.sql.*;
class mysql {
    public static void main(String args[]){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }
        String url="jdbc:mysql://localhost:3306/STUDENT";
        String username="shoaib";
        String password="admin@123";
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            String query="INSERT INTO STUDENT VALUES('shah','khan',59,18)";
            st.execute(query);
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
}
