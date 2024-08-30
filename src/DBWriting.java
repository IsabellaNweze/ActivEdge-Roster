import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBWriting {
    StaffData staffData = new StaffData();
    List<Staff> StaffList = new ArrayList<>();

    Connection con = null;
    PreparedStatement preparedStatement = null;

    // 1. Method to create a database connection
    void createConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/roster", "root", "isabella");
            System.out.println("Database connection successful");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 2. Method to clear the table before writing new data
    void clearTable() {
        Statement stat = null;
        try {
            stat = con.createStatement();
            String sql = "DELETE FROM STAFF";
            stat.executeUpdate(sql);
            System.out.println("Table cleared successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stat != null) stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 3. Method to write data to the database
    void writeToDatabase() {

        try {
            // Check if there's already data in the database
            String sqlCheck = "SELECT COUNT(*) FROM STAFF";
            preparedStatement = con.prepareStatement(sqlCheck);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);

            // If the table is empty, proceed with the insertion
            if (count == 0) {
                String sql = "INSERT INTO STAFF (id, FirstName, LastName, Role) VALUES (?, ?, ?, ?)";
                preparedStatement = con.prepareStatement(sql);

                for (Staff staff : staffData.getStaffs()) {
                    preparedStatement.setInt(1, staff.getId());
                    preparedStatement.setString(2, staff.getFirstname());
                    preparedStatement.setString(3, staff.getLastname());
                    preparedStatement.setString(4, staff.getRole().name());
                    int rowsInserted = preparedStatement.executeUpdate();

                    if (rowsInserted > 0) {
                        System.out.println("A new staff member was inserted successfully!");
                    }
                }
            } else {
                System.out.println("The STAFF table already contains data. No new records were inserted.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    void writeToDatabase(Staff staff){
        try {
            String sql = "INSERT INTO STAFF (id, FirstName, LastName, Role) VALUES (?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(sql);

            preparedStatement.setInt(1, staff.getId());
            preparedStatement.setString(2, staff.getFirstname());
            preparedStatement.setString(3, staff.getLastname());
            preparedStatement.setString(4, staff.getRole().name());
            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("A new staff member was inserted successfully!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    // 4. Method to read data from the database
    void readFromDatabase() {
        Statement stat = null;
        ResultSet rs = null;

        try {
            stat = con.createStatement();
            rs = stat.executeQuery("SELECT * FROM STAFF");

            while (rs.next()) {
                Staff person = new Staff(); // Create a new Staff object for each row
                person.setId(rs.getInt(1));
                person.setFirstname(rs.getString(2));
                person.setLastname(rs.getString(3));
                person.setRole(Roles.valueOf(rs.getString(4)));
                StaffList.add(person);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stat != null) stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 5. Method to close the connection
    void closeConnection() {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
