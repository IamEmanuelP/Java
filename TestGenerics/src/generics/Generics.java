package generics;

import java.util.*;

public interface Generics <T extends Number>{

    <T> T minValue(ArrayList<T> a);
    <T> T maxValue(ArrayList<T> a);
    <T> T suma(List<T> a, int index1,int index2);
    <T> T product(List<T> a,int index1,int index2);
    <T> T factorial(List<T> a,int index1);

}

