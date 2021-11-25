package department;

/**
 * Below class contains information related to HR department. 
 * @author krishnendra
 *
 */
public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		return "Hr Department";
	}

	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}
}
