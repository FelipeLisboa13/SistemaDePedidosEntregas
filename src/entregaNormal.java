public class entregaNormal extends Entrega {


    private int Frete = 10;

    public entregaNormal(String cliente) {
        super(cliente);
    }
    public double getTotal(){
        return getValorP() + 10;
    }

    @Override
    public void pedir(double valor_Produtos) {
        super.pedir(valor_Produtos);
        IO.println("Tipo de Entrega Normal");
        IO.println("Entrega " + getRetirada().plusDays(10));
        IO.println("Total R$: " + getTotal() );


    }


}



