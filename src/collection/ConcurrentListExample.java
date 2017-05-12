package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
   CopyOnWriteArrayList in Java is a thread safe implementation of List interface.
   if (modCount != expectedModCount) will throw exception
   If you will look into the ArrayList source code, 
   following method is called every time we invoke next() on iterator that throws exception.
  
   	final void checkForComodification() {
    if (modCount != expectedModCount)
        throw new ConcurrentModificationException();
	} 
	
	Here modCount is the ArrayList variable that holds the modification count and every time we use add, remove or trimToSize method, it increments. 
	expectedModCount is the iterator variable that is initialized when we create iterator with same value as modCount. 
	This explains why we don’t get exception if we use set method to replace any existing element.

	reference http://www.journaldev.com/1289/copyonwritearraylist-java
*/

public class ConcurrentListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //List<String> list = new CopyOnWriteArrayList<>();
        
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        
        // get the iterator
        Iterator<String> it = list.iterator();
        
        //manipulate list while iterating
        while(it.hasNext()){
            System.out.println("list is:"+list);
            String str = it.next();
            System.out.println(str);
           
            if(str.equals("2"))list.remove("5");
            if(str.equals("3"))list.add("3 found");
           
            //below code don't throw ConcurrentModificationException
            //because it doesn't change modCount variable of list
            if(str.equals("4")) list.set(1, "4");
        }
    }

}
