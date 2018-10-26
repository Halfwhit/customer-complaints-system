public class StaffComplaint extends Complaint {

    int complaintStaffId;

    StaffComplaint(int submissionId, int submissionCustomerId, String submissionText, int complaintStaffId, Date submissionDate) {

        super(submissionId, submissionCustomerId, submissionText, submissionDate);

        this.complaintStaffId = complaintStaffId;
    }
}
