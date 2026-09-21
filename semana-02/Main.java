public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Ana";
        pessoa1.idade = 20;
        pessoa1.profissao = "Estudante";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Bruno";
        pessoa2.idade = 25;
        pessoa2.profissao = "Professor";

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Carla";
        pessoa3.idade = 22;
        pessoa3.profissao = "Designer";

        Pessoa maisVelha = pessoa1;

        if (pessoa2.idade > maisVelha.idade) {
            maisVelha = pessoa2;
        }

        if (pessoa3.idade > maisVelha.idade) {
            maisVelha = pessoa3;
        }

        System.out.println("===== EXERCÍCIO 1 - PESSOAS =====");
        System.out.println("A pessoa mais velha é: " + maisVelha.nome);
        System.out.println("Idade: " + maisVelha.idade + " anos");

        System.out.println();

        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2022;

        carro1.modelo = "Corolla Cross";

        System.out.println("===== EXERCÍCIO 2 - CARROS =====");

        System.out.println("Carro 1:");
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        System.out.println();

        System.out.println("Carro 2:");
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);

  
    }
}
