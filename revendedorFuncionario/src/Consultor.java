import java.util.ArrayList;
import java.util.List;

public class Consultor extends Funcionario{
    static List<Funcionario> subordinado;
    static int count = 0;
    public Consultor(String cpf, String nome, int idade, boolean sexo, double valorVendido) {
        super(cpf, nome, idade, sexo, valorVendido);
        subordinado = new ArrayList<>();
    }


    @Override
    public double calculaComissao() {
        return 0;
    }

    public static List<Funcionario> getSubordinado() {
        return subordinado;
    }

    public static void setSubordinado(List<Funcionario> subordinado) {
        Consultor.subordinado = subordinado;
    }


    public static void addFuncionario(Funcionario f){
            subordinado.add(f);
    }
    public static int numSubordinados() {
        count = subordinado.size();
        return count;
    }
}
