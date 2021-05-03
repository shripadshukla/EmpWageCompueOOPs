package empWageCompue;

public class EmpWageCompute {
	
	int Full_time_employee;					//declaring all variables
	int Part_time_employee;
	int Full_time_Wage;
	int Full_time_Hour;
	int Part_time_Hour;
	
	// Total working days for a month
	int Working_days;
	int n;
	int d;
	
	public EmpWageCompute() {        	// Making constructor which helps to not create object again and again
		
		Full_time_employee = 1;					// assign values in the constructor 
		Part_time_employee = 2;
		Full_time_Wage = 20;
		Full_time_Hour = 8;
		Part_time_Hour = 4;
		Working_days = 20;
		n = 100;
		d = 20;
	}
	
	public static void main(String []args) {
	
		EmpWageCompute UC6 = new EmpWageCompute();		//object created
		
			for(int i=1; i<=(UC6.n); i++) {
			
			for (int j=1; j<=(UC6.d); j++) {
				
				double Emp_Wage1 = (j * UC6.Full_time_Wage * i);
				double Emp_Wage2 = (j * UC6.Full_time_Wage/2 * i);
				
				System.out.println("Full Time Employee Wage for a month is = " +Emp_Wage1 );
				System.out.println("Part Time Employee Wage for a month is = " +Emp_Wage2 );
				
			}
		}
	}
}