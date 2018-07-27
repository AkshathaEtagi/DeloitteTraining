import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		if (n>2) {
			
			System.out.print("Enter the elements of the array");
			for(int i=0;i<n;i++)
			{
				array[i]=sc.nextInt();
			}
			boolean val= Triplets.findTrip(array);		
				if(val)
					System.out.println("TRUE");
				else
					System.out.println("FALSE");
		}
		else if (n<3)
		{
			System.out.println("Please enter a size greater than or equal to 3");
		}
		sc.close();
	}

}
