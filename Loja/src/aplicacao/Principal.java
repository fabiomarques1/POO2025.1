package aplicacao;

import dao.DAOFactory;
import dao.FreteDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import modelo.FormaPagamento;
import modelo.Frete;
import modelo.Venda;

public class Principal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Frete> listaFrete = new ArrayList<>();
        while (true) {
            System.out.println("Cadastro de Frete (-1 para SAIR): ");
            System.out.println("Informe o código do frete: ");
            int codigo = s.nextInt();
            if (codigo == -1) break;
            Frete frete = new Frete();
            frete.setCodigo(codigo);
            System.out.println("Informe o tipo do frete: ");
            frete.setTipo(s.next());
            System.out.println("Informe o valor do frete: ");
            frete.setValor(s.nextFloat());
            listaFrete.add(frete);
            FreteDAO freteDAO = DAOFactory.criarFreteDAO();
            freteDAO.inserir(frete);
        }
        
        /*
        ArrayList<FormaPagamento> listaPag = new ArrayList<>();
        while (true) {
            System.out.println("Cadastro de Forma de Pagamento (-1 para SAIR): ");
            System.out.println("Informe o código da forma de pagamento: ");
            int codigo = s.nextInt();
            if (codigo == -1) break;
            FormaPagamento forma = new FormaPagamento();
            forma.setCodigo(codigo);
            System.out.println("Informe a descrição da forma de pagamento: ");
            forma.setDescricao(s.next());
            listaPag.add(forma);
        }
        
        ArrayList<Venda> listaVenda = new ArrayList<>();
        while (true) {
            System.out.println("Cadastro de Venda(-1 para SAIR):");
            System.out.println("Informe o código da venda");
            int codigo = s.nextInt();
            if (codigo == -1) break;
            Venda venda = new Venda();
            venda.setCodigo(codigo);
            venda.setData(new Date());
            System.out.println("Informe o valor da venda: ");
            venda.setValor(s.nextFloat());
            if (venda.getValor() > 200) {
                venda.setFrete(listaFrete.getFirst());
            } else {
                System.out.println("Escolha o frete 1-PAC 2-SEDEX: ");
                int codigoFrete = s.nextInt();
                venda.setFrete(listaFrete.get(codigoFrete));
            }
            System.out.println("Informe a forma de pagamento 1-Boleto 2-Cartão: ");
            int codigoForma = s.nextInt();
            venda.setFormaPagamento(listaPag.get(codigoForma - 1));
            System.out.println("Informe o número de Parcelas: ");
            venda.setNumeroParcelas(s.nextInt());
            venda.calcularDesconto();
            venda.calcularValorFinal();
            System.out.println(venda);
            listaVenda.add(venda);
        } */

        
    }
    
}