package dao;

import modelo.Frete;

public class FreteDAOJDBC extends DAOGenerico implements FreteDAO {

    @Override
    public int inserir(Frete frete) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("insert into frete(codigo, tipo, valor) ")
                .append("VALUES (?, ?, ?)");
     
        String insert = sqlBuilder.toString();
        int linha = 0;
        try {
            linha = executarComando(insert, frete.getCodigo(),
                                            frete.getTipo(),
                                            frete.getValor()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return linha;
    }
    
}
