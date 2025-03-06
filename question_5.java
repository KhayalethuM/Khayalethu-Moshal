import java.util.ArrayList;
import java.util.Scanner;

public class question_5 {
    public static boolean isPrime(int k){
        boolean booo = true;
        if(k<2){
            booo = true;
        }
        for(int i=2;i<=Math.sqrt(k);i++){
            if(k%i ==0){
                booo = false;
                break;
            }
            //else{booo = true;}
        }
        return booo;
    }
    public static ArrayList<Integer> primes(int k){
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i=2; i<=k;i++){
            if(isPrime(i) == true){
                newArr.add(i);
            }

        }
        return newArr;
    }
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(primes(k));
        
        
    }
}
