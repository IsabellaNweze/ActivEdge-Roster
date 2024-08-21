
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Functions { // Created an interface to handle functions class
    void StaffAssign(Map<Integer, String> map, ArrayList<String> workdays);

    void InternAssign(Map<Integer, String> map, ArrayList<String> days);

    void addStaffMember(HashMap<Integer, String> Staff, ArrayList<String> workdays);

    void addNewIntern(HashMap<Integer, String> Staff, ArrayList<String> workdays);

    void mapStaffRoles(HashMap<Integer, String> staffMap, HashMap<Integer, String> corperMap, HashMap<Integer, String> internMap);
}
