import java.util.*;

public class Hashing {
    public static void main(String[] args) {

        //city(key), population(value)
        HashMap<String, Integer > map = new HashMap<>();

        //Insertion
        map.put("Input", 120);
        map.put("Bilashpur", 60);
        map.put("Raipur", 52);

        System.out.println(map);

        //Updateion
        map.put("Raipur", 150);
        System.out.println(map);

        //Search
        if(map.containsKey("Raipur")){
            System.out.println("Key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("Raipur")); //Key exists
        System.out.println(map.get("Durg")); //key dose not exists

        //iteration
         // For loop for collection

        int arr[] = {12, 15, 16};
        for (int num : arr){
            System.out.println(num);
        }

        //For our Hashmap
        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Remove ant one
        map.remove("Bilashpur");
        System.out.println(map);



    }
}