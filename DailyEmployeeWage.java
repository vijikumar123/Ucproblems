package employeewagecomputation;

public class DailyEmployeeWage {
	
	public static void main(String[] args) {
		
		final int FULL_TIME = 1;
		final int WAGE_PER_HR =20;
		
		int empCheck = (int)(Math.random() * 100)%2 ;
		int workingHours = 0;
		if (empCheck ==FULL_TIME) {
			
			System.out.println("Employee is present");
			
			workingHours =8;
			
		} else {
			
			System.out.println("Employee is absent");
		}
		int wage = workingHours * WAGE_PER_HR;
		
		System.out.println("Employee Daily Wage is   " + wage);
	}

}
