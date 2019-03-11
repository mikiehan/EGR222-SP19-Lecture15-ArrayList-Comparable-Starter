package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListClient {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("hello");
        list.add("egr222");
        list.add("world");
        list.add("dr. Han");
        list.add("fun");
        System.out.println(list);
    }
}
