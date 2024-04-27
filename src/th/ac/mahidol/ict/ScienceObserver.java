package th.ac.mahidol.ict;
public class ScienceObserver extends User {
    // Additional attribute
    private String name;

    // Constructor
    public ScienceObserver(String name, int userID, String username, String password, String roles, int accessLevel) {
        super(userID, username, password, roles, accessLevel);
        this.name = name;
    }

    // Operation
    public ScienceObserver(String name, User user) {
        super(user.userID, user.username, user.password, user.roles, user.accessLevel);
        this.name = name;
    }
}