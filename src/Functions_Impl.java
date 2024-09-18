
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
//            System.out.println(staff.getFirstname());
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
    public void CorperAssign(List<Staff> StaffList, List<String> Days) {
        Map<String, Integer> dayCount = new HashMap<>();
        for (String day : Days) {
            dayCount.put(day, 0);
        }
        for (Staff staff : StaffList) {
            if (staff.getRole().name().equals("CORPER")) {
                List<String> availableDays = new ArrayList<>(Days);
                Collections.shuffle(availableDays);

                List<String> assignedDays = new ArrayList<>();
                for (String day : availableDays) {
                    if (dayCount.get(day) < 4 && assignedDays.size() < 3) {
                        assignedDays.add(day);
                        dayCount.put(day, dayCount.get(day) + 1);
                    }
                }
                if (staff.getRole() == Roles.CORPER) {
                        String specialDay = staff.getSpecialDay();
                        if (specialDay != null && Days.contains(specialDay)) {
                            availableDays.remove(specialDay);
                        }

                }
                System.out.println(STR."\{staff.getFirstname()} \{staff.getLastname()} is assigned to work on: \{assignedDays.get(0)} ,\{assignedDays.get(1)} and \{assignedDays.get(2)}");
            }
        }
    }

    @Override
    public void addStaffMember(DBWriting writer) {
        StaffData staffData = new StaffData();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Role (STAFF, INTERN, CORPER): ");
        String roleInput = scanner.nextLine();
        Roles role = Roles.valueOf(roleInput.toUpperCase());

        String specialDay = null;
        if (role == Roles.CORPER) {
            System.out.print("What day is your CDS?: ");
            specialDay = scanner.nextLine();
        }

        Staff newStaff = new Staff(id, firstName, lastName, role);

        writer.writeToDatabase( newStaff);

        System.out.println("New staff member added successfully!");
        }
}








