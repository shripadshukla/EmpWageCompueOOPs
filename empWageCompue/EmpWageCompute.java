package empWageCompue;

public class EmpWageCompute {
	
		static void mymethod (int Full_time_employee, int Part_time_employee, int Full_time_Wage,
				int Full_time_Hour, int Part_time_Hour, int Working_days,  int n , int d ) {

				for(int i=1; i<=n; i++) {

						for (int j=1; j<=d; j++) {

								double Emp_Wage1 = (j * Full_time_Wage * i);
								double Emp_Wage2 = (j * Full_time_Wage/2 * i);

								System.out.println("Full Time Employee Wage for a month is = " +Emp_Wage1 );
								System.out.println("Part Time Employee Wage for a month is = " +Emp_Wage2 );
						}
				}
		}	

		public static void main(String []args) {

			mymethod(1, 2, 20, 8, 4, 20, 100, 20);		//object created
	
		}
}