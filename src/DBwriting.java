import java.sql.*;
import java.util.Map;
import java.sql.PreparedStatement;
public class DBwriting {
    Staffdata staff1 = new Staffdata();
    Interndata intern1 = new Interndata();

    Corperdata corper1 = new Corperdata();
    PreparedStatement preparedStatement = null;
    Connection con =null;
    String fName  = "";
    String lName  = "";
    public static void main(String[] args) {
        DBwriting write =  new DBwriting();
        write.createConnection();

    }

    void createConnection() {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/roster", "root", "isabella");
            System.out.println("Database connection successful");


            String sql = "INSERT INTO STAFF (id, FirstName, LastName, Role) VALUES (?, ?, ?, ?)";


            preparedStatement = con.prepareStatement(sql);

    for(int i=1;i<=19;i++) {
        Map<Integer, String> staffDetails = staff1.getStaffDetails();
        String[] s = staffDetails.get(i).split(" ");

        if(!(s.length <2)){
            fName = s[0];
            lName = s[1];

        }
        preparedStatement.setInt(1, i);
        preparedStatement.setString(2, fName);
        preparedStatement.setString(3, lName);
        preparedStatement.setString(4, "STAFF");
        int rowsInserted = preparedStatement.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("A new staff member was inserted successfully!");
        }
    }

     for(int i=20;i<=23;i++) {
         Map<Integer, String> internDetails = intern1.getInternDetails();
         String[] s = internDetails.get(i).split(" ");

                if(!(s.length <2)){
                    fName = s[0];
                    lName = s[1];

                }
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, fName);
                preparedStatement.setString(3, lName);
                preparedStatement.setString(4, "INTERN");
                int rowsInserted = preparedStatement.executeUpdate();

                if (rowsInserted > 0) {
                    System.out.println("A new staff member was inserted successfully!");
                }
            }
        for(int i=24;i<=27;i++) {
                Map<Integer, String> corperDetails = corper1.getCorpersDetails();
                String[] s = corperDetails.get(i).split(" ");

                if(!(s.length <2)){
                    fName = s[0];
                    lName = s[1];

                }
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, fName);
                preparedStatement.setString(3, lName);
                preparedStatement.setString(4, "CORPER");
                int rowsInserted = preparedStatement.executeUpdate();

                if (rowsInserted > 0) {
                    System.out.println("A new staff member was inserted successfully!");
                }
            }






        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6. Close the resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

