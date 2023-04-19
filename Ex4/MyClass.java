package Ex4;

public class MyClass<T> {
    private T myClass;

    public void setMyClass(T myClass) {
        this.myClass = myClass;
    }

    static <T> MyClass<T> factoryMethod() {
        return new MyClass<>();
    }

    @Override
    public String toString() {
        return myClass.toString();
    }
}
