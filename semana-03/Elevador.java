public class Elevador {

    private int andarAtual;
    private double pesoMaximo;
    private double pesoAtual;

    public Elevador(int andarAtual, double pesoMaximo) {
        this.andarAtual = andarAtual;
        this.pesoMaximo = pesoMaximo;
        this.pesoAtual = 0;
    }

    public void adicionarPeso(double peso) {
        pesoAtual += peso;
    }

    public void removerPeso(double peso) {
        pesoAtual -= peso;

        if (pesoAtual < 0) {
            pesoAtual = 0;
        }
    }

    public void subir() {

        if (pesoAtual > pesoMaximo) {
            System.out.println(
                "O elevador não vai subir. Excesso de peso!"
            );
        } else {
            andarAtual++;
            System.out.println(
                "Elevador subiu para o andar " + andarAtual
            );
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }
}
