
import javax.swing.*;
import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ActivEdge_Roster {
    public static void main(String[] args)  {

        Functions function = new Functions_Impl(); // Assigning the functions_impl (Functions implementation) class to a new name called functions

        Map<Integer, String> Staff = new HashMap<>(); // Creating Map for each member of the staff
        Staff.put(1, "Gbolahan Fatunde");
        Staff.put(2, "Adedamola Babatunde");
        Staff.put(3, "Praise Akobundu");
        Staff.put(4, "Smart Agbawo");
        Staff.put(5, "Chioma Nwadozie");
        Staff.put(6, "Sodeeq Taiwo");
        Staff.put(7, "Collins Eze");
        Staff.put(8, "Delight Emmanuel");
        Staff.put(9, "Adewale Favour");
        Staff.put(10, "Hammed Mudashir");
        Staff.put(11, "Thompson Idowu");
        Staff.put(12, "Ekwugha Elochukwu");
        Staff.put(13, "Salako Akinbolade");
        Staff.put(14, "Ichebadu Chukwu");
        Staff.put(15, "Ajah Kenneth");
        Staff.put(16, "Onakoya Kayode");
        Staff.put(17, "Jennifer Ewuzie");
        Staff.put(18, "Miracle Shaibu");
        Staff.put(19, "Christian Aka");
        Staff.put(20, "Amietubodie Otonye ");

        Map<Integer, String> Interns = new HashMap<>(); // creating a map for each interns

        Interns.put(21, "Praise Adepoju");
        Interns.put(22, "Nweze Isabella");
        Interns.put(23, "Anthony Obinugwu");
        Interns.put(24, "Ikeyi Ijeamaka");

        List<String> days = new ArrayList<>(); // creating a List for each day of the week
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");

        Map<Integer, String> corpers = new HashMap<>();
        corpers.put(25, "Siyaka Promise");
        corpers.put(26, "Kanu Kennedy");
        corpers.put(27, "Godspower Amun");

        List<String> nyscSet2 = new ArrayList<>(); // creating a List for each day of the week for every other corper
        nyscSet2.add("Monday");
        nyscSet2.add("Wednesday");
        nyscSet2.add("Tuesday");
        nyscSet2.add("Friday");

        Map<Integer, String> john = new HashMap<>();
        john.put(28, "John Ozeigbe");

        List<String> nyscSet1 = new ArrayList<>();
        nyscSet1.add("Monday");
        nyscSet1.add("Wednesday");
        nyscSet1.add("Thursday");
        nyscSet1.add("Friday");

        function.StaffAssign(Staff, (ArrayList<String>) days); // Calling the function of staff
        System.out.println();
        function.InternAssign(Interns, (ArrayList<String>) days); // Calling the function of interns
        System.out.println();
        function.assignJohn(john, (ArrayList<String>) nyscSet1);
        function.assignCorpers(corpers, (ArrayList<String>) nyscSet2);
        System.out.println();

        Scanner scanner = new Scanner(System.in); // Initialising scanner for choice input
        System.out.println("1. Add new staff member");
        System.out.println("2. Add new intern");
        System.out.println("3. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) { // Created
            case 1:
                function.addStaffMember((HashMap<Integer, String>) Staff, (ArrayList<String>) days);
                break;
            case 2:
                function.addNewIntern((HashMap<Integer, String>) Interns, (ArrayList<String>) days);
                break;
            case 3:
                System.out.println("Thank you for giving us work, Goodbye!");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}

