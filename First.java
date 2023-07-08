import java.util.LinkedList;

public class First {
    public static LinkedList<String> reversed_LinkedList(LinkedList<String> myList) {
        int size = myList.size();
        for (int i = 0; i < size-1; i++) {
            myList.add(myList.get(size-i-2));
            myList.remove(size-i-2);
        }
        return myList;
    }
    public static void main(String[] args) {
        LinkedList<String> my_List = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            my_List.add("Igor" + i);
        }

        
        System.out.println(reversed_LinkedList(my_List));

    }
}