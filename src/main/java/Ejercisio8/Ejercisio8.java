package Ejercisio8;

import java.util.Scanner;

public class Ejercisio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n;
        double suma = 0;
        double promedio = 0;

        System.out.println("cuantos numeros desea sumar");
        n1 = entrada.nextInt();
        for (int i = 0; i < n1; i++) {
            System.out.println(" digite el el numero");
            n = entrada.nextInt();
           suma = suma + n;
           promedio=((suma)/n1);
           
            n++;
        }
        System.out.println(" la suma de los numeros es " + suma);
        System.out.println(" cuantos numeros eran " + n1);
        System.out.println(" el promedio es "+promedio);
    }

}
