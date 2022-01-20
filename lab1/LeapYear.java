public class LeapYear{
	public static void main(String[] args){
		for(int i=0;i<args.length;i++){
			int year=Integer.parseInt(args[i]);
			checkLeapYear(year);
		}
	}
	public static boolean isLeapYear(int year){
		return (year%400==0)||(year%4==0 && year%100!=0);
	}
	public static void checkLeapYear(int year){
		if (isLeapYear(year)){
			System.out.println(year+" is a leap year.");
		}
		else{
			System.out.println(year+" is not a leap year.");
		}
	}
}
