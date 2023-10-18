package br.senai.sp.jandira.model;

public class Cachorro extends Animal{

    @Override
    public void fazerSom() {
        System.out.println("Au au");
        super.fazerSom();
    }
}
