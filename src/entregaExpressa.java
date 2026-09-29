public class entregaExpressa extends Entrega {

private int prazo = 2;

    public entregaExpressa(String cliente) {
        super(cliente);
    }
    public double getTotal(){
        return getValorP() + 2;
    }

    @Override
    public void pedir(double valor_Produtos) {
        super.pedir(valor_Produtos);
        IO.println("Tipo de Entrega Expressa");
        IO.println("Entrega " + getRetirada().plusDays(2));
        IO.println("Total R$: " + getTotal() );

    }
}
