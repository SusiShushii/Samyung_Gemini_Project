package th.ac.mahidol.ict;
public class User {
    // Attributes
    public int userID;
    private String username;
    private String password;
    private String roles;
    private int accessLevel;

    // Constructor
    public User(int userID, String username, String password, String roles, int accessLevel) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.accessLevel = accessLevel;
    }

    // Operations

    private boolean login(String username, String password) {
        return true;
    }

    private void logout() {

    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public int getAccessLevel() {
        return this.accessLevel;
    }
}
