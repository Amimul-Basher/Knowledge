package programiz.collectionframework.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//ArrayList is good for storing and accessing but not good for manipulation
public class ArrayListTest {
    public static void main(String[] args){
        List<String> al = new ArrayList<>();
        try{

            al.add("Afreen");
            al.add("Ayaat");
            al.add("Ranju");
            al.add("Amimul");
            System.out.println(al);
            al.set(3, "Shafa");
            System.out.println(al.toString());
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }


//        Convert ArrayList to Array
        System.out.println(al.size());
        String[] array = new String[al.size()];
        al.toArray(array);
        System.out.println("Printing converted Array from ArrayList");
        for(String arr: array){
            System.out.println(arr);
        }

//        Converting vice varsa
        String[] arr = {"Ranju", "Shafa", "Ayaat", "Afreen"};
        ArrayList<String> arrayHolder = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Printing ArrayList Converted from Array\n" + arrayHolder);

//        Use iterator to traverse ArrayList
        Iterator<String> iterate = al.iterator();
        System.out.println("Pointer address of that ArrayList" + iterate);
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
    }
}
