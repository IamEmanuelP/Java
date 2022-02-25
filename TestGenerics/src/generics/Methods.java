package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Methods <T extends Number> implements Generics {

    @Override
    public T minValue(ArrayList a) {
        Integer n = a.size();
        Collections.sort(a);//sorts the array
        T minValue = (T) a.get(0);
        return minValue;
    }

    @Override
    public T maxValue(ArrayList a) {
        Integer n = a.size();
        Collections.sort(a);// sorts the array
        T maxValue = (T) a.get(n - 1);
        return maxValue;
    }


    @Override
    public T suma(List a, int index1, int index2) {
        T val1 = (T) a.get(index1);
        T val2 = (T) a.get(index2);
        Double suma= val1.doubleValue() + val2.doubleValue();
        return (T) suma;
    }

    @Override
    public T product(List a, int index1, int index2) {
        T val1 = (T) a.get((int) index1); //Obtener lo valores dependiendo del lugar del arraylist
        T val2 = (T) a.get((int) index2);
        Double product = val1.doubleValue() * val2.doubleValue(); //Guardar el valor
        return (T) product;
    }


    @Override
    public T factorial(List a, int index1) {
        T val1 = (T) a.get((int) index1);
        Double factorial = val1.doubleValue() * val1.doubleValue();
        return (T) factorial;
        //if (val1.doubleValue() <= 1){
        //    return 1;
        //}
        //return val1 * factorial (val1.doubleValue() - 1);
    }


}