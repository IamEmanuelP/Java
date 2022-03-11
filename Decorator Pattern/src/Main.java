public class Main {
    public static void main(String[] args) {
        Beverage b = new Mocha(new Mocha(new Deslactosada(new Espresso())));
        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}
