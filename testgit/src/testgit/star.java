package testgit;

public class star {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       for(int i=0;i<=5;i++)
       {
    	   for(int j=0;j<=i;j++)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       for(int i=5;i>=1;i--)
       {
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       System.out.println();
	 for(int i=0;i<=5;i++)
     {
		 for(int k=5;k>i;k--)
		 {
			 System.out.print(" ");
		 }
		 //System.out.print("*");
  	  for(int j=0;j<=i*2;j++)
  	   {
  		   System.out.print("*");
  	   }
  	   System.out.println();
     }
	 for(int i=5;i>=1;i--)
	 {
	 for(int j=5;j>i;j--)
	 {
	 System.out.print(" ");
	 }
	 for(int k=1;k<(i*2);k++)
	 {
	 System.out.print("*");
	 }
	 System.out.println();
	 }
}
}