package teste1;

public class ListaJuncao extends Cartas {

    private Pilha2 head1;
    private EXTRA head2;
    private PilhaOrdenada2 head3;
    private long numelementos;

    private class Celula1 {

        Pilha2 item;
        Celula1 prox;

    }

    private class Celula2 {

        EXTRA item;
        Celula2 prox;

    }

    private class Celula3 {

        PilhaOrdenada2 item;
        Celula3 prox;

    }

    public void inserirPliha(Pilha2 a) {
        this.numelementos++;
        this.head1 = a;
    }

    public void inserirExtra(EXTRA b) {
        this.numelementos++;
        this.head2 = b;
    }

    public void inserirOrdena(PilhaOrdenada2 c) {
        this.numelementos++;
        this.head3 = c;
    }

    public Pilha2 Pilha() {

        return this.head1;
    }

    public EXTRA Extra() {
        return this.head2;
    }

    public PilhaOrdenada2 Ordena() {
        return this.head3;
    }
}
