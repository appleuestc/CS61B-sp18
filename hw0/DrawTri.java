public class DrawTri{
	public static void main(String[] args) {
		int col=0,row=0,size=5;
		System.out.println();
			while(col<=size){
				while(row<col){
					System.out.print("*");
					row=row+1;
				}
				System.out.println("*");
				row=0;
				col=col+1;
			}
	}
}
