import java.util.HashMap;
import java.util.Map;

public class Staffdata {
    Staff person = new Staff();
    // person.setFirstname(rs.getString);
    Map<Integer, String> staff = new HashMap<>(); // Creating Map for each member of the staff
        public Map<Integer, String> getStaffDetails(){
            staff.put(1, "Amietubodie Otonye ");
            staff.put(2, "Adedamola Babatunde");
            staff.put(3, "Praise Akobundu");
            staff.put(4, "Smart Agbawo");
            staff.put(5, "Chioma Nwadozie");
            staff.put(6, "Sodeeq Taiwo");
            staff.put(7, "Collins Eze");
            staff.put(8, "Delight Emmanuel");
            staff.put(9, "Adewale Favour");
            staff.put(10, "Hammed Mudashir");
            staff.put(11, "Thompson Idowu");
            staff.put(12, "Ekwugha Elochukwu");
            staff.put(13, "Salako Akinbolade");
            staff.put(14, "Ichebadu Chukwu");
            staff.put(15, "Ajah Kenneth");
            staff.put(16, "Onakoya Kayode");
            staff.put(17, "Jennifer Ewuzie");
            staff.put(18, "Miracle Shaibu");
            staff.put(19, "Christian Aka");
            return staff;
        }
}
