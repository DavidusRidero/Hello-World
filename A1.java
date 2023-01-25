import java.util.Scanner;
public class A1 {
    public static void main(String args[])
	{
		int f1,i1;
		Scanner s=new Scanner(System.in);
		System.out.println("Input height in feet and inches: ");
		f1=s.nextInt();i1=s.nextInt();
		if(i1>=12)
		{f1+=1;i1-=12;}
		
		if(f1<=5&&i1<=3)
			System.out.println("You are Short.");
		else if(f1==5&&i1<=11)
			System.out.println("You are Medium.");
		else
			System.out.println("You are Tall.");
		
		int f2,i2;
		System.out.println("Input height in feet and inches: ");
		f2=s.nextInt();i2=s.nextInt();
		if(i2>=12)
		{f2+=1;i2-=12;}
		
		if(f2<=5&&i2<=3)
			System.out.println("You are Short.");
		else if(f2==5&&i2<=11)
			System.out.println("You are Medium.");
		else
			System.out.println("You are Tall.");
		
		if (f1>f2)
			System.out.println("Person #1 is taller than #2");
		else if (f1<f2)
			System.out.println("Person #2 is taller than #1");
		else 
		{
			if(i1>i2)
				System.out.println("Person #1 is taller than #2");
			else if(i1<i2)
				System.out.println("Person #2 is taller than #1");
			else
				System.out.println("Person #1 is of same height as #2");
		}
	}
}
