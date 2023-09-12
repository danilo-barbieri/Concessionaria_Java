package OO;

import java.util.Date;

public class Venda {
    private Date dataVenda;
    private Carro carroVendido;
    private Vendedor vendedor;
    private int anoVenda;

    public Venda(Carro carro) {
        this.dataVenda = new Date();
        this.carroVendido = carro;
        this.vendedor = vendedor;
        this.anoVenda = anoVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public Carro getCarroVendido() {
        return carroVendido;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public int getAnoVenda() {
        return anoVenda;
    }
}

