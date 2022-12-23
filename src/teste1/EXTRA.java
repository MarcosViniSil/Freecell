package teste1;

public class EXTRA {

    protected Celula head;
    protected Celula tail;
    protected int numelementos;

    public int getNumelementos() {
        return numelementos;
    }

    public Cartas getHead() {
        return head.item;
    }

    public void setHead(Celula head) {
        this.head = head;
    }

    protected class Celula {

        Cartas item;
        Celula prox;
        Celula ant;
    }

    public EXTRA() {
        head = new Celula();
        tail = new Celula();
        head.prox = tail;
        tail.ant = head;
    }

    public boolean inserir(Cartas item) {
        if (item != null && this.numelementos < 4) {

            Celula novo = new Celula();
            novo.item = item;
            novo.ant = tail.ant;
            novo.prox = tail;
            tail.ant.prox = novo;
            tail.ant = novo;
            this.numelementos++;
            return true;
        } else {
            if (this.numelementos == 4) {
                System.out.println("esta cheio,remova 1 carta");
            } else {
                System.out.println("elemento nulo");
            }
            return false;
        }

    }

    public Cartas encontra(int indice) {
        Celula aux = head.prox;
        if (indice >= 0 && this.numelementos > 0 && indice < this.numelementos) {

            long cont = 0;
            while (cont < indice && aux != tail) {
                cont++;
                aux = aux.prox;
            }
            return aux.item;
        } else {
            return null;
        }

    }

    public Cartas excluir(int indice) {
        Celula aux = head.prox;
        if (indice >= 0 && this.numelementos > 0 && indice < this.numelementos) {

            long cont = 0;
            while (cont < indice && aux != tail) {
                cont++;
                aux = aux.prox;
            }
            aux.ant.prox = aux.prox;
            aux.prox.ant = aux.ant;
            this.numelementos--;
            return aux.item;

        } else {
            System.out.println("posicao nao encontrada");
            return null;
        }

    }

    public void inserirOrdena(PilhaOrdenada a, int posicao) {
        if (posicao >= 0 && posicao < 4) {
            Celula aux = head.prox;
            long cont = 0;
            while (cont < posicao && aux != tail) {
                cont++;
                aux = aux.prox;
            }

            boolean j = a.empilharExtra(aux.item);
            if (j) {
                this.excluir(posicao);
            } else {
                System.out.println("nao e possivel inserir esta carta");
            }
        }
    }

    public void imprimir() {
        System.out.println("\t\t\tEXTRA");
        if (head.prox != tail) {
            Celula aux = head.prox;
            int cont = 0;

            while (aux.prox != tail) {

                System.out.println("\t\t\t"+aux.item.numero + aux.item.cor + aux.item.simbolo + "{" + cont + "}");
                aux = aux.prox;
                cont++;
            }
            System.out.println("\t\t\t"+tail.ant.item.numero + tail.ant.item.cor + tail.ant.item.simbolo + "{" + cont + "}");
        } else {

        }

    }
}
