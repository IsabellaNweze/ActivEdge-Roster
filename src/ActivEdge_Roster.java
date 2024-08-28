
import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ActivEdge_Roster {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  {
        DBWriting write =  new DBWriting();
        write.createConnection();
        write.writeToDatabase();
        write.readFromDatabase();


        Functions function = new Functions_Impl();
        //DBwriting list = new DBwriting();
        List<String> workdays = new ArrayList<>();
        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

       // System.out.println(write.StaffList);

        function.StaffAssign(write.StaffList, workdays);
        function.InternAssign(write.StaffList, workdays);
         System.out.println("Do you want to enter a new staff member to the database");
         String answer = scanner.nextLine();
         if (answer.equalsIgnoreCase("YES")){

             function.addStaffMember(write);
         }
         else{
             System.out.println("Okay goodbye");
             System.exit(1);
         }


        write.closeConnection();


    }
}

