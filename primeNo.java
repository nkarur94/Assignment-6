import java.util.Scanner;
class primeNo{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no");
			int num=sc.nextInt();
			int temp=0;
			for (int i=2; i<num; i++){
				if(num%i==0){
					temp=temp+1;
					}
			}
			if(temp>0){
				System.out.println("NOT PRIME");
			}
			else
				System.out.println("GIVEN NUMBER IS A PRIME");
	}
}
