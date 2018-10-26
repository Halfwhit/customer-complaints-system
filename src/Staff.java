public class Staff {

    int staffId;
    String staffName;
    String staffDepartment;
    String staffRole;

    public Staff(int staffId, String staffName, String staffRole, String staffDepartment) {

        this.staffId = staffId;
        this.staffName = staffName;
        this.staffDepartment = staffDepartment;
        this.staffRole = staffRole;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getStaffDepartment() {
        return staffDepartment;
    }

    public String getStaffRole() {
        return staffRole;
    }

    @Override
    public String toString() {
        return new String("STAFF ID: " + staffId + "\nName: " + staffName + "\nDepartment: " + staffDepartment + "\nRole: " + staffRole + "\n");
    }
}
