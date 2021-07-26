package wages;

public class Employeewage {
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation program");
		int parttime=2,fulltime=1,wagehr=20,workingdays=20,maxhrs=100,dayhrs;
		int totalhr=0,totaldays=0;
		double emp=(Math.floor(Math.random()*10)%3);
		while(totalhr<maxhrs && totaldays<workingdays)
		{
			totaldays++;
			if (emp==fulltime)
				dayhrs=8;
			else if(emp==parttime)
				dayhrs=4;
			else
				dayhrs=0;
			totalhr=totalhr+dayhrs;
		}
		int wages = totalhr*wagehr;
		System.out.println("wage of a employee:" +wages);
	}

}
