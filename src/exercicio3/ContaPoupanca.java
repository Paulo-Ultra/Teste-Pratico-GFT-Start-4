package exercicio3;

public class ContaPoupanca extends Conta {

    @Override
    public Double rendimento() {
        return this.getSaldo() * 0.07;
    }
}