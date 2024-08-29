
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Functions_Impl implements Functions {
    //Random random = new Random();

    @Override
    public void StaffAssign(List<Staff> StaffList, List<String> workdays) {
        Map<String, Integer> dayCount = new HashMap<>();
        for (String day : workdays) {
            dayCount.put(day, 0);
        }

        for (Staff staff : StaffList) {
            if (staff.getRole().name().equals("STAFF")) {
                List<String> availableDays = new ArrayList<>(workdays);
                Collections.shuffle(availableDays);

                List<String> assignedDays = new ArrayList<>();
                for (String day : availableDays) {
                    if (dayCount.get(day) < 8 && assignedDays.size() < 2) {
                        assignedDays.add(day);
                        dayCount.put(day, dayCount.get(day) + 1);
                    }
                }

                System.out.println(STR."\{staff.getFirstname()} \{staff.getLastname()} is assigned to work on: \{assignedDays.get(0)} and \{assignedDays.get(1)}");

            }
     }
    }

    @Override
    public void InternAssign(List<Staff> StaffList, List<String> days) {
        Map<String, Integer> dayCount = new HashMap<>();
        for (String day : days) {
            dayCount.put(day, 0);
        }

        for (Staff staff : StaffList) {
            if (staff.getRole().name().equals("INTERN")) {
                List<String> availableDays = new ArrayList<>(days);
                Collections.shuffle(availableDays);

                List<String> assignedDays = new ArrayList<>();
                for (String day : availableDays) {
                    if (dayCount.get(day) < 4 && assignedDays.size() < 3) {
                        assignedDays.add(day);
                        dayCount.put(day, dayCount.get(day) + 1);
                    }
                }

                System.out.println(STR."\{staff.getFirstname()} \{staff.getLastname()} is assigned to work on: \{assignedDays.get(0)} ,\{assignedDays.get(1)} and \{assignedDays.get(2)}");
            }
        }
    }

    @Override
    public void addStaffMember(DBWriting writer) {
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
        //staffData.getStaffs().add(newStaff);

        writer.writeToDatabase( newStaff);

        System.out.println("New staff member added successfully!");
        }
}








