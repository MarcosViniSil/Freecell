package teste1;

import java.util.Random;

public class SORTEIO1 {

    private Object itens[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,
        36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52};
    private int tamanho;
    private int numElementos;

    public SORTEIO1() {
        this.numElementos = 52;
        this.tamanho = 52;
    }

    public Object sortear() {

        Random sd = new Random();
        int va  = sd.nextInt(52);
        int a = this.numElementos;
        int b = this.numElementos;

        Object valor = 0;
        int posicao = 0;
        while (a == b) {

            if (va  < this.numElementos) {
                valor = this.itens[va];
                this.numElementos--;
                a = this.numElementos;
                for (int I = va; I < numElementos; I++) {

                    itens[I] = itens[I + 1];

                }

                itens[this.numElementos] = null;

            } else {
                va  = sd.nextInt(52);
            }

        }

        return valor;
    }
}
