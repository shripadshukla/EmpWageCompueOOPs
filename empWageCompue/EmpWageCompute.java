package empWageCompue;

public class EmpWageCompute {
	
	public static void Earning() {
		
		int Full_time_Employee = 1;
		int Part_time_Employee = 2;
		int Wage_Per_Hour = 20;
		int Full_day_Hour = 8;
		int Part_time_Hour =4;

			
				double Full_time_EmpdailyWage = (Wage_Per_Hour * Full_day_Hour);
		
				double Part_time_EmpdailyWage = (Wage_Per_Hour * Part_time_Hour);
			
				System.out.println("Full Time Employee daily wage is = "+Full_time_EmpdailyWage);
	
				System.out.println("Part Time Employee daily wage is = "+ Part_time_EmpdailyWage);
		
				}
					public static void main(String[] args) {
		
						Earning();		

			}	
}