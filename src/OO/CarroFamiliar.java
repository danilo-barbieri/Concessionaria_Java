package OO;

public class CarroFamiliar extends Carro{
    private int capacidadePassageiros;
    private double espacoPortaMalas;

    public CarroFamiliar(String modelo, int ano, String marca, String cor, double preco, int capacidadePassageiros, double espacoPortaMalas, double km) {
        super(modelo, ano, marca, cor, preco, km);
        this.capacidadePassageiros = capacidadePassageiros;
        this.espacoPortaMalas = espacoPortaMalas;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public double getEspacoPortaMalas() {
        return espacoPortaMalas;
    }
}
