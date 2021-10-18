import java.util.Scanner;
class PerfectNo{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no");
			int num=sc.nextInt();
			int perfectCheck=0;
			for (int i=1; i<num; i++){
				if(num%i==0){
					perfectCheck=perfectCheck+i;
					
				}
			}
			if(perfectCheck==num){
				System.out.println("PERFECT NUMBER");
			}
			else
				System.out.println("NOT A PERFECT NUMBER");
	}
}
