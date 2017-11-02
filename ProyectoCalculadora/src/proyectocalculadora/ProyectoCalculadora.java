package proyectocalculadora;

import java.util.*;

public class ProyectoCalculadora {

    public List<Integer> numeros;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidadNumeros;
        int opcion;
        int valores = 10;
        
        System.out.println("Bienvenido");
        System.out.println("Cuantos numeros desea ingresar: ");
        cantidadNumeros = leer.nextInt();
        System.out.println("1° Sumar");
        System.out.println("2° Restar");
        System.out.println("Opcion: ");
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                break;
            case 2:
                break;

        }
    }

}
