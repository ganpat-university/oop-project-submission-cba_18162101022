import java.util.*;

public class Payroll_Management_system {

	static String[][] Employee = new String[5][7];
	static Scanner sc=new Scanner(System.in);

	public static void Welcome()
	{
		System.out.println("====================================================");
		System.out.println("              PAYROLL MANAGEMENT SYSTEM             ");
		System.out.println("====================================================");
	}

	public static void Init()
	{
		Employee[0][0]="001";
		Employee[1][0]="002";
		Employee[2][0]="003";
		Employee[3][0]="004";
		Employee[4][0]="005";

		Employee[0][1]="Russel Peters";
		Employee[1][1]="Kevin Ross";
		Employee[2][1]="Jessica Parker";
		Employee[3][1]="Neha Thakkar";
		Employee[4][1]="John Starinski";

		Employee[0][2]="Management";
		Employee[1][2]="Acounting";
		Employee[2][2]="Engineer";
		Employee[3][2]="Engineer";
		Employee[4][2]="Acounting";

	}

	public static int INandOut()
	{
		System.out.println("In time and out time entry");
		System.out.println("Enter the id of employee to update in time and out time (24 hour format):");
		String id=sc.next();
		for(int i=0; i<5; i++)
		{
			if(Employee[i][0].equals(id))
			{
				System.out.println("Enter in time(hh:mm) :");
				Employee[i][3]=sc.next();
				System.out.println(Employee[i][3]);
				System.out.println("Enter out time(hh:mm) :");
				Employee[i][4]=sc.next();
				return i;
			}
			/*else
				System.out.println("Employee data not found. Please check employee id...");
			*/
		}
		return 0;
	}

	public static void Salary(int m)
	{
		System.out.println("Calculating salary.....");
		//for(int i=0; i<5; i++)
		//{
			int rs=0;
			if(Employee[m][2].equals("Management"))
			{
				rs=500;
			}
			if(Employee[m][2].equals("Acounting"))
			{
				rs=400;
			}
			if(Employee[m][2].equals("Engineer"))
			{
				rs=200;
			}
			//Display();
			int in=Integer.parseInt(Employee[m][3].substring(0,2));
			int out=Integer.parseInt(Employee[m][4].substring(0,2));
			int sal=(out-in)*rs;
			Employee[m][5]=String.valueOf(sal);
			System.out.print("manush");
		//}
	}

	public static void Grade()
	{
		System.out.println("Calculating grade.....");
		for(int i=0; i<5; i++)
		{
			if(Employee[i][2].equals("Management"))
				Employee[i][6]="A";
			if(Employee[i][2].equals("Acounting"))
				Employee[i][6]="B";
			if(Employee[i][2].equals("Engineer"))
				Employee[i][6]="C";
		}
	}

	public static void Display()
	{
		System.out.println("====================================================");
		System.out.println("                    REPORT                          ");
		System.out.println("====================================================");
		System.out.println("ID\t Name\t\t Department\t InTime  OutTime Salary  Grade\t");
		for(int i=0;i<5; i++)
		{
			for(int j=0;j<7; j++)
			{
				System.out.print(Employee[i][j]+"\t ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		Welcome();
		Init();
		int choice=0;
		do
		{
		    //for(int i=0;i<=4;i++)
            //{
                   int m= INandOut();
            //}

		Salary(m);
		Grade();
		Display();
		System.out.println("Do you wish to enter more data?(enter 1)");
		choice=sc.nextInt();
		}while(choice==1);
	}

}
