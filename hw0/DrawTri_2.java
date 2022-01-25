public class DrawTri_2 {
    public static void main(String[] args) {
        drawTriangle(12);
    }
    public static void drawTriangle(int n){
        int col=0,row=0;
        System.out.println();
            while(col<n){
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