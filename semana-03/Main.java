public class Main {

    public static void main(String[] args) {

        Elevador elevador = new Elevador(1, 500);

        System.out.println("===== TESTE 1 - SUBIDA NORMAL =====");

        elevador.adicionarPeso(300);

        System.out.println("Peso atual: " + elevador.getPesoAtual() + " kg");

        elevador.subir();

        System.out.println();


        System.out.println("===== TESTE 2 - EXCESSO DE PESO =====");

        elevador.adicionarPeso(300);

        System.out.println("Peso atual: " + elevador.getPesoAtual() + " kg");

        elevador.subir();

        System.out.println(
            "Andar atual: " + elevador.getAndarAtual()
        );
    }
}
