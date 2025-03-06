import java.util.*;




public class App {
   
    public static void anagram(String a, String b){
       
       ArrayList<Character> list1 = new ArrayList<>();
       ArrayList<Character> list2 = new ArrayList<>();
       for(int i =0; i<a.length();i++){
      
        list1.add(a.charAt(i));


       }
       for(int i =0; i<b.length();i++){
      
        list2.add(b.charAt(i));


       }
       list1.sort(null);
       list2.sort(null);

       if(list1.size() != list2.size()){
        System.out.println("False");
       }

       else{
        String boool = "false";
        
        for(int i=0; i<list1.size(); i++){
            if(Character.toLowerCase(list1.get(i)) != Character.toLowerCase(list2.get(i))){
                
                break;
            }
            boool = "true";

           
        }

        System.out.println(boool);
           
            


        }


            
            

        }
       


       
    

public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
String a = sc.nextLine();
String b = sc.nextLine();
    anagram(a, b);
    }
}
