import java.time.LocalDate;

 public abstract class Entrega {

   private int numeroP = 0;
   private String cliente;
   private LocalDate retirada;
   private double valorP;

   public Entrega(String cliente){
     numeroP += 1;
     this.cliente = cliente;
     retirada = LocalDate.now();

 }
     public int getNumeroP() {
         return numeroP;
     }

     public void setNumeroP(int numeroP) {
         this.numeroP = numeroP;
     }

     public String getCliente() {
         return cliente;
     }

     public void setCliente(String cliente) {
         this.cliente = cliente;
     }

     public LocalDate getRetirada() {
         return retirada;
     }

     public void setRetirada(LocalDate retirada) {
         this.retirada = retirada;

     }

     public double getValorP() {
         return valorP;
     }

     public void setValorP(double valorP)    {
         this.valorP = valorP;
     }

     public void pedir(double valor_Produtos){
         if (valor_Produtos < 0){
             IO.println("Valor Invalido");
         }else{
             IO.println("Valor do Pedido: " + valor_Produtos);
            valorP = valor_Produtos;
         }
         IO.println("Numero do pedido: " + numeroP);
         IO.println("Cliente: " + cliente);
         IO.println("Data de Retirada: " + retirada);
         IO.println("Valor dos itens: " + valorP);


   }




 }





