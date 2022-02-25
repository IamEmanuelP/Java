package polimorfismo;

public class ClasePrincipal {
    public static void main(String[] args){
        Polimorfismo_ClasePadre suma = new Suma_Clasehija();
        suma.PedirDatos();
        suma.Operaciones();
        suma.MostrarResultado();

        Polimorfismo_ClasePadre resta = new Resta_ClaseHija();
        resta.PedirDatos();
        resta.Operaciones();
        resta.MostrarResultado();
    }
}
