
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Functions_Impl implements Functions {

    @Override
    public void StaffAssign(List<Staff> StaffList, ArrayList<String> workdays) {

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
    public void InternAssign(List<Staff> StaffList, ArrayList<String> days) {
        List<String> bucket = new ArrayList<>();

        for (Staff staff : StaffList) {
            if (staff.getRole().name().equals("INTERN")) {
                Collections.shuffle(days);
                bucket.addAll(days.subList(0, 3));

                for (String day : days) {
                    int count = Collections.frequency(bucket, day);
                    if (count >= 4) {
                        days.remove(day);
                    }
                }

                List<String> sublist = days.subList(0, 3);
                String output = sublist.toString().replace("[", "").replace("]", ""); // Remove square brackets from days output
                System.out.println(staff.getFirstname() + " " + staff.getLastname() + "'s office days are " + output);
            }
        }

    }

    @Override
    public void addStaffMember(List<Staff> StaffList, ArrayList<String> workdays) {
        Scanner scanner = new Scanner(System.in);
            //int nextId = Staff.size() + 1;
            System.out.println("Enter the new member's name:");
            String newName = scanner.nextLine();
            //Staff.put(nextId, newName);
            StaffAssign(StaffList, workdays);
        }

    @Override
    public void addNewIntern(List<Staff> StaffList, ArrayList<String> days) {
        Scanner scanner = new Scanner(System.in);
            //int nextId = Interns.size() + 1;
            System.out.println("Enter the new member's name:");
            String newName = scanner.nextLine();
            //Interns.put(nextId, newName);
            //StaffAssign(Interns, days);
        }


}



