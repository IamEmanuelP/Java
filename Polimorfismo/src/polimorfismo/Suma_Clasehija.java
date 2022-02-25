package polimorfismo;

public class Suma_Clasehija extends Polimorfismo_ClasePadre {

    //Sobreescribir un metodo, ya declarado previamente en otra clase
    @Override
    public void Operaciones(){
        resultado = valor1 + valor2;
    }


}
