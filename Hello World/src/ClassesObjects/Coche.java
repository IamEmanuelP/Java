package ClassesObjects;

public class Coche {
    //Atributos
    String color;
    String marca;
    int km;

    //Metodos acciones o comportamientos que hace la clase
    public static void main(String [] args){
        Coche coche1 = new Coche();
        coche1.color="Blanco";
        coche1.marca="BMW";
        coche1.km=0;
        System.out.println(("Los datos del coche son: "+coche1.color+"-"+coche1.marca+"-"+coche1.km));
    }

}
