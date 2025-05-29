
package dao;

public class DAOFactory {
        public static FreteDAO criarFreteDAO() {
        return new FreteDAOJDBC();
    }
}
