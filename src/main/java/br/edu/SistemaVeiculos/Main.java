package br.edu.SistemaVeiculos;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Sistema de Veículos!");

        //instanciando as subclasses
        Moto titan = new Moto("GDRN 252", "Honda", "Titan CG 125", 1999, 6.000, "Motocicleta urbana ");

        //armazenando em uma coleção
        ArrayList<Veiculos> lista = new ArrayList<>();
        lista.add(titan);

        //invocando os métodos
        titan.exibirInfos();
        titan.mover();
        titan.parar();
        System.out.println("------------");
    }
}