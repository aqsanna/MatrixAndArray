package Generik;

public class main {
    public static void main(String[] args) {
        MyUpperBoundGeneric<ExtendsClass> mg = new MyUpperBoundGeneric<>();
        MyUpperBoundGeneric<SubClass> smg = new MyUpperBoundGeneric<>();
        MyUpperBoundGeneric<SuperClass> ss = new MyUpperBoundGeneric<>();

    }
}
