package exercicio2;

public class Main {
    public static void main(String[] args) {

        Colaborador gerente = new Gerente("Paulo", 35, 8000.00);
        System.out.println(gerente.toString());
        gerente.bonificacao();


        Colaborador surpevisor = new Supervisor("Grasiele", 33, 4500.00);
        System.out.println(surpevisor.toString());
        surpevisor.bonificacao();


        Colaborador vendedor = new Vendedor("João", 23, 2500.00);
        System.out.println(vendedor.toString());
        vendedor.bonificacao();


    }
}

