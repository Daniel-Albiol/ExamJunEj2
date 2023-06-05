import java.lang.*;
import java.util.Scanner;

public class Main {
    int lista1[] = new int[5];
    int lista2[] = new int[10];
    int lista3[] = new int[15];

    System.out.print("Con que lista quieres trabajar(1,2,3): ");
    Integer numerolista = new Scanner(System.in).nextInt();
    if (numerolista == 1){
        while(n >=0)

        {
            for (int i = 0; i > lista1.length; i++) {
                lista1[i];
            }
            System.out.print("Introducir número: ");
            n = new Scanner(System.in).nextInt();
        }
        System.out.println("El mínimo es: "+lista1.Estadistica.minimo());
        System.out.println("El máximo es: "+lista1.Estadistica.maximo());
        System.out.println("El sumatorio es: "+lista1.Estadistica.sumatorio());
    } else {
        if (numerolista == 2) {
            while (n >= 0) {
                for (int i = 0; i > lista2.length; i++) {
                    lista2[i];
                }
                System.out.print("Introducir número: ");
                n = new Scanner(System.in).nextInt();
            }
            System.out.println("El mínimo es: "+lista2.Estadistica.minimo());
            System.out.println("El máximo es: "+lista2.Estadistica.maximo());
            System.out.println("El sumatorio es: "+lista2.Estadistica.sumatorio());
        }
    }if (numerolista == 3) {
        while (n >= 0) {
            for (int i = 0; i > lista3.length; i++) {
                lista3[i];
            }
            System.out.print("Introducir número: ");
            n = new Scanner(System.in).nextInt();
        }
        System.out.println("El mínimo es: "+lista3.Estadistica.minimo());
        System.out.println("El máximo es: "+lista3.Estadistica.maximo());
        System.out.println("El sumatorio es: "+lista3.Estadistica.sumatorio());
    }

    System.out.print("Introducir número(negativo para salir): ");
    Integer n = new Scanner(System.in).nextInt();
        while(n >=0)

    {
        for (int i = 0; i > lista1.length; i++) {
            lista1[i];
        }
        System.out.print("Introducir número: ");
        n = new Scanner(System.in).nextInt();
    }

}
