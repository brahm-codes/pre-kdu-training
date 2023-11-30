import java.util.*;

public class Java_Collection {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 10 strings");
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();        
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<10;i++){
            String input = s.nextLine(); 
            list.add(input);
            set.add(input);
            map.put(input,map.getOrDefault(input,0)+1);
        }

        System.out.println("\nList Contains:");
        for(String it : list){
            System.out.println(it);
        }

        System.out.println("\nSet Contains:");
        for(String it : set){

            System.out.println(it);
        }

        System.out.println("\nFrequency of the words: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Word = " + entry.getKey() + ", Frequency = " + entry.getValue());
        }
        
    }
}


