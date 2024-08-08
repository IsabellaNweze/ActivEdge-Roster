import java.util.*;

public class Functions_Impl implements Functions {

    @Override
    public void StaffAssign(Map<Integer, String> map, ArrayList<String> workdays) {
        for (Integer key : map.keySet()) {
            Collections.shuffle(workdays);
            System.out.println(map.get(key) + " office days are " +  workdays.subList(0,2));
        }
    }

    @Override
    public void InternAssign(Map<Integer, String> map, ArrayList<String> days) {
        for (Integer key : map.keySet()) {
            Collections.shuffle(days);
            System.out.println(map.get(key) + " office days are " + days.subList(0,3) );
        }
    }




}
