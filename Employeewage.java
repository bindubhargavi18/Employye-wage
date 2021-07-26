package wages;

public class Employeewage {
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation program");
		int parttime=2,fulltime=1,wagehr=20,dayhrs=8,dailywage,parthr=8,workingdays=20,monthwage;
		double emp=(Math.floor(Math.random()*10)%3);
		if (emp==fulltime)
		{
			dailywage=dayhrs*wagehr;
			monthwage=workingdays*dailywage;
			System.out.println("employee wages per month:" +monthwage);
			
		}
		else if(emp==parttime)
		{
			dailywage=parthr*wagehr;
			monthwage=workingdays*dailywage;
			System.out.println("part time employee wage per month:" +monthwage);
		}
		else
		{
			System.out.println("employee is absent and salary for will be 0");
		}
	}

}
