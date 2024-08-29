
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Functions { // Created an interface to handle functions class
    void StaffAssign(List<Staff> StaffList, List<String> workdays);

    void InternAssign(List<Staff> StaffList, List<String> days);

    void addStaffMember(DBWriting writer);

    //void addNewIntern(List<Staff> StaffList, List<String> workdays);

}
