
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Functions_Impl implements Functions {
    DBWriting Write = new DBWriting();

    @Override
    public void StaffAssign(List<Staff> StaffList, List<String> workdays) {
        List<String> bucket = new ArrayList<>();
        for (Staff staff : StaffList){
            if(staff.getRole().name().equals("STAFF")){
                Collections.shuffle(workdays);
                bucket.addAll(workdays.subList(0,2));
                for (String day :workdays){
                    int count = Collections.frequency(bucket, day);
                    if (count >= 8) { // Check if any day in the bucket has been assigned up to 8 times
                        workdays.remove(day); // Remove the day if it has been assigned 8 times
                    }
                }
                List<String> sublist = workdays.subList(0, 2);
                String output = sublist.toString().replace("[", "").replace("]", "");
                System.out.println(staff.getFirstname() + " " + staff.getLastname() + "'s office days are " + output);
            }
        }

    }

    @Override
    public void InternAssign(List<Staff> StaffList, List<String> days) {
        List<String> bucket = new ArrayList<>();

        for (Staff staff : StaffList) {
            if (staff.getRole().name().equals("INTERN")) {
                Collections.shuffle(days);
                bucket.addAll(days.subList(0, 3));

                List<String> daysToRemove = new ArrayList<>();
                for (String day : days) {
                    int count = Collections.frequency(bucket, day);
                    if (count >= 4) {
                        daysToRemove.add(day); // Mark the day for removal
                    }
                }
                days.removeAll(daysToRemove);
                List<String> sublist = days.subList(0, 3);
                String output = sublist.toString().replace("[", "").replace("]", ""); // Remove square brackets from days output
                System.out.println(staff.getFirstname() + " " + staff.getLastname() + "'s office days are " + output);
            }
        }
    }


    @Override
    public void addStaffMember() {
        StaffData staffData = new StaffData();  // Assuming this gets the existing list of staffs
       //staffData.getStaffs().add(newStaff);

        Scanner scanner = new Scanner(System.in);

        // Get user input for the staff member details
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Role (STAFF, INTERN, CORPER): ");
        String roleInput = scanner.nextLine();
        Roles role = Roles.valueOf(roleInput.toUpperCase());

        // Create a new Staff object with user input
        Staff newStaff = new Staff(id, firstName, lastName, role);

        // Add the new staff member to the list
        staffData.getStaffs().add(newStaff);

        // Write the updated list to the database
        Write.writeToDatabase();

        System.out.println("New staff member added successfully!");
        }




}



