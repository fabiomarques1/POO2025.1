package modelo;

import java.util.Date;

public class Venda {
    int codigo;
    Date data;
    float valor;
    Frete frete;
    FormaPagamento formaPagamento;
    int numeroParcelas;
    float desconto;
    float valorFinal;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    public void calcularDesconto() {
        float percDesconto = switch (this.numeroParcelas) {
                case 1 -> 0.10f;
                case 2, 3, 4 -> 0.05f;
                case 5, 6 -> 0.03f;
                default -> 0;
            };
        this.desconto = this.valor * percDesconto;
    }
    
    public void calcularValorFinal() {
        this.valorFinal = this.valor - this.desconto + this.frete.getValor();      
    }

    @Override
    public String toString() {
        return "Venda{" + "codigo=" + codigo + ", data=" + data + ", valor=" + valor + ", frete=" + frete + ", formaPagamento=" + formaPagamento + ", numeroParcelas=" + numeroParcelas + ", desconto=" + desconto + ", valorFinal=" + valorFinal + '}';
    }
    
    
}
