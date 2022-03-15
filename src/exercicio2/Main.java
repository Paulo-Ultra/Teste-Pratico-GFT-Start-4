package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        System.out.println("Escreva um número entre 350 e 8750: ");
        int numero = sc.nextInt();
        if(numero < 350 && numero > 8750) {
            System.out.println("Deve conter mais de 2 digitos");
            System.out.println("Escreva um número entre 350 e 8750: ");
            numero = sc.nextInt();
        }
        String numStr = Integer.toString(numero); // Converte o mesmo em uma String
        char numArr[] = numStr.toCharArray();
        for(int i = 0; i < numArr.length; i++)
            if(numArr[i] % 2 == 1) {
                cont++;
            }

        System.out.println("O número de ímpares é: " + cont);
    }
}


