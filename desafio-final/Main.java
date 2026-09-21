public class Main {

    public static void main(String[] args) {

     
        Pix pix = new Pix();
        Debito debito = new Debito();
        Credito credito = new Credito();

   
        pix.pagar(150.00);
        pix.exibirDetalhes();

        System.out.println();

     

        debito.pagar(200.00);
        debito.exibirDetalhes();

        System.out.println();

  
        credito.pagar(300.00);
        credito.exibirDetalhes();

        System.out.println();

  

        pix.pagar(0);
        pix.exibirDetalhes();
    }
}
