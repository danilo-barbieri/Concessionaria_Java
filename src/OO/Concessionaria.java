package OO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Concessionaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();
        List<Vendedor> vendedores = new ArrayList<>();
        List<Comprador> compradores = new ArrayList<>();
        RegistroVendas registroAnualVendas = new RegistroVendas();

        while (true) {
            System.out.println("==== Menu ====");
            System.out.println("1. Adicionar Carro");
            System.out.println("2. Listar Carros Disponíveis");
            System.out.println("3. Registrar Venda");
            System.out.println("4. Listar Vendas Anuais");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Informe o modelo do carro: ");
                    String modelo = scanner.next();
                    System.out.print("Informe o ano do carro: ");
                    int ano = scanner.nextInt();
                    System.out.print("Informe a marca do carro: ");
                    String marca = scanner.next();
                    System.out.print("Informe a cor do carro: ");
                    String cor = scanner.next();
                    System.out.print("Informe o preço do carro: ");
                    double preco = scanner.nextDouble();
                    System.out.println("Informe a quilometragem do carro: ");
                    Double km = scanner.nextDouble();
                    System.out.print("O carro é esportivo (S/N): ");
                    char tipoCarro = scanner.next().charAt(0);

                    Carro carro;
                    if (Character.toUpperCase(tipoCarro) == 'S') {
                        System.out.print("Informe a potência do motor: ");
                        int potenciaMotor = scanner.nextInt();
                        System.out.print("Informe a aceleração: ");
                        double aceleracao = scanner.nextDouble();
                        carro = new CarroEsportivo(modelo, ano, marca, cor, preco, potenciaMotor, aceleracao, km);
                    } else {
                        System.out.print("Informe a capacidade de passageiros: ");
                        int capacidadePassageiros = scanner.nextInt();
                        System.out.print("Informe o espaço no porta-malas: ");
                        double espacoPortaMalas = scanner.nextDouble();
                        carro = new CarroFamiliar(modelo, ano, marca, cor, preco, capacidadePassageiros, espacoPortaMalas, km);
                    }

                    carros.add(carro);
                    System.out.println("Carro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Carros Disponíveis:");
                    for (int i = 0; i < carros.size(); i++) {
                        Carro c = carros.get(i);
                        if (c.isDisponivel()) {
                            System.out.println("Índice: " + i +
                                    ", Modelo: " + c.getModelo() +
                                    ", Ano: " + c.getAno() +
                                    ", Marca: " + c.getMarca() +
                                    ", Cor: " + c.getCor() +
                                    ", Quilometragem: " + c.getkm());
                        }
                    }
                    break;

                case 3:
                    System.out.println("==== Registrar Venda ====");
                    System.out.print("Informe o índice do carro que foi vendido: ");
                    int indiceCarroVendido = scanner.nextInt();

                    if (indiceCarroVendido >= 0 && indiceCarroVendido < carros.size()) {
                        Carro carroVendido = carros.get(indiceCarroVendido);

                        System.out.print("Informe o nome do vendedor: ");
                        String nomeVendedor = scanner.next();
                        registroAnualVendas.adicionarVenda(carroVendido);
                        carroVendido.marcarComoVendido();
                        System.out.println("Venda registrada com sucesso!");
                    } else {
                        System.out.println("Índice de carro inválido.");
                    }
                    break;

                case 4:
                    registroAnualVendas.RelatorioAnual();
                    break;

                case 5:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
