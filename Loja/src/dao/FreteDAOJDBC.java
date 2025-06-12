package dao;

import static dao.DAOGenerico.executarConsulta;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Frete;

public class FreteDAOJDBC extends DAOGenerico implements FreteDAO {

    @Override
    public int inserir(Frete frete) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("insert into frete(tipo, valor) ")
                .append("VALUES (?, ?)");
     
        String insert = sqlBuilder.toString();
        int linha = 0;
        try {
            linha = executarComando(insert, frete.getTipo(),
                                            frete.getValor()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return linha;
    }
    
    @Override
    public List<Frete> listar() {
        ResultSet rset;
        String select = "SELECT * FROM frete";
        List<Frete> fretes = new ArrayList<>();
        try {        
            rset = executarConsulta(select);
            while (rset.next()) {
                Frete frete = new Frete();
                frete.setCodigo(rset.getInt("codigo"));
                frete.setTipo(rset.getString("tipo"));
                frete.setValor(rset.getFloat("valor"));
                fretes.add(frete);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return fretes;
    }
    
}
