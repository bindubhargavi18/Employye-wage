package wages;

public class Employeewage {
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation program");
		int fulltime=1;
		double emp=Math.floor(Math.random()*10)%2;
		if (emp==fulltime)
			System.out.println("employee is present");
		else
			System.out.println("employee is absent");
	}

}
