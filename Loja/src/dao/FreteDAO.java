
package dao;

import java.util.List;
import modelo.Frete;

public interface FreteDAO {
    public int inserir(Frete frete);
    public List<Frete>listar();
}
