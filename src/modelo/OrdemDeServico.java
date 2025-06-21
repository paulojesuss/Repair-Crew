
package modelo;

import java.util.ArrayList;

public class OrdemDeServico {
    public static ArrayList<OrdemDeServico> OrdemDeServicos = new ArrayList<>();
    private int numeroOS;
    private Equipamento equipamento;
    private Cliente cliente;
    private String status;
    private double orcamento;
    private String diagnostico;
    private String observacoes;

    public OrdemDeServico(int numeroOS, Equipamento equipamento, Cliente cliente, String status, double orcamento, String diagnostico, String observacoes) {
        this.numeroOS = numeroOS;
        this.equipamento = equipamento;
        this.cliente = cliente;
        this.status = status;
        this.orcamento = orcamento;
        this.diagnostico = diagnostico;
        this.observacoes = observacoes;
    }

    public int getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(int numeroDS) {
        this.numeroOS = numeroOS;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
