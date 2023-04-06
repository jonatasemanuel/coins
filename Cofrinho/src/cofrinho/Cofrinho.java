package cofrinho;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }
    public void remover(Moeda moeda) {
        listaMoedas.remove(moeda);
    }
    public void listagemMoedas() {
        for (Moeda moeda : listaMoedas) {
            System.out.println(moeda);
        }
    }
    public void totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        System.out.println(total);
    }
}
