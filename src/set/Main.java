package set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<String> language = new HashSet<>();


        language.add("Java");
        language.add("Python");
        language.add("Javascript");
        language.add("C++");
        language.add("Kotlin");
        language.add("Ruby");
        language.add("Java");

        Iterator it = language.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
