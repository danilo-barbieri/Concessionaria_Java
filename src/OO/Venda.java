package OO;

import java.util.Date;

public class Venda {
    private Date dataVenda;
    private Carro carroVendido;
    private Vendedor vendedor;

    public Venda(Carro carro, Vendedor vendedor) {
        this.dataVenda = new Date();
        this.carroVendido = carro;
        this.vendedor = vendedor;
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
}

