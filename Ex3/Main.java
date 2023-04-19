package Ex3;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, Integer> newDict = new MyDictionary<>();
        newDict.add(1, 100);
        newDict.add(2, 200);
        newDict.add(3, 300);
        try {
            System.out.println(newDict.get(6));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(newDict.get(2));
        System.out.println(newDict.size());
        System.out.println(newDict);
    }
}
