package exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double imc, altura, peso;
        String nome;

        System.out.println("Digite o nome da pessoa: ");
        nome = sc.nextLine();
        System.out.println("Digite o peso: ");
        peso = sc.nextDouble();
        System.out.println("Digite a altura: ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 18.5) {

            System.out.println("Abaixo do Peso");
    }
        else if (imc >= 18.5 && imc <= 24.9) {

            System.out.println("Peso Normal");
        }
        else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        }
        else if (imc >= 30 && imc <= 34.9){

            System.out.println("Obesidade Grau I");
        }
        else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II");
        }
        else {
            System.out.println("Obesidade Grau III");
        }
        System.out.println("Nome: " + nome
                + " Peso: " + String.format("%.2f",peso)
                + " Altura: " + String.format("%.2f",altura)
                + " IMC: "
                + String.format("%.2f", imc));
    }

}

