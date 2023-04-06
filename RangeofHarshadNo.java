import java.util.Scanner;
class RangeofHarshadNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter starting Number : ");
		int start = sc.nextInt();

		System.out.print("Enter ending Number : ");
		int end= sc.nextInt();

		for(int i=start; i<=end; i++)
		{
			if(checkHarshadNo(i))
			{
				System.out.print(i + " ");
			}
		}
	}

	public static boolean checkHarshadNo(int num)
	{
		int sum = 0;
		int org = num;

		while(num > 0)
		{
			int rem = num % 10;
				sum = sum + rem;
				num = num/10;
		}

		if(org % sum == 0)
		{
			return true;
		}
		return false;
	}

}
