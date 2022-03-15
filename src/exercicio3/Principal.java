package exercicio3;

import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {

        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setNumero(8548);
        contaCorrente.setTitular("Paulo Ricardo Freire Ultra");
        contaCorrente.setSaldo(3000.00);

        System.out.println("Conta Corrente");
        System.out.println("Nome: " + contaCorrente.getTitular());
        System.out.println("Numero: " + contaCorrente.getNumero());
        System.out.println("Saldo: " + contaCorrente.getSaldo());
        System.out.println("Rendimento: " + String.format("%.2f", contaCorrente.rendimento()));


        System.out.println("__________________________________________________");

        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNumero(8547);
        contaPoupanca.setTitular("Grasiele Barreto Rocha");
        contaPoupanca.setSaldo(3500.00);

        System.out.println("Conta Poupança");
        System.out.println("Nome: " + contaPoupanca.getTitular());
        System.out.println("Numero: " + contaPoupanca.getNumero());
        System.out.println("Saldo: " + contaPoupanca.getSaldo());
        System.out.println("Rendimento: " + String.format("%.2f", contaPoupanca.rendimento()));

    }
}

