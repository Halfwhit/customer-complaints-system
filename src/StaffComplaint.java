public class StaffComplaint extends Complaint {

    private int complaintStaffId;
    String type = "STAFF COMPLAINT";

    StaffComplaint(int submissionId, int submissionCustomerId, String submissionText, int complaintStaffId, Date submissionDate) {

        super(submissionId, submissionCustomerId, submissionText, submissionDate);

        this.complaintStaffId = complaintStaffId;
    }

    public int getComplaintStaffId() {
        return complaintStaffId;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
