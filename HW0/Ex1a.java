public class Ex1a{
    public static void main(String[] args){
        int num_lines = 6;
        for(int i = 1; i<= num_lines; i ++){
            for(int j = 0; j < i; j++){
                System.out.print('*');
            }
            System.out.println();

        }
    }
}