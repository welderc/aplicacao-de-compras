public class Compra implements Comparable<Compra>{
    String nomeUsuario;
    private String nomeProduto;
    private double valor;

    public Compra(String nomeUsuario, String nomeProduto, double valor) {
        this.nomeUsuario = nomeUsuario;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return  "\n********************************************\n\n"+
                "Nome: "+ getNomeUsuario() +", \n"+
                "COMPRAS REALIZADAS:\n\n"+
                getNomeProduto() +" - "+ getValor()+"\n"+
                "\n********************************************\n"+
                "Saldo do cartão: ";


    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
