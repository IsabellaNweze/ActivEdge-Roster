
public class Staff {
    private int id;
    private String firstname;
    private String lastname;
    private Roles role;

    public Staff(int id, String firstname, String lastname, Roles role) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
    }

    public Staff() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}



