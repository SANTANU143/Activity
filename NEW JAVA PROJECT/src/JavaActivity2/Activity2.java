package JavaActivity2;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
    int [] ArraY= {10, 77, 10, 54, -11, 10};
    System.out.println("Origional Array: "+Arrays.toString(ArraY));
    int Num=10;
    int Sum=30;
    System.out.println("Result: " +result(ArraY, Num, Sum));
    }
	private static boolean result(int[] numbers, int Num, int Sum) 
	{
		int Initial_Sum=0;
		for(int number: numbers) 
		{
			if(number==Num)
			{
				Initial_Sum +=Num;
				//Initial_Sum=Initial_Sum + Num;
				if(Initial_Sum>Sum)
				{
					break;
				}
			}
				return Initial_Sum==Sum;
		}
		
		return true;
	}
	

}
