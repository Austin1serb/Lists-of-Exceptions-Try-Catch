import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Value at index " +i+" is:"+castedValue);
            } catch (Exception e) {
                System.out.println("the error occured at index " +i);
                System.out.println("the value that caused the error is: "+myList.get(i));
                System.out.println(e);
            }

        }
    }
}