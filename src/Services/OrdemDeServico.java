package Services;

import Entities.Cliente;
import Entities.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class OrdemDeServico  {

    private Integer id;
    private Cliente cliente;
    private Veiculo veiculo;
    private List<Servico> servicos;
    private StatusService statusService;
    private Double valorServicoTotal;


    public OrdemDeServico(Integer id,Cliente cliente, Veiculo veiculo, StatusService statusService) {
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.servicos =  new ArrayList<>();
        this.statusService = statusService;
        this.valorServicoTotal = 0.0;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public Veiculo getVeiculo() {
        return veiculo;
    }


    public List<Servico> getServico() {
        return servicos;
    }


    public StatusService getStatusService() {
        return statusService;
    }


    public Double getValorServicoTotal() {
        return valorServicoTotal;
    }


    public void adicionarServico(Servico servico) {
        servicos.add(servico);
        CalcularValorServicoTotal();
    }

    public void RemoverServico(Servico servico) {
        servicos.remove(servico);
        CalcularValorServicoTotal();
    }

    public void CalcularValorServicoTotal() {
        for(Servico servico : servicos){
            valorServicoTotal += servico.getValorServico();
        }
    }

    public List<OrdemDeServico> ExibirServico() {
        System.out.println("Ordem ID: " + id);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Veículo: " + veiculo.getModelo() + " - " + veiculo.getPlaca());
        System.out.println("Serviços:");
        for (Servico servico : servicos) {
            System.out.println(" - " + servico.getDescricaoServico() + ": R$ " + servico.getValorServico());
        }
        System.out.println("Valor total: R$ " + valorServicoTotal);
        System.out.println("-------------------------------");
        return null;
    }
}
