package Modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Venda {

    private int codigo;
    private String cliente;
    private List<ItemVenda> itens;
    private LocalDateTime dataHora;
    private float total;

    public Venda(int codigo, String cliente, List<ItemVenda> itens, LocalDateTime dataHora) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.itens = itens;
        this.dataHora = dataHora;
        somaTotal();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "codigo=" + codigo +
                ", cliente='" + cliente + '\'' +
                ", itens=" + itens +
                ", dataHora=" + dataHora +
                ", total=" + total +
                '}';
    }

    public void somaTotal (){
        for(ItemVenda item : itens){
            this.total += item.getQuantidade()* item.getProduto().getPreco();
        }
    }
}