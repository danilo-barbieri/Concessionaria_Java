package OO;

public class Comprador {
    private String nome;
    private int id;

    public Comprador(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
}
