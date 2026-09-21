public class Pix extends FormaPagamento {

    @Override
    public void pagar(double valor) {

       if (!validarValor(valor)) {
        this.valor = valor;
        status = "Recusado";
        return;
        }
    
        this.valor = valor;
        status = "Aprovado";

        System.out.println("Pagamento via Pix realizado com sucesso!");
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("===== PAGAMENTO PIX =====");
        System.out.println("Tipo: Pix");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
        System.out.println("Pagamento instantâneo.");
    }
}
