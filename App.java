/*WE receive input in the form name#number..
we must seperate the name from the number and maybe try to store the two in a data structure which allows us
to store two variables side by side , sort inside the structure and dispay the things */
//for(int i=0; i<name_mark.length(); i++){
   // sb.append(name_mark.charAt(i));

   
import java.util.*;



public class App {
    public static void seperate(ArrayList<String> arr){
        StringBuilder sb = new StringBuilder();
        StringBuilder st = new StringBuilder();
        
        TreeMap<Integer, String> marks = new TreeMap<>();

      
        
        for(int k =0; k<arr.size(); k++){
            String input = arr.get(k);
            sb.setLength(0);
            st.setLength(0);
           int j =0;
        while(input.charAt(j) != '#'){
            sb.append(input.charAt(j));
            
             j++;
           
        }
    
        String nameOfLeaner = sb.toString(); //convert stringbuilder to normal string
    
          //  sbb = sb.toString();
        while(j <input.length()-1){
            st.append(input.charAt(j+1));
            j++;
        }

        String markString = st.toString();
        int mark = Integer.parseInt(markString);
        marks.put(mark,nameOfLeaner) ;

            
        }
      

        
        for (Map.Entry<Integer, String> mapEntry : marks.entrySet()) {
            System.out.println(mapEntry.getValue() + ":" + mapEntry.getKey());
        }
    }


        

     //   HashMap<String, Integer> map = new HashMap<>();
    
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arr = new ArrayList<>();
        System.out.println("Please specify the number of inputs *sighs*, followed by the inputs");
        int n = scanner.nextInt();
        scanner.nextLine();

       
        for(int i =0; i<n; i++){
            String name = scanner.nextLine();
            arr.add(name);
        }
    seperate(arr);

    }
}
