package th.ac.mahidol.ict;
public class ObservingProgram {
    // Attributes
    private int planNo;
    private boolean validationStatus;

    // Constructor
    public ObservingProgram(int planNo, boolean validationStatus) {
        this.planNo = planNo;
        this.validationStatus = validationStatus;
    }

    // Operations
    public int getPlanNo() {
        return planNo;
    }

    public void setPlanNo(int planNo) {
        this.planNo = planNo;
    }

    public boolean getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(boolean validationStatus) {
        this.validationStatus = validationStatus;
    }
}
