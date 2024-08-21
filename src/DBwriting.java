import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.sql.PreparedStatement;
public class DBwriting {
    StaffData staffData = new StaffData();
    Staff person = new Staff();

    List<Staff> StaffList = new ArrayList<>();

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


            for(Staff staff: staffData.getStaffs()) {

                preparedStatement.setInt(1, staff.getId());
                preparedStatement.setString(2, staff.getFirstname());
                preparedStatement.setString(3, staff.getLastname());
                preparedStatement.setString(4, staff.getRole().name());
                int rowsInserted = preparedStatement.executeUpdate();

                if (rowsInserted > 0) {
                    System.out.println("A new staff member was inserted successfully!");
                }
            }

            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM STAFF");
            while(rs.next()){
                person.setId(rs.getInt(1));
                person.setFirstname(rs.getString(2));
                person.setLastname(rs.getString(3));
                person.setRole(Roles.valueOf(rs.getString(4)));
;
                StaffList.add(person);
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

