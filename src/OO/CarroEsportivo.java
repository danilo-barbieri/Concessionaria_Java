package OO;

public class CarroEsportivo extends Carro {
        private int potenciaMotor;
        private double aceleracao;

        public CarroEsportivo(String modelo, int ano, String marca, String cor, double preco, int potenciaMotor, double aceleracao, double km) {
            super(modelo, ano, marca, cor, preco, km);
            this.potenciaMotor = potenciaMotor;
            this.aceleracao = aceleracao;
        }

        public int getPotenciaMotor() {
            return potenciaMotor;
        }

        public double getAceleracao() {
            return aceleracao;
        }
    }

