package Cartas;

import Cartas.Naipe;
import Cartas.Valor;

public class Carta {
    //Defindo  os Atributos
   private Naipe naipe;
   private Valor valor;

    //Metodos Acessores(gets/sets)
    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    //Imprimi no metodo exibir o Valor e Naipe da Carta
    @Override
    public String toString() {
        return   "NAIPE: " + naipe + "\n"
                +"VALOR: " + valor + "\n";
    }
}
