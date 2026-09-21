public class Debito extends FormaPagamento {

    private double saldo = 500.00;

    @Override
    public void pagar(double valor) {

        if (!validarValor(valor)) {
            status = "Recusado";
            return;
        }

        if (valor > saldo) {
            status = "Recusado";
            System.out.println("Pagamento no débito recusado: saldo insuficiente.");
            return;
        }

        this.valor = valor;
        saldo -= valor;
        status = "Aprovado";

        System.out.println("Pagamento no débito realizado com sucesso!");
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("===== PAGAMENTO DÉBITO =====");
        System.out.println("Tipo: Débito");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
        System.out.println("Saldo restante: R$ " + saldo);
    }
}
