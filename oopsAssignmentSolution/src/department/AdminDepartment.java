package department;

/**
 * Below class contains information related to admin department. 
 * @author krishnendra
 *
 */
public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

}
