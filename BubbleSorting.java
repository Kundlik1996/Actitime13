
public class BubbleSorting
{
	public static void main(String[] args) 
	{
		int a[] = { 0, 9, 1, 15, 16, 12, 10, 13, 17, 14,11,21 };
		int n = a.length / 2;
		for (int i = 0; i < a.length - 1; i++) 
		{
			for (int j = 0; j < n; j++)
			{

				if (a[j] > a[j + 1])
				{
					int max = a[j];
					a[j] = a[j + 1];
					a[j + 1] = max;
				}
			}
		for (int k=n;k<a.length-1 ;k++ )
		{
			if (a[k] < a[k + 1])
				{
					int temp = a[k];
					a[k] = a[k + 1];
					a[k + 1] = temp;
				}
		}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + ",");
	}
  }
                                                                         
}
