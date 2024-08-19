package main.java.dsa.array;


import java.io.Console;
import java.lang.constant.Constable;
import java.util.logging.ConsoleHandler;

public class SingleDimensionArray {
    private int []arr = null;

    public SingleDimensionArray (int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Time Complexity: O(N) | Space Complexity: O(1)
    public void print(){
        try{
            StringBuilder prettyPrinted = new StringBuilder("[");
            for (int i=0; i<arr.length; i++){
                prettyPrinted.append(i != arr.length - 1 ? String.format("%d,", arr[i]) : arr[i]);
            }
            System.out.printf("%s]%n",prettyPrinted);
        }catch (Exception error){
            System.out.println("Array no longer exist");;
        }
    }

    // Time Complexity: O(1)
    public void insert(int location, int valueToBeInserted){
        if(arr[location] == Integer.MIN_VALUE){
            arr[location] = valueToBeInserted;
        }else{
            throw new IndexOutOfBoundsException(String.format("index %d already occupied with the value %d",location,arr[location]));
        }
    }

    // TimeComplexity: O(1)
    public int searchElement(int location){
        if(location>=0 && location<arr.length){
            return arr[location];
        }else {
            throw new IndexOutOfBoundsException(String.format("invalid index %d, length of array is %d",location,arr.length));
        }
    }

    public int searchIndex(int valueToSearch) throws ElementNotFoundException {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                return i;
            }
        }
        throw new ElementNotFoundException(String.format("Element %d not found", valueToSearch));
    }

}

