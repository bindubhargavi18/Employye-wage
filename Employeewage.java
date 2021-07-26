package wages;

public class Employeewage {
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation program");
		int fulltime=1,wagehr=20,dayhrs=8,dailywage,parttime=2,parthr=8;
		double emp=Math.floor(Math.random()*10)%3;
		if (emp==fulltime)
		{
			System.out.println("employee is present");
			dailywage=wagehr*dayhrs;
			System.out.println("dailywage of employee is" +dailywage);
		}
		else if (emp==parttime)
		{
			System.out.println("employee is working as parttime");
			dailywage=wagehr*parthr;
			System.out.println("part time wage of employee is " +dailywage);
		}
		else
		{
			System.out.println("employee is absent");
			System.out.println("daily wage of emplyee is 0");
		}
	}

}
