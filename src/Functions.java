
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Functions { // Created an interface to handle functions class
    public void  StaffAssign(Map<Integer,String> map, ArrayList<String> workdays);
    public void InternAssign(Map<Integer,String> map,ArrayList<String> days);
    public void addStaffMember(HashMap<Integer, String> Staff, ArrayList<String> workdays);
    public void addNewIntern(HashMap<Integer, String> Staff, ArrayList<String> workdays);
    public void assignJohn(Map<Integer, String> john, ArrayList<String> nyscSet1);
    public void assignCorpers(Map<Integer, String> corpers, ArrayList<String> nyscSet2);
}
