package modelo;

public class FormaPagamento {
    int codigo;
    String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" + "codigo=" + codigo + ", descricao=" + descricao + '}';
    }
    
    
}
