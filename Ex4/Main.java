package Ex4;

public class Main {
    public static void main(String[] args) {

        MyClass<String> newClassFactory = MyClass.factoryMethod();
        newClassFactory.setMyClass("my class factory");
        System.out.println(newClassFactory);

    }
}
