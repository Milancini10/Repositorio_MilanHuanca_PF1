package Programas;

import java.util.Scanner;

public class ComprasCliente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar nombre del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = input.nextLine();

        // Solicitar las tres compras
        System.out.print("Ingrese el monto de la compra 1: ");
        double compra1 = input.nextDouble();
        System.out.print("Ingrese el monto de la compra 2: ");
        double compra2 = input.nextDouble();
        System.out.print("Ingrese el monto de la compra 3: ");
        double compra3 = input.nextDouble();

        // Cálculos
        double totalCompras = compra1 + compra2 + compra3;
        double promedioCompras = totalCompras / 3;

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Nombre del Cliente: " + nombre);
        System.out.println("Total compras        : " + totalCompras);
        System.out.println("Promedio compras     : " + promedioCompras);
    }
}
