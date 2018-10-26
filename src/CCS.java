import java.util.List;

public interface CCS {

    // Add a comment
    abstract void addComment(int submissionId, int customerId, String comment, Date date);

    //Add a customer
    abstract void addCustomer(int customerId, String name, String address, String email, String phone);

    //Add a general complaint
    abstract void addGeneralComplaint(int submissionId, int customerId, String description, Date date);

    //Add a lift complaint
    abstract void addLiftComplaint(int submissionId, int customerId, String description, String lift, int floor, Date date);

    //Add a staff member
    abstract void addStaff(int staffId, String name, String role, String department);

    //Add a staff complaint
    abstract void addStaffComplaint(int submissionId, int customerId, String description, int staffId, Date date);

    //Archive Submissions
    abstract void archiveSubmissions();

    //Assign resolver
    abstract void assignResolver(int complaintId, int staffId, Date deadLine);

    //Get actions listed for a complaint
    abstract List<Action> getActionsForComplaint(int complaintId);

    //Get a customer object
    abstract Customer getCustomer(int customerId);

    //Get a list of customers
    abstract List<Customer> getCustomerList();

    abstract int getNewCustomerId();

    abstract int getNewStaffId();

    abstract int getNewSubmissionId();

    abstract Staff getStaff(int staffId);

    abstract List<Staff> getStaffList();

    abstract Submission getSubmission(int submissionId);

    abstract List<Submission> getSubmissionList();

    abstract void recordAction(int complaintId, String actionTaken, Date date);

    abstract void recordComplaintResolved(int complaintId);

    abstract void removeCustomer(int customerId);
}
