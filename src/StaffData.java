import java.util.ArrayList;
import java.util.List;

public class StaffData {
    private final List<Staff> staffs;
    public StaffData(){
                this.staffs = new ArrayList<>();
                staffs.add(new Staff(1, "Amietubodie ","Otonye",Roles.STAFF));
                staffs.add(new Staff(2, "Adedamola" ,"Babatunde",Roles.STAFF));
                staffs.add(new Staff(3, "Praise","Akobundu",Roles.STAFF));
                staffs.add(new Staff(4, "Smart"," Agbawo",Roles.STAFF));
                staffs.add(new Staff(5, "Chioma", "Nwadozie",Roles.STAFF));
                staffs.add(new Staff(6, "Sodeeq", " Taiwo",Roles.STAFF));
                staffs.add(new Staff(7, "Collins", "Eze",Roles.STAFF));
                staffs.add(new Staff(8, "Delight" ,"Emmanuel",Roles.STAFF));
                staffs.add(new Staff(9, "Adewale", "Favour",Roles.STAFF));
                staffs.add(new Staff(10, "Hammed", "Mudashir",Roles.STAFF));
                staffs.add(new Staff(11, "Thompson",  "Idowu",Roles.STAFF));
                staffs.add(new Staff(12, "Ekwugha" ," Elochukwu",Roles.STAFF));
                staffs.add(new Staff(13, "Salako"," Akinbolade",Roles.STAFF));
                staffs.add(new Staff(14, "Ichebadu", " Chukwu",Roles.STAFF));
                staffs.add(new Staff(15, "Ajah", " Kenneth",Roles.STAFF));
                staffs.add(new Staff(16, "Onakoya" ,"Kayode",Roles.STAFF));
                staffs.add(new Staff(17, "Jennifer", " Ewuzie",Roles.STAFF));
                staffs.add(new Staff(18, "Miracle",  "Shaibu",Roles.STAFF));
                staffs.add(new Staff(19, "Christian", " Aka",Roles.STAFF));
                staffs.add(new Staff(20, "Nweze ", "Isabella",Roles.INTERN));
                staffs.add(new Staff(21, "Ikeyi", " Ijeamaka",Roles.INTERN));
                staffs.add(new Staff(22, "Anthony"," Obinugwu",Roles.INTERN));
                staffs.add(new Staff(23, "Praise"," Adepoju",Roles.INTERN));
                staffs.add(new Staff(24, "Siyaka" ," Promise",Roles.CORPER));
                staffs.add(new Staff(25, "Kanu","Kennedy",Roles.CORPER));
                staffs.add(new Staff(26, "Ozeigbe", " John",Roles.CORPER));
                staffs.add(new Staff(27,  "Godspower", " Amun",Roles.CORPER));

        }

        public List<Staff> getStaffs() {
                return staffs;
        }
}
