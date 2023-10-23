package org.example;

public class PerseguicaoPolicial {
    public static void main(String[] args) {
        CarroRoubado carroRoubado = new CarroRoubado();

        ViaturaPolicial viatura1 = new ViaturaPolicial("Viatura 1");
        ViaturaPolicial viatura2 = new ViaturaPolicial("Viatura 2");

        carroRoubado.adicionarObserver(viatura1);
        carroRoubado.adicionarObserver(viatura2);

        // Chama os métodos separadamente
        carroRoubado.virarEsquerda();
        carroRoubado.virarDireita();
        carroRoubado.parar();

        // Remova os observadores se necessário
        carroRoubado.removerObserver(viatura1);
        carroRoubado.removerObserver(viatura2);
    }
}
