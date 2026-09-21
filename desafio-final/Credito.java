public class Credito extends FormaPagamento {

    private double limite = 1000.00;

    @Override
    public void pagar(double valor) {

        if (!validarValor(valor)) {
            status = "Recusado";
            return;
        }

        if (valor > limite) {
            status = "Recusado";
            System.out.println("Pagamento no crédito recusado: limite insuficiente.");
            return;
        }

        this.valor = valor;
        limite -= valor;
        status = "Aprovado";

        System.out.println("Pagamento no crédito realizado com sucesso!");
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("===== PAGAMENTO CRÉDITO =====");
        System.out.println("Tipo: Crédito");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
        System.out.println("Limite restante: R$ " + limite);
    }
}
