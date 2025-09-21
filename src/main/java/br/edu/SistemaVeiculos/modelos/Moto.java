package br.edu.SistemaVeiculos.modelos;

public class Moto extends Veiculos {

    private String tipo;

    public Moto(String placa, String marca, String modelo, int ano, double valor, String tipo){
        super(placa, marca, modelo, ano, valor);
        this.tipo = tipo;
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("Tipo de moto: " + tipo);
    }

    @Override
    public void mover() {
        System.out.println("A moto está acelerando na pista.");
    }

    @Override
    public void parar() {
        System.out.println("A moto parou e está apoiada no descanso.");
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
