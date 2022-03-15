package exercicio1;

public class Vendedor extends Colaborador{
    final private Integer grau = 2;

    public Vendedor(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
        super.setGrauInstrucao(grau);
    }

    @Override
    public void bonificacao() {
        Double novoSalário = this.getSalario() + 300.00 * this.getGrauInstrucao() * 4;
        this.setSalario(novoSalário);
    }
}
