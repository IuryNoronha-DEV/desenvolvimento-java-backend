public abstract class FormaPagamento {

    protected double valor;
    protected String status;

    protected boolean validarValor(double valor) {

        if (valor <= 0) {
            System.out.println("Pagamento recusado: o valor deve ser maior que zero.");
            return false;
        }

        return true;
    }

    public abstract void pagar(double valor);

    public abstract void exibirDetalhes();
}
