package polimorfismo;
import java.util.Scanner;

public  abstract class Polimorfismo_ClasePadre {
    protected int valor1,valor2,resultado;
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos(){
        System.out.println("Dame el primer valor: ");
        valor1 = entrada.nextInt();

        System.out.println("Dame el segundo valor valor: ");
        valor2 = entrada.nextInt();

    }

    public abstract void Operaciones(); //Aplicar polimorfismo,declarar metodo,recurrir a otras clases

    public void MostrarResultado(){
        System.out.println(resultado);
    }


}
