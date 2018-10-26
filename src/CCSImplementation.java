import java.lang.reflect.Array;
import java.util.*;

public class CCSImplementation implements CCS {

    private static int NEXT_SUBMISSION_ID = 1;
    private static int NEXT_CUSTOMER_ID = 1;
    private static int NEXT_STAFF_ID = 1;

    HashMap<Integer, Customer> customerHashMap;
    HashMap<Integer, Staff> staffHashMap;
    HashMap<Integer, Submission> submissionHashMap;

    public CCSImplementation(){

        customerHashMap = new HashMap<Integer, Customer>();
        staffHashMap = new HashMap<Integer, Staff>();
        submissionHashMap = new HashMap<Integer, Submission>();
    }

    public void addComment(int submissionId, int customerId, String comment, Date date) {

        Comment commentl = new Comment(submissionId, customerId, comment, date);
        submissionHashMap.put(submissionId, commentl);
    }

    public void addCustomer(int customerId, String name, String address, String email, String phone) {

        Customer customer = new Customer(customerId, name, address, email, phone);
        customerHashMap.put(customerId, customer);
    }

    public void addGeneralComplaint(int submissionId, int customerId, String description, Date date) {

        Complaint complaint = new Complaint(submissionId, customerId, description, date);
        submissionHashMap.put(submissionId, complaint);
    }

    public void addLiftComplaint(int submissionId, int customerId, String description, String lift, int floor, Date date) {

        LiftComplaint complaint = new LiftComplaint(submissionId, customerId, description, lift, floor, date);
        submissionHashMap.put(submissionId, complaint);
    }

    public void addStaff(int staffId, String name, String role, String department) {

        Staff staff = new Staff(staffId, name, role, department);
        staffHashMap.put(staffId, staff);
    }

    public void addStaffComplaint(int submissionId, int customerId, String description, int staffId, Date date) {

        StaffComplaint complaint = new StaffComplaint(submissionId, customerId, description, staffId, date);
        submissionHashMap.put(submissionId, complaint);
    }

    public void archiveSubmissions() {

        List<Submission> submissions = getSubmissionList();

        for (Submission submission : submissions)
            if (submission.isAssigned())
                this.submissionHashMap.remove(submission.getSubmissionId());
    }

    public void assignResolver(int complaintId, int staffId, Date deadline) {

        Complaint complaint = (Complaint) getSubmission(complaintId);
        complaint.setAssignedStaff(staffId);
        complaint.setDeadline(deadline);
        complaint.setAssigned(true);
    }

    public List<Action> getActionsForComplaint(int complaintId) {

        return null;
    }

    public Customer getCustomer(int customerId) {

        return customerHashMap.get(customerId);
    }

    public List<Customer> getCustomerList() {

        return new ArrayList<Customer>(customerHashMap.values());
    }

    public int getNewCustomerId() {

        return NEXT_CUSTOMER_ID++;
    }

    public int getNewStaffId() {

        return NEXT_STAFF_ID++;
    }

    public int getNewSubmissionId() {

        return NEXT_SUBMISSION_ID++;
    }

    public Staff getStaff(int staffId) {

        return staffHashMap.get(staffId);
    }

    public List<Staff> getStaffList() {

        return new ArrayList<Staff>(staffHashMap.values());
    }
    
    public Submission getSubmission(int submissionId) {

        return submissionHashMap.get(submissionId);
    }
    
    public List<Submission> getSubmissionList() {

        return new ArrayList<Submission>(submissionHashMap.values());
    }
    
    public void recordAction(int complaintId, String actionTaken, Date date) {

        Complaint complaint = (Complaint) getSubmission(complaintId);
        Action action = new Action(actionTaken, date);

        complaint.addAction(action);
    }
    
    public void recordComplaintResolved(int complaintId) {

        Complaint complaint = (Complaint) getSubmission(complaintId);
        complaint.setResolved(true);
    }
    
    public void removeCustomer(int customerId) {

        customerHashMap.remove(customerId);
    }

    public List<Complaint> getUnassignedComplaintsList() {

        ArrayList<Complaint> unresolved = new ArrayList<Complaint>();

        ArrayList<Submission> submissions = new ArrayList<Submission>(submissionHashMap.values());

        for (Submission submission : submissions) {
            if (!submission.isAssigned()) {
                unresolved.add((Complaint) submission);
            }
        }

        unresolved.sort(Comparator.comparing(Complaint::getSubmissionDate));
        return unresolved;
    }
}