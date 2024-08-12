import java.util.*;

public class Functions_Impl implements Functions {

    @Override
    public void StaffAssign(Map<Integer, String> map, ArrayList<String> workdays) {
        ArrayList<String> bucket = new ArrayList<>();
        ArrayList<String> weekdays = new ArrayList<>();
        for (Integer key : map.keySet()) {
            Collections.shuffle(workdays);
            bucket.addAll(workdays.subList(0,2));
            for (String day :weekdays){
                int count = Collections.frequency(bucket, day);
                if (count >= 8) {
                    workdays.remove(day);
                }
            }
            System.out.println(map.get(key) + " office days are " +  workdays.subList(0,2));
        }
    }

    @Override
    public void InternAssign(Map<Integer, String> map, ArrayList<String> days) {
        ArrayList<String> bucket1 = new ArrayList<>();
        ArrayList<String> Weekdays = new ArrayList<>();
        for (Integer key : map.keySet()) {
            Collections.shuffle(days);
            bucket1.addAll(days.subList(0,3));
            for (String day :Weekdays){
                int count = Collections.frequency(bucket1, day);
                if (count >= 4) {
                    days.remove(day);
                }
            }
            System.out.println(map.get(key) + " office days are " + days.subList(0,3) );
        }
    }




}
