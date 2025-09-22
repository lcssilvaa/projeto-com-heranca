package br.edu.SistemaVeiculos.modelos;
public class Carro extends Veiculos {

    private String tipo;

     public Carro(String placa, String marca, String modelo, int ano, double valor, String tipo) {
        super(placa,marca,modelo,ano,valor); 
    }

    public void mover(){
        System.out.println("O carro está se movendo.");
    }

    public void parar() {
        System.out.println("O carro parou.");
    }

    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("Tipo de carro: " + tipo);
    }

    @Override
    public String toString() {
        return "Carro{" +
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