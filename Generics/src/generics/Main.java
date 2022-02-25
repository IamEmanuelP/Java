package generics;

public class Main {
    public static void main(String[] args){
        NumericFns<Integer> iOb = new NumericFns<>(4);
        System.out.println(iOb.square());
    }
}
