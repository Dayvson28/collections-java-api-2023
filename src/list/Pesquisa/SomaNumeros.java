package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    //atributos
    private List<Integer> numeros;

    //construtor

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for(Integer numero : numeros)
            soma += numero;
            return soma;
        }
}
