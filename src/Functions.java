
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Functions { // Created an interface to handle functions class

    //you might have to combine the functionality of staff assign and intern assign for reusability
    void StaffAssign(List<Staff> StaffList, List<String> workdays);

    void InternAssign(List<Staff> StaffList, List<String> days);

    void addStaffMember(DBWriting writer);



}
