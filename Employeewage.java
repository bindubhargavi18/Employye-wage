package wages;

public class Employeewage {
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation program");
		int wagehr=20,dayhrs=8,dailywage,parthr=8;
		int emp=(int) (Math.floor(Math.random()*10)%3);
		switch(emp)
		{
		case 1:
			dailywage=wagehr*dayhrs;
			System.out.println("employee daily wage:" +dailywage);
			break;
		case 2:
			dailywage=wagehr*parthr;
			System.out.println("part time empoyee wage:" +dailywage);
			break;
		default:
			System.out.println("employee is absent and salary will be 0");
		}
	}

}
