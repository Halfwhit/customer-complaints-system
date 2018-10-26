public abstract class Submission {

    int submissionId;
    int submissionCustomerId;
    String submissionText;
    Date submissionDate;
    boolean assigned;

    Submission(int submissionId, int submissionCustomerId, String submissionText, Date submissionDate) {

        this.submissionId = submissionId;
        this.submissionCustomerId = submissionCustomerId;
        this.submissionText = submissionText;
        this.submissionDate = submissionDate;
    }

    public int getSubmissionId() {
        return submissionId;
    }

    public int getSubmissionCustomerId() {
        return submissionCustomerId;
    }

    public String getSubmissionText() {
        return submissionText;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    abstract public boolean isAssigned();

    @Override
    public String toString() {
        return new String("SUBMISSION ID: " + submissionId + " : " + submissionText + "\nMade by: " + submissionCustomerId + " on the " + submissionDate + "\n");
    }
}
