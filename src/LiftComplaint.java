public class LiftComplaint extends Complaint {

    private String liftName;
    private int liftFloor;
    String type = "Lift";

    LiftComplaint(int submissionId, int submissionCustomerId, String submissionText, String liftName, int liftFloor, Date submissionDate) {

        super(submissionId, submissionCustomerId, submissionText, submissionDate);

        this.liftName = liftName;
        this.liftFloor = liftFloor;
    }

    public String getLiftName() {
        return liftName;
    }

    public int getLiftFloor() {
        return liftFloor;
    }
}
