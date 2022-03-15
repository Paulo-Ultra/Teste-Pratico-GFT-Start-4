package exercicio1;

public class Supervisor extends Colaborador{
    final private Integer grau = 3;

    public Supervisor(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
        super.setGrauInstrucao(grau);
    }

    @Override
    public void bonificacao() {
        Double novoSalário = this.getSalario() + 500.00 * this.getGrauInstrucao() * 3;
        this.setSalario(novoSalário);
    }

}

