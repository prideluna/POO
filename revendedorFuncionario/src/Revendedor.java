public class Revendedor extends Funcionario{
    public Revendedor(String cpf, String nome, int idade, boolean sexo, double valorVendido,  String cpf_resp) {
        super(cpf, nome, idade, sexo, valorVendido);
        this.setCpf_resp(cpf_resp);

    }



    @Override
    public double calculaComissao() {
        return 0;
    }

    private String cpf_resp;

    public String getCpf_resp() {
        return cpf_resp;
    }

    public void setCpf_resp(String cpf_resp) {
        this.cpf_resp = cpf_resp;
    }

}
