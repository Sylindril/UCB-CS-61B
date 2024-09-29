public class Ex4{
    public static void windowPosSum(int[] a, int n){
        int length = a.length;
        int temp = 0;
        for(int i = 0; i< a.length; i++){
            if (a[i] <=0){
                continue;
            }
            else{
                if (i + n < length){
                    temp = 0;
                    for(int j = i; j < i+n+1; j++){
                        temp += a[j];
                    }
                }
                else{
                    temp = 0;
                    for (int j = i; j< length; j++){
                        temp +=a[j];
                    }
                }
                a[i] = temp;
            }
        }
    }
    public static void main(String[] args){
        int[] a = {1,2,-3,4,5,4};
        int n = 3;
        windowPosSum(a, n);

        System.out.println(java.util.Arrays.toString(a));
    }
}