package Entities;

public class Veiculo {

    private Cliente cliente;
    private String placa;
    private String modelo;
    private Integer ano;

    public Veiculo(Cliente cliente, String placa, String modelo, Integer ano) {
        this.cliente = cliente;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public  String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void exibirInfoVeiculo() {
        System.out.println("Cliente: " + cliente.getNome() +
                "Placa :" + getPlaca() + "Modelo: " + getModelo());
    }


}
