import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();

        Carro carro1 = new Carro("Veneno", "Lamborguinni", 2026, "HJF-09KD", 3200);
        Moto moto1 = new Moto("Yamaha", "MT-03", 2027, "KJJ-213", 263, 300 );


        //locadora.adicionarVeiculo(carro1);
        //locadora.adicionarVeiculo(moto1);
        locadora.listarVeiculo();

        int tamanho = locadora.getFrota().size();

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o veiculo (1 a " + tamanho + "): ");
        int veiculoSelecionado = sc.nextInt();

        System.out.println("Quantos dias voce deseja ficar com o veículo ");
        int dias = sc.nextInt();

        locadora.aluguelVeiculo(dias, veiculoSelecionado);








    }

}
