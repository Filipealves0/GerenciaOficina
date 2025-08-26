package Services;

public class Servico {

    private int codServico;
    private String descricaoServico;
    private double valorServico;

    public Servico(int codServico, String descricaoServico, double valorServico) {
        this.codServico = codServico;
        this.descricaoServico = descricaoServico;
        this.valorServico = valorServico;
    }

    public int getCodServico() {
        return codServico;
    }

    public void setCodServico(int codServico) {
        this.codServico = codServico;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public double getValorServico() {
        return valorServico;
    }


    public void alterarPrecoServico(double precoServico) {
        this.valorServico = precoServico;
    }
    public void exibirServico(){
        System.out.println("Servico: " + this.descricaoServico);
    }
}
