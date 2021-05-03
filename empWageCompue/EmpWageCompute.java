package empWageCompue;

public class EmpWageCompute {
	
	int Employee;						//declaring all variables
	int Full_time_Wage;
	int Full_time_Hour;
	int Part_time_Hour;
	
	// Total working days for a month
	int Working_days;
	
	public EmpWageCompute() {        	// Making constructor which helps to not create object again and again
		
		Employee = 1;					// assign values in the constructor 
		Full_time_Wage = 20;			
		Full_time_Hour = 8;
		Part_time_Hour = 4;
		
		Working_days = 20;
		
	}
	
	public static void main(String []args) {
	
		EmpWageCompute UC4 = new EmpWageCompute();		//object created
		
		switch (UC4.Employee) {								//now calling object reference
		
		case 1:
			System.out.println("Employee is Full Time Present");
			
			double Emp_Wage1 = (UC4.Working_days * UC4.Full_time_Wage * UC4.Full_time_Hour);
			System.out.println("Full Time Employee Wage for a month is = " +Emp_Wage1 );
		
		default:
			System.out.println("Employee is Part Time Present");
			
			double Emp_Wage2 = (UC4.Working_days * UC4.Full_time_Wage * UC4.Part_time_Hour);
			System.out.println("Part Time Employee Wage for a month is = " +Emp_Wage2);	
	
		}
	}
}