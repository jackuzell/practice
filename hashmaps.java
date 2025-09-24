import java.util.HashMap;
public class hashmaps
{
    public static void main(String[] args) 
    {
        /*Hashmaps -
            A data structure that stores key-value pairs
            Keys are unique, but values can be duplicated
            Does not maintain any order, but its memory efficient
            HashMap<Key, Value>
         */

         //Creating a HashMap
         HashMap<String, Double> map = new HashMap<>(); //String is the key and the double is the value.

         //putting things in (put method)
         map.put("apple",0.50);
         map.put("banana",0.25);
         map.put("orange",0.75);

         //removing things (remove method)
            map.remove("banana");// and now bannanna is gone

        //getting things (get method)
            double price = map.get("apple");
            System.out.println(price);

        //checking if a key exists (containsKey method)
            boolean hasOrange = map.containsKey("orange");
            System.out.println(hasOrange);
            
         System.out.println(map);
    }
}