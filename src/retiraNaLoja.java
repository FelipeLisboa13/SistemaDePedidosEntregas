public class retiraNaLoja extends Entrega{

    public retiraNaLoja(String cliente) {
        super(cliente);
    }
    public double getTotal(){
        return getValorP() + 0;
    }

    @Override
    public void pedir(double valor_Produtos) {
        super.pedir(valor_Produtos);
        IO.println("Retirar Na loja");
        IO.println("Entrega " + getRetirada().plusDays(0));
        IO.println("Total R$: " + getTotal());

    }

}
