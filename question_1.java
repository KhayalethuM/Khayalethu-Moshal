import java.util.Scanner;


public class question_1 {

    public static String print(int rows){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for(int j = i; j<rows; j++){
                sb.append("* ");
                 }
                 sb.append("\n");
                }
                 return sb.toString();
            
        }
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        String s = print(rows);
        System.out.println(s);
        
            }

        }
        
