package OO;

public class Vendedor {
    private String nome;
    private int id;

    public Vendedor(String nome, int id) {
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

