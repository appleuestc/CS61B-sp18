/** 
  use Digui to achieve Fib
 */
import java.util.Scanner; 
public class Fib_2{
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
		else{
			return Calculate(n-1)+Calculate(n-2);
		}
  }
}
