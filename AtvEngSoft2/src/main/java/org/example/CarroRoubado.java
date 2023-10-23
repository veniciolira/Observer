package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarroRoubado {
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notificarObservers(String mensagem) {
        for (Observer observer : observers) {
            observer.atualizar(mensagem);
        }
    }

    public void virarEsquerda() {
        System.out.println("Carro roubado virou a esquerda...");
        notificarObservers("Viatura virou a esquerda...");
    }

    public void virarDireita() {
        System.out.println("Carro roubado virou a direita...");
        notificarObservers("Viatura virou a direita...");
    }

    public void parar() {
        System.out.println("Carro roubado parou...");
        notificarObservers("Viatura parou...");
    }
}
