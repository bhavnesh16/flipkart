package testgit;

public class test14 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a={10,40,50,30,20};
		int max=a[0];
		for (int i=1;i<=a.length;i++)
		{
				if(a[1]>max)
				{
					 max = a[i];	
				}	
		}
		System.out.println("From The Array Element Largest Number is:" + max);
		String aa="this is world";
		String  b=" ";
		//String a1[]=aa.split("");
		for(int i=aa.length()-1;i>=0;i--)
		{ 
			b=b+aa.charAt(i);
			
		}
		System.out.println(b);
		String [] aq=aa.split(" ");
		char[] try1=aa.toCharArray();
		for(int i=try1.length-1;i>=0;i--)
		{
			System.out.print(try1[i]);
		}
		for(int i=0;i<=aq.length;i++)
		{
			String reserved=aq[i];
			for(int j=reserved.length();j>=0;j--)
			{
				
			}
			
		}
	}
}