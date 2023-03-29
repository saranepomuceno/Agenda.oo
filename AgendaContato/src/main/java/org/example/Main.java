package org.example;
import agenda.*;
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("rua da taboca", "994", "centro", "mamanguape", "solído");
        Contato contato = new Contato("Chatonildo ", endereco);
        System.out.println(endereco.toString());
        System.out.println(contato.toString());
    }
}