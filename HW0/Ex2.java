public class Ex2{
    public static int max(int[] m){
        int length = m.length;
        int maximum = m[0];
        for(int i = 1; i<length; i++){
            if(m[i] > maximum){
                maximum = m[i];
            }
        }
        return maximum;
    }

    public static void main(String[] args){
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.print(String.valueOf(max(numbers)));
    }
}