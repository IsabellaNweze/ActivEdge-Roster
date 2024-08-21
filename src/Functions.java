
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Functions { // Created an interface to handle functions class
    void StaffAssign(List<Staff> StaffList, ArrayList<String> workdays);

    void InternAssign(List<Staff> StaffList, ArrayList<String> days);

    void addStaffMember(List<Staff> StaffList, ArrayList<String> workdays);

    void addNewIntern(List<Staff> StaffList, ArrayList<String> workdays);


}
