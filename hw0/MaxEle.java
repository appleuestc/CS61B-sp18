public class MaxEle {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int i=0,maxval=0;
        while(i<=m.length-2){
            if(m[i+1]>=m[i]){
                maxval=m[i+1];
            }
            i=i+1;
        }
        return maxval;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}