package com.contabanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        String NomeCliente;
        int Numero;
        String Agencia;
        double Saldo;

        System.out.println("Nome Cliente");
        NomeCliente=scanner.nextLine();
        System.out.println("Numero");	
        Numero = scanner.nextInt();
        System.out.println("Agencia");
        Agencia = scanner.nextLine();
        System.out.println("Saldo");	
        Saldo = scanner.nextDouble();

        System.out.println("Nome Cliente: " + NomeCliente);
        System.out.println("Numero " + Numero);
        System.out.println("Agencia " + Agencia);
        System.out.println("Saldo " + Saldo);


        scanner.close();

    }
}