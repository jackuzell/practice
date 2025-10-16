import java.util.LinkedList;
public class LinkedListDemo
{
    public static void main(String[]args)
    {
        //Creation
        LinkedList<String> list = new LinkedList<>(); //Creates a list of strings only

        //adding an element
        list.add("Hello");

        //Methods
        list.addFirst("First"); //Adds an element to the start of the list

        list.addLast("Last"); //Adds an element to the end of the list

        list.removeFirst(); //Removes the first element of the list

        list.removeLast(); //Removes the last element of the list

        list.getFirst(); //Returns the first element of the list

        list.getLast(); //Returns the last element of the list

        list.size(); //Returns the size of the list

        list.contains("Hello"); //Checks if the list contains the specified element in this case its "Hello"

        list.isEmpty(); //Checks if the list is empty or not

        list.sort(null); //Sorts the list in natural order

        list.clone(); //Clones the list

        list.toArray(); //Converts the list to an array

        list.peek(); //Returns the first element of the list without removing it

        //for traversing the list
        list.next(); //Returns the next element in the list
        list.previous(); //Returns the previous element in the list

        
        list.clear(); //Clears the list completely




    }
}