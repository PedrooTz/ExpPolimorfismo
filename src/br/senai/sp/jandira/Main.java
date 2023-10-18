package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Animal;
import br.senai.sp.jandira.model.Cachorro;
import br.senai.sp.jandira.model.Vaca;



public class Main {
    public static void main(String[] args) {
        Animal vaca = new Vaca();
        vaca.fazerSom();
        Animal cachorro = new Cachorro();
        cachorro.fazerSom();
    }
}
