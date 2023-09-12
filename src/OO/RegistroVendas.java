package OO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.text.SimpleDateFormat;

public class RegistroVendas {

    private List<Venda> vendasAnuais;


    public RegistroVendas() {
            vendasAnuais = new ArrayList<>();
        }

    public void adicionarVenda(Carro carro) {
        Venda venda = new Venda(carro);
        vendasAnuais.add(venda);
    }


    public void RelatorioAnual(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
        SimpleDateFormat dateFormatDia = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = new GregorianCalendar();
        int[] contadorMeses = new int[12]; // Um contador para cada mês

            System.out.println("==== Relatório Anual de Vendas ====");
            for (Venda venda : vendasAnuais) {
            Date dataVenda = venda.getDataVenda();
            calendar.setTime(dataVenda);
         int mes = calendar.get(Calendar.MONTH);
            contadorMeses[mes]++;
            System.out.println("Data: " + dateFormatDia.format(dataVenda) +
                ", Modelo: " + venda.getCarroVendido().getModelo() +
                ", Mês: " + (mes + 1)); // O mês começa em 0
    }

        for (int i = 0; i < contadorMeses.length; i++) {
        System.out.println("Mês " + (i + 1) + ": " + contadorMeses[i] + " carros vendidos.");
    }
}
}


