package Services;

import Entities.Cliente;
import Entities.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Oficina {

    private String nomeOficina;
    private String endereco;
    private List<Cliente> clientes;
    private List<Veiculo> veiculos;
    private List<OrdemDeServico> OS;

    public Oficina(String nomeOficina,String endereco){
        this.nomeOficina = nomeOficina;
        this.endereco = endereco;
        this.clientes = new ArrayList<Cliente>();
        this.veiculos = new ArrayList<Veiculo>();
        this.OS = new ArrayList<OrdemDeServico>();
    }

    public String getNomeOficina() {
        return nomeOficina;
    }

    public String getEndereco() {
        return endereco;
    }

    public void cadastrarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void registrarVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }

    public void abrirOS(OrdemDeServico OS){
        this.OS.add(OS);
    }

   public void listarOS(){
        for(OrdemDeServico OS : OS){
            System.out.println(OS);
        }
   }

}
