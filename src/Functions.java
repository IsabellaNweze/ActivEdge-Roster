import java.util.ArrayList;
import java.util.Map;

public interface Functions {
    public void  StaffAssign(Map<Integer,String> map, ArrayList<String> workdays);
    public void InternAssign(Map<Integer,String> map,ArrayList<String> days);

    public String RandomDays(ArrayList<String>days);

}
