public class Deslactosada extends Decorator{

    private final Beverage beverage;

    public Deslactosada(Beverage beverage){
        this.beverage =  beverage;
    }

    @Override
    public double cost(){
        return 0.50 + beverage.cost();
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ",Leche deslactosada";
    }
}
