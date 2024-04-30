package Models
        
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeCarros {
    private List<Carros> carros;

    // Construtor
    public GerenciadorDeCarros() {
        this.carros = new ArrayList<>();
    }

    // Método para adicionar um novo carro à lista
    public void adicionarCarro(Carros novoCarros) {
        // Verificar se já existe um carro com a mesma placa
        if (!existeCarroComPlaca(novoCarros.getPlaca())) {
            carros.add(novoCarros);
            System.out.println("Carro adicionado com sucesso!");
        } else {
            System.out.println("Já existe um carro com esta placa!");
        }
    }

    // Método para verificar se já existe um carro com a mesma placa
    private boolean existeCarroComPlaca(String placa) {
        for (Carros carros : this.carros) {
            if (carros.getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }

    // Método para retornar a lista completa de carros cadastrados
    public List<Carros> obterTodosCarros() {
        return carros;
    }

    // Método para retornar um carro específico dado sua placa
    public Carros obterCarroPorPlaca(String placa) {
        for (Carros carros : this.carros) {
            if (carros.getPlaca().equals(placa)) {
                return carros;
            }
        }
        return null; // Retornar null se o carro não for encontrado
    }

    // Método para atualizar o modelo e a cor de um carro
    public void atualizarCarro(String placa, String novoModelo, String novaCor) {
        Carros carros = obterCarroPorPlaca(placa);
        if (carros != null) {
            carros.setModelo(novoModelo);
            carros.setCor(novaCor);
            System.out.println("Carro atualizado com sucesso!");
        } else {
            System.out.println("Carro não encontrado!");
        }
    }

    // Sobrecarga do método para atualizar apenas o modelo de um carro
    public void atualizarCarros(String placa, String novoModelo) {
        Carros carros = obterCarroPorPlaca(placa);
        if (carros != null) {
            carros.setModelo(novoModelo);
            System.out.println("Modelo do carro atualizado com sucesso!");
        } else {
            System.out.println("Carro não encontrado!");
        }
    }

    // Sobrecarga do método para atualizar apenas a cor de um carro
    public void atualizarCarro(String placa, String novaCor) {
        Carros carros = obterCarroPorPlaca(placa);
        if (carros != null) {
            carros.setCor(novaCor);
            System.out.println("Cor do carro atualizada com sucesso!");
        } else {
            System.out.println("Carro não encontrado!");
        }
    }

    // Método para remover um carro específico pela sua placa
    public void removerCarro(String placa) {
        Carros carros = obterCarroPorPlaca(placa);
        if (carros != null) {
            this.carros.remove(carros);
            System.out.println("Carro removido com sucesso!");
        } else {
            System.out.println("Carro não encontrado!");
        }
    }
}

        
