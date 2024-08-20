import java.util.HashMap;
import java.util.Map;

public class Interndata {
    Staff person = new Staff();
    // person.setFirstname(rs.getString);
    Map<Integer, String> Interns = new HashMap<>(); // Creating Map for each member of the staff
    public Map<Integer, String> getInternDetails(){

        Interns.put(20, "Nweze Isabella");
        Interns.put(21, "Ikeyi Ijeamaka");
        Interns.put(22, "Anthony Obinugwu");
        Interns.put(23, "Praise Adepoju");

        return Interns;
    }
}
