package exercicio2;

public class Gerente extends Colaborador {

    final private Integer grau = 5;

    public Gerente(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
        super.setGrauInstrucao(grau);
    }

    @Override
    public void bonificacao() {
        Double novoSalário = this.getSalario() + 1000.00 * this.getGrauInstrucao() * 2;
        this.setSalario(novoSalário);
    }

}
