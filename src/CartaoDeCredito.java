import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartaoDeCredito {
    private double limiteCartao;
    private double saldoNoCartao;

    private List<Compra> compras;

    // Cria lista de compras
    public CartaoDeCredito(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.saldoNoCartao = limiteCartao;
        this.compras = new ArrayList<>();
    }

    // Adiciona na lista de compras
    public boolean lancaCompra(Compra compra) {
        if(this.saldoNoCartao >= compra.getValor()){
            this.saldoNoCartao -= compra.getValor();
            this.compras.add(compra);
            return true;
        } else {
            return false;
        }
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getSaldoNoCartao() {
        return saldoNoCartao;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    @Override
    public String toString() {
        return "Saldo: "+ getSaldoNoCartao();
    }
}
