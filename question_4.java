import java.util.ArrayList;
public class question_4 {
    public static ArrayList<Integer> duplicateFinder(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<>();
        int counter = 0;
        for(int i =0; i< arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[j] = 0;
                    counter++;
                }
                if(counter >= 1 && arr[i] != 0 && !newArr.contains(arr[i])){
                    newArr.add(arr[i]);
                   
                    
                        
                    }
                    
                    
                }
               
                counter = 0;

            }
        

return newArr;
    }

    public static void main(String[] args) throws Exception {
       int[] arr = new int[]{1,2,3,1,3,4,5,3,1};
       ArrayList<Integer> result = duplicateFinder(arr);
       System.err.println(result);
    }
//I kinda hardcoded the matrix yooo
}
