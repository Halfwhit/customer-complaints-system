import java.util.ArrayList;

public class Complaint extends Submission {

    private boolean assigned;
    private int assignedStaff;
    private Date deadline;
    private String type = "Generic";

    private ArrayList<Action> actions = new ArrayList<Action>();
    private boolean resolved;

    Complaint(int submissionId, int submissionCustomerId, String submissionText, Date submissionDate) {

        super(submissionId, submissionCustomerId, submissionText, submissionDate);

        assigned = false;
    }

    public void setAssignedStaff(int assignedStaff) {
        this.assignedStaff = assignedStaff;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public boolean isAssigned() {
        return assigned;
    }

    @Override
    public int getStaffId() {
        return 0;
    }

    @Override
    public String getLiftName() {
        return null;
    }

    @Override
    public int getLiftFloor() {
        return 0;
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    public void addAction(Action action) {
        actions.add(action);
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
}
