public class Comment extends Submission {

    String type = "CUSTOMER COMMENT";

    Comment(int submissionId, int submissionCustomerId, String submissionText, Date submissionDate) {

        super(submissionId, submissionCustomerId, submissionText, submissionDate);
    }

    @Override
    public boolean isAssigned() {
        return true;
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
}
