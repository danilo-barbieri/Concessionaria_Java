package OO;

public class Carro{
    private String modelo;
    private int ano;
    private String marca;
    private String cor;
    private double preco;
    private Double km;
    private boolean disponibilidade;

    public Carro(String modelo, int ano, String marca, String cor, double preco, double km) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
        this.km = km;
        this.disponibilidade = true;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public Double getkm() { return km;}

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void marcarComoVendido() {
        disponibilidade = false;
    }
}

