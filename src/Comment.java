public class Comment extends Submission {

    Comment(int submissionId, int submissionCustomerId, String submissionText, Date submissionDate) {

        super(submissionId, submissionCustomerId, submissionText, submissionDate);
    }

    @Override
    public boolean isAssigned() {
        return true;
    }
}
