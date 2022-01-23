/** 
  use Ditui to achieve Fib
 */
import java.util.Scanner; 
public class Fib{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please input an integer.");
		if(scan.hasNextInt()){
			int inp=scan.nextInt();
			System.out.println("The nth number of Fib is"+Calculate(inp));
		}
		scan.close();
	}
	public static int Calculate(int n){
		if(n==1 || n==2){
			return n-1;
		}
		int n1=0, n2=1,sum=0;
		for(int i=0;i<n-2;i++){
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		return sum;
	}
}
