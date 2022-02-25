package generics;

import java.util.ArrayList;

public class Main <T extends Number>{
    public static <T> void main(String[] args) {
        Main obj = new Main();
        Methods mymethod = new Methods();
        ArrayList array = new ArrayList<T>();
        array.add(9.5);
        array.add(40.25);
        array.add(19.5);
        array.add(99.56);
        array.add(10.25);
        array.add(89.3);
        array.add(76.54);
        array.add(35.89);

        System.out.println("Array indexes " + (array));
        System.out.println("Min value is "+ mymethod.minValue(array));
        System.out.println("Max value is "+ mymethod.maxValue(array));
        System.out.println("Sum of two is "+mymethod.suma(array,1,5));
        System.out.println("The prodcut is "+mymethod.product(array,5,3));
        System.out.println("The factorial is "+mymethod.factorial(array,1));

    }

}
