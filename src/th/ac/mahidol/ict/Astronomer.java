package th.ac.mahidol.ict;
import java.util.ArrayList;
import java.util.List;

import edu.gemini.app.ocs.example.MySciencePlan;
public class Astronomer extends User {
    private String name;
    private List<MySciencePlan> sciencePlans;

    // Constructor
    public Astronomer(String name, int userID, String username, String password, String roles, int accessLevel) {
        super(userID, username, password, roles, accessLevel);
        this.name = name;
        this.sciencePlans = new ArrayList<>();
    }

    // Operation
    public Astronomer(String name, User user) {
        super(user.userID, user.username, user.password, user.roles, user.accessLevel);
        this.name = name;
        this.sciencePlans = new ArrayList<>();
        MySciencePlan mySP = new MySciencePlan();
    }

    public void addSciencePlan(MySciencePlan plan) {
        sciencePlans.add(plan);
    }

    public void removeSciencePlan(MySciencePlan plan) {
        sciencePlans.remove(plan);
    }

    public List<MySciencePlan> getSciencePlans() {
        return sciencePlans;
    }
}