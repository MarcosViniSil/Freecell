package teste1;

import java.util.Random;

public class SORTEIO2 {

    private Object itens[] = {1, 2, 3, 4, 5, 6, 7, 8};
    private int tamanho;
    private int numElementos;

    public SORTEIO2() {
        this.numElementos = 8;
        this.tamanho = 8;
    }

    public Object sortear() {
        Random sd = new Random();
        int i = sd.nextInt(8);
        int a = this.numElementos;
        int b = this.numElementos;

        Object valor = 0;

        while (a == b) {
            if (i < this.numElementos) {
                valor = this.itens[i];
                numElementos--;
                a = this.numElementos;
                for (int I = i; I < numElementos; I++) {

                    itens[I] = itens[I + 1];

                }
                this.itens[this.numElementos] = null;

            } else {
                i = sd.nextInt(8);
            }
        }

        return valor;
    }
}
