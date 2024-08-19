package main.java.dsa.array;

public class Main {
    public static void main(String[] args) throws ElementNotFoundException {
        SingleDimensionArray array = new SingleDimensionArray(5);
        array.insert(1,6);
        array.insert(2,7);
        array.print();
        System.out.println(array.searchIndex(67));
    }
}
