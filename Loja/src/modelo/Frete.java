package modelo;

public class Frete {
    private int codigo;
    private String tipo;
    private Float valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Frete{" + "codigo=" + codigo + ", tipo=" + tipo + ", valor=" + valor + '}';
    }
    
    
}
