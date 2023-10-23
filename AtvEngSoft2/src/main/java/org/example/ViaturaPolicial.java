package org.example;

public class ViaturaPolicial implements Observer {
    private String nome;

    public ViaturaPolicial(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " " + mensagem);
    }
}
