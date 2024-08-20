import java.util.HashMap;
import java.util.Map;

public class Corperdata {
    Staff person = new Staff();
    // person.setFirstname(rs.getString);
    Map<Integer, String> Corpers = new HashMap<>(); // Creating Map for each member of the staff
    public Map<Integer, String> getCorpersDetails(){

        Corpers.put(24, "Siyaka Promise");
        Corpers.put(25, "Kanu Kennedy");
        Corpers.put(26, "Ozeigbe John");
        Corpers.put(27, "Godspower Amun");

        return Corpers;
    }
}
