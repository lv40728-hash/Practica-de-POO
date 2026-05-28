package Unidad5.Ejercicio;
import java.util.Scanner;
import java.util.ArrayList;

public class UsarAutos {
    public static void main (String [] args  ){
        ArrayList <Auto> listaAutos  = new ArrayList <>();
        Scanner sc = new Scanner (System.in);

        String marca;
        String modelo;
        int anio;
        double precioVenta;
        double sumaPrecios = 0;

        System.out.println ("Ingreso de datos (Ingrese una Marca vacia para finalizar la carga");
        
        do {
            System.out.println ("Marca: ");
            marca = sc.nextLine();
            if (marca.isEmpty()) {
                break;
            }

            System.out.println ("Modelo: ");
            modelo = sc.nextLine ();

            System.out.println ("Año: ");
            anio = sc.nextInt();

            System.out.println("Precio de Venta del Vehiculo");
            precioVenta = sc.nextDouble();

            sc.nextLine();


        } while (true);
        System.out.println("Lista de Autos:");
        for (Auto auto : listaAutos) {
            System.out.print(auto);

            double promedioPrecios = sumaPrecios / listaAutos.size ();
            System.out.println ("Promedio Precios de Venta:"  + Double.toString (promedioPrecios));


            System.out.println ("Ingrese el modelo del auto que desea buscar: ");

            String modeloBuscado = sc.nextLine();

            if (buscarAutoPorModelo (listaAutos, modeloBuscado)) {
                System.out.println("El auto con modelo: " + modeloBuscado + "Se encontró en la lista.");
            } else {
                System.out.println ("el auto con modelo" + modeloBuscado + "no se encontró en la lista.");
            }

        }
        sc.close();

        
    }
    public static boolean buscarAutoPorModelo (ArrayList <Auto> autos, String modeloBuscado) {
        for (Auto auto : autos ) {
            if (auto.getModelo().equalsIgnoreCase(modeloBuscado)) {
                return true; 
            }
        }
        return false;
    }

}
