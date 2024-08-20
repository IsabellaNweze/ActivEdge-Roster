
import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ActivEdge_Roster {
    public static void main(String[] args)  {

        Functions function = new Functions_Impl(); // Assigning the functions_impl (Functions implementation) class to a new name called functions
        Staff person = new Staff();
       // person.setFirstname(rs.getString);
        Map<Integer, String> staff = new HashMap<>(); // Creating Map for each member of the staff
//        Staff.put(1, "Gbolahan Fatunde");
//        Staff.put(2, "Adedamola Babatunde");
//        Staff.put(3, "Praise Akobundu");
//        Staff.put(4, "Smart Agbawo");
//        Staff.put(5, "Chioma Nwadozie");
//        Staff.put(6, "Sodeeq Taiwo");
//        Staff.put(7, "Collins Eze");
//        Staff.put(8, "Delight Emmanuel");
//        Staff.put(9, "Adewale Favour");
//        Staff.put(10, "Hammed Mudashir");
//        Staff.put(11, "Thompson Idowu");
//        Staff.put(12, "Ekwugha Elochukwu");
//        Staff.put(13, "Salako Akinbolade");
//        Staff.put(14, "Ichebadu Chukwu");
//        Staff.put(15, "Ajah Kenneth");
//        Staff.put(16, "Onakoya Kayode");
//        Staff.put(17, "Jennifer Ewuzie");
//        Staff.put(18, "Miracle Shaibu");
//        Staff.put(19, "Christian Aka");
//        Staff.put(20, "Amietubodie Otonye ");

        Map<Integer, String> Interns = new HashMap<>(); // creating a map for each intern

        Interns.put(21, "Siyaka Promise");
        Interns.put(22, "Kanu Kennedy");
        Interns.put(23, "Godspower Amun");
        Interns.put(24, "Praise Adepoju");
        Interns.put(25, "Nweze Isabella");
        Interns.put(26, "John Ozeigbe");
        Interns.put(27, "Anthony Obinugwu");
        Interns.put(28, "Ikeyi Ijeamaka");

        List<String> days = new ArrayList<>(); // creating a List for each day of the week
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");

        function.StaffAssign(staff, (ArrayList<String>) days); // Calling the function of staff
        function.InternAssign(Interns, (ArrayList<String>) days); // Calling the function of interns

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add new staff member");
        System.out.println("2. Add new intern");
        System.out.println("3. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                function.addStaffMember((HashMap<Integer, String>) staff, (ArrayList<String>) days);
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

