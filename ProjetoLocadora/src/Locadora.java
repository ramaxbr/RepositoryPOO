import java.util.List;
import java.util.ArrayList;

public class Locadora{

    private List <Veiculo> frota;



    public void adicionarVeiculo(Veiculo veiculo){
        this.frota = new ArrayList<>();
        frota.add(veiculo);
    }

    public void listarVeiculo(){
        for (int i = 0; i < frota.size() ; i++) {
            Veiculo v = frota.get(i);
            System.out.printf("[%d] %s %s | Diaria: R$ %f\n", (i + 1), v.getMarca(), v.getModelo());
        }    }

        public void aluguelVeiculo(int dias, int idVeiculo){
            //Implementar a logica para alugar um carro/moto

            Veiculo v = frota.get(idVeiculo - 1);
            double total = v.calcularDiaria() * dias;

            System.out.println(" ==== Resumo do aluguel veiculo ====");
            System.out.println("Veículo: " + v.exibirDados());
            System.out.println("qtd dias: " + dias);
            System.out.printf("Valor diário: %.2f ", v.calcularDiaria());
            System.out.printf("\nTotal do periodo da regencia: %.2f ", total);

        }

public List<Veiculo> getFrota(){
        return frota;
}


       }










