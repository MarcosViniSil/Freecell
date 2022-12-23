package teste1;

public class PilhaOrdenada extends Pilha {

    protected Celula top;
    protected Celula head;
    protected long numelementos;
    private boolean pode;

    public long getNumelementos() {
        return numelementos;
    }

    public boolean isPode() {
        return pode;
    }

    protected class Celula {

        Celula ant;
        Celula prox;
        Cartas item;

    }

    protected boolean empilharExtra(Cartas a) {//inserir de extra para pilha ordenada
        Celula novo = new Celula();
        novo.item = a;
        if (vazia() && a.numero == 1) {
            head = novo;
            top = novo;
            pode = true;
            this.numelementos++;
            return true;
        } else if (!vazia()) {
            if (a.cor.equals(top.item.cor) && a.numero == top.item.numero + 1 && a.simbolo.equals(top.item.simbolo) && this.numelementos < 13) {
                novo.ant = top;
                top.prox = novo;
                top = novo;
                this.numelementos++;
                return true;
            } else {

                System.out.println("Nao e posssivel inserir esta carta,tente outra");
                return false;
            }
        } else {
            System.out.println("nao e possivel");
            return false;
        }

    }

    protected boolean empilharPilhaa(Pilha a) {
        Celula novo = new Celula();
        novo.item = a.top.item;
        if (vazia() && a.top.item.numero == 1) {
            head = novo;
            top = novo;
            pode = true;
            this.numelementos++;
            return true;
        } else if (!vazia()) {
            if (a.top.item.cor.equals(top.item.cor) && a.top.item.numero == top.item.numero + 1 && a.top.item.simbolo.equals(top.item.simbolo) && this.numelementos < 13) {
                novo.ant = top;
                top.prox = novo;
                top = novo;
                this.numelementos++;
                return true;
            } else {

                System.out.println("Nao e posssivel inserir esta carta,tente outra");
                return false;
            }
        } else {
            System.out.println("nao e possivel");
            return false;
        }

    }

    @Override
    public boolean vazia() {
        if (head != null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean ganhou() {
        if (this.getNumelementos() == 13) {
            return true;
        } else {
            return false;
        }
    }

    public String imprime1() {
        if (pode == true) {

            StringBuilder sd = new StringBuilder();

            sd.append(top.item.numero);
            sd.append(top.item.cor);
            sd.append(top.item.simbolo);
            System.out.println("\t");
            return sd.toString();

        } else {
           
        }
        return "";

    }
}
