import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Functions_Impl implements Functions {

    Random random = new Random();


    @Override
    public void StaffAssign(Map<Integer, String> map, ArrayList<String> workdays) {
       // int RandomInt = 0;

        for( Integer key : map.keySet() ){
            //RandomInt =random.nextInt(workdays.size());
            System.out.println(map.get(key)+ "office days are"+ RandomDays(workdays)+" "+RandomDays(workdays));
        }
        //System.out.println(workdays.get(RandomInt));

    }

    @Override
    public void InternAssign(Map<Integer, String> map, ArrayList<String> days) {
        //int RandomInt = random.nextInt(days.size());
        for( Integer key : map.keySet() ){
            System.out.println(map.get(key)+ "office days are"+ RandomDays(days)+ " "+ RandomDays(days)+ " "+RandomDays(days));
        }
    }

    @Override
    public String RandomDays(ArrayList<String> days) {
        Random random = new Random();
        int randomIndex = random.nextInt(days.size());
        return days.get(randomIndex);

    }
}
