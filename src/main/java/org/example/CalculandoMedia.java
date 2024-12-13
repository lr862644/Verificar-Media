package org.example;

import java.util.Scanner;

public class CalculandoMedia {
    public static void media(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        Float n1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        Float n2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota: ");
        Float n3 = scanner.nextFloat();

        Float media = (n1 + n2 + n3)/3;

        if(media >= 6){
            System.out.println("Aprovado com media " + media);
        }else if( media >= 4 && media <= 5.9){
            System.out.println("Recuperação com media " + media);
        }else if(media < 4){
        System.out.println("Reprovado com media " + media);
        }
    }
}
