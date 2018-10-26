public class LiftComplaint extends Complaint {

    String liftName;
    int liftFloor;

    LiftComplaint(int submissionId, int submissionCustomerId, String submissionText, String liftName, int liftFloor, Date submissionDate) {

        super(submissionId, submissionCustomerId, submissionText, submissionDate);

        this.liftName = liftName;
        this.liftFloor = liftFloor;
    }
}
