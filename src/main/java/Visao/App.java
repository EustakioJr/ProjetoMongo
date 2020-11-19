package Visao;

import Controle.VendaDao;
import Modelo.ItemVenda;
import Modelo.Produto;
import Modelo.Venda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        VendaDao daoVenda = new VendaDao();

        Produto produto = new Produto(1, "Leite", (float) 3.25);
        Produto produto2 = new Produto(8, "Ovos", 10);
        Produto produto3 = new Produto(4, "Farinha", 5);

        ItemVenda item = new ItemVenda(produto, 3);
        ItemVenda item2 = new ItemVenda(produto2, 6);
        ItemVenda item3 = new ItemVenda(produto3, 1);
        ItemVenda item4 = new ItemVenda(produto3, 2);
        ItemVenda item5 = new ItemVenda(produto, 2);

        List<ItemVenda> itens = new ArrayList<>();
        itens.add(item);
        itens.add(item2);
        itens.add(item3);

        List<ItemVenda> itens2 = new ArrayList<>();
        itens2.add(item);
        itens2.add(item4);

        List<ItemVenda> itens3 = new ArrayList<>();
        itens3.add(item5);

        Venda venda1 = new Venda(1,"Jose", itens, LocalDateTime.now());
        Venda venda2 = new Venda(2,"Jose", itens2, LocalDateTime.now());
        Venda venda3 = new Venda(3, "Jussara", itens3, LocalDateTime.now());

        daoVenda.salvar(venda1);
        daoVenda.salvar(venda2);
        daoVenda.salvar(venda3);



    }
}
