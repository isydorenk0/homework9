package Ex2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> data = new MyList<>();
        data.add(1111);
        data.add(12);
        data.add(123);
        data.add(124);
        System.out.println(data);
        System.out.println(data.size());
        System.out.println(data.get(2));
        try {
            System.out.println(data.get(6));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        MyList<String> dataString = new MyList<>();
        dataString.add("1111s");
        dataString.add("12s");
        dataString.add("123s");
        dataString.add("124s");
        System.out.println(dataString);
        System.out.println(dataString.size());
        System.out.println(dataString.get(0));
    }
}
