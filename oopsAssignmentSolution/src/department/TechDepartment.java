package department;

/**
 * Below class contains information related to Technical department. 
 * @author krishnendra
 *
 */
public class TechDepartment extends SuperDepartment {
	

	public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "core Java";
	}
	
  }
