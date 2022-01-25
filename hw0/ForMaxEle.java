public class ForMaxEle {
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        int maxval=0;
        for(int i=0;i<=m.length-2;i++){
            if(m[i+1]>=m[i]){
                maxval=m[i+1];
            }
        }
        return maxval;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
       System.out.println(forMax(numbers));    
    }
}