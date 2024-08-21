
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Functions_Impl implements Functions {

    @Override
    public void StaffAssign(Map<Integer, String> map, ArrayList<String> workdays) {

        // Create a bucket to keep track of assigned days and a list for all weekdays
        ArrayList<String> bucket = new ArrayList<>();
        ArrayList<String> weekdays = new ArrayList<>();

        // A for loop to iterate over each staff member in the map
        for (Integer key : map.keySet()) {
            Collections.shuffle(workdays);  // Using collections to shuffle the workdays to randomize the assignment
            bucket.addAll(workdays.subList(0, 2)); // Assign the first two days from the shuffled list to the bucket
            for (String day : weekdays) {
                int count = Collections.frequency(bucket, day);
                if (count >= 8) { // A for loop to check if any day in the bucket has been assigned up to 8 days
                    workdays.remove(day); // Command to remove output day
                }
            }

            List<String> sublist = workdays.subList(0, 2);
            String output = sublist.toString().replace("[", "").replace("]", ""); // Using .toString and .replace to remove square brackets from days output
            System.out.println(map.get(key) + " office days are " + output); // Prints the staff member's and their assigned days
        }
    }

    @Override
    public void InternAssign(Map<Integer, String> map, ArrayList<String> days) {

        // Same as StaffAssign, but assigns 3 days and uses a different max amount of days
        ArrayList<String> bucket1 = new ArrayList<>();
        ArrayList<String> Weekdays = new ArrayList<>();

        for (Integer key : map.keySet()) { // A for loop to iterate over each intern in the map
            Collections.shuffle(days);  // Shuffle the available days to randomize the assignment
            bucket1.addAll(days.subList(0, 3)); // Assign the first three days from the shuffled list to the bucket

            for (String day : Weekdays) { // Check if any day in the bucket has been assigned up to 4 times
                int count = Collections.frequency(bucket1, day);
                if (count >= 4) {
                    days.remove(day);
                }
            }
            List<String> sublist = days.subList(0, 3);
            String output = sublist.toString().replace("[", "").replace("]", ""); // Using .toString and .replace to remove square brackets from days output
            System.out.println(map.get(key) + " office days are " + output); // Prints the intern's assigned days
        }
    }

    @Override
    public void addStaffMember(HashMap<Integer, String> Staff, ArrayList<String> workdays) {
        Scanner scanner = new Scanner(System.in);
            int nextId = Staff.size() + 1;
            System.out.println("Enter the new member's name:");
            String newName = scanner.nextLine();
            Staff.put(nextId, newName);
            StaffAssign(Staff, workdays);
        }

    @Override
    public void addNewIntern(HashMap<Integer, String> Interns, ArrayList<String> days) {
        Scanner scanner = new Scanner(System.in);
            int nextId = Interns.size() + 1;
            System.out.println("Enter the new member's name:");
            String newName = scanner.nextLine();
            Interns.put(nextId, newName);
            StaffAssign(Interns, days);
        }

    @Override
    public void mapStaffRoles(HashMap<Integer, String> staffMap, HashMap<Integer, String> corperMap, HashMap<Integer, String> internMap) {




    }
}



