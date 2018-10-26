public class TestDrive {

    public static void main(String[] args) {
        doTest();
    }

    public static void doTest() {

        CCSImplementation CCS = new CCSImplementation();

        Date date0 = new Date(19,11,2006);
        Date date1 = new Date(13, 5, 2012);
        Date date2 = new Date(21, 4, 2016);

        CCS.addStaff(CCS.getNewStaffId(), "Tester", "Cleaner", "Housekeeping");

        CCS.addGeneralComplaint(CCS.getNewSubmissionId(), CCS.getNewCustomerId(), "Exercise room was dirty", date2);
        CCS.addLiftComplaint(CCS.getNewSubmissionId(), CCS.getNewCustomerId(), "Lift call button broken", "North lifts", 6, date1);
        CCS.addStaffComplaint(CCS.getNewSubmissionId(), CCS.getNewCustomerId(), "Room cleaner entered without knocking", 1, date0);

        System.out.println(CCS.getUnassignedComplaintsList() + "\n");
        System.out.println(CCS.getStaffList());
    }
}
