import java.util.Scanner;
class Fibinoci{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to find the fibinoci");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int fib=0;
		for(int i=1; i<num; i++)
		{
			fib=a+b;
			a=b;
			b=fib;
			//System.out.println("FIBINOCI OF IS="+fib);
		}
		System.out.println("FIBINOCI OF "+num+" IS="+fib);
	}
}
