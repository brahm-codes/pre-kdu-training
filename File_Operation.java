import java.util.*;
import java.io.*;

public class File_Operation {
    public static void main(String[] args) throws Exception {
        File csvFile = new File("input.csv"); 
        
        Map<String, Integer> m = new HashMap<>();
        
        Scanner scanner = new Scanner(csvFile);
        while(scanner.hasNext()){
            String word = scanner.next();
            m.put(word, m.getOrDefault(word,1) + 1);  
        }
        
        String max1 = null;
        String max2 = null; 
        String max3 = null;
        
        for(Map.Entry<String,Integer> entry: m.entrySet()){
            String word = entry.getKey();
            Integer count = entry.getValue();
            
            if(count > (max1==null ? 0:m.get(max1))){
                max3 = max2; 
                max2 = max1; 
                max1 = word;             
            } else if(count > (max2==null ? 0:m.get(max2))){
                 max3 = max2;
                 max2 = word;
            } else if(count > (max3==null ? 0 : m.get(max3))){
                 max3 = word; 
            }
        }
        
        System.out.println(max1);
        System.out.println(max2); 
        System.out.println(max3);  
    }
}