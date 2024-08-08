public class Ex1a {
	    public static void main(String[] args) {
        	        int lines = 1;
        	        int temp = 0;
        	        while (lines < 6) {
            	           temp = lines;
            	           while (temp >0 ){
                	           System.out.print("*");
							   temp -= 1;
                	           }
            	           lines += 1;
            	           System.out.println("");
            	        }
        	    }
	}