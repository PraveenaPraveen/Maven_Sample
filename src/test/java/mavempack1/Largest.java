package mavempack1;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Laregest number is" +Large(22,15,6));
	  }
	public static int Large(int a,int b,int c)
    {
	      
       if(a>b && a>c)
         { 
	         return a;
			}
       else if (b>c)
         {
			   return b;
		   }
            else return c;
	  }


	}


