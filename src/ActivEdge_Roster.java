
import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ActivEdge_Roster {
    public static void main(String[] args)  {

        Functions function = new Functions_Impl();
    DBwriting list = new DBwriting();
        List<String> workdays = new ArrayList<>();
        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        function.StaffAssign(list.StaffList, (ArrayList<String>) workdays);
        function.InternAssign(list.StaffList, (ArrayList<String>) workdays);


    }
}

