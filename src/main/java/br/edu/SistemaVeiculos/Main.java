package br.edu.SistemaVeiculos;
import java.util.ArrayList;
import br.edu.SistemaVeiculos.modelos.Carro;
import br.edu.SistemaVeiculos.modelos.Moto;
import br.edu.SistemaVeiculos.modelos.Veiculos;


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

        ArrayList<Veiculos> listaVeiculosC = new ArrayList<>();

        listaVeiculosC.add(new Carro("ABC-1234", "Toyota", "Corolla", 2022, 120000,"sedan"));
        listaVeiculosC.add(new Carro("XYZ-5678", "Honda", "Civic", 2021, 110000,"hatch"));
        listaVeiculosC.add(new Carro("XYZ-5698", "Honda", "City", 2022, 90000,"sedan"));

        for (Veiculos v : listaVeiculosC) {
            v.exibirInfos();
            v.mover();
            v.parar();
            System.out.println("---------------------");
        }
    }
}