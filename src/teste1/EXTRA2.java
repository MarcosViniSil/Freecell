package teste1;

public class EXTRA2 extends EXTRA {



    public void remover(int indice, String pilha,Pilha2 f) {//de extra para pilha
        Cartas gh = encontra(indice);//encontra a carta a ser excluida
        if (pilha.equals("P1")) {
            if (!gh.cor.equals(f.P1.top.item.cor) && gh.numero == f.P1.top.item.numero - 1) {//verifica se pode ser inserida antes de excluir
                Cartas g = excluir(indice);
                f.P1.empilharPilha(g);
            } else {
                System.out.println("nao e possivel inserir");
            }

        } else if (pilha.equals("P2")) {
            if (!gh.cor.equals(f.P2.top.item.cor) && gh.numero == f.P2.top.item.numero - 1) {
                Cartas g = excluir(indice);
                f.P2.empilharPilha(g);
            } else {
                System.out.println("nao e possivel inserir");
            }
        } else if (pilha.equals("P3")) {
            if (!gh.cor.equals(f.P3.top.item.cor) && gh.numero == f.P3.top.item.numero - 1) {
                Cartas g = excluir(indice);
                f.P3.empilharPilha(g);
            } else {
                System.out.println("nao e possivel inserir");
            }
        } else if (pilha.equals("P4")) {
            if (!gh.cor.equals(f.P4.top.item.cor) && gh.numero == f.P4.top.item.numero - 1) {
                Cartas g = excluir(indice);
                f.P4.empilharPilha(g);
            } else {
                System.out.println("nao e possivel inserir");
            }
        } else if (pilha.equals("P5")) {
            if (!gh.cor.equals(f.P5.top.item.cor) && gh.numero == f.P5.top.item.numero - 1) {
                Cartas g = excluir(indice);
                f.P5.empilharPilha(g);
            } else {
                System.out.println("nao e possivel inserir");
            }
        } else if (pilha.equals("P6")) {
            if (!gh.cor.equals(f.P6.top.item.cor) && gh.numero == f.P6.top.item.numero - 1) {
                Cartas g = excluir(indice);
                f.P6.empilharPilha(g);
            } else {
                System.out.println("nao e possivel inserir");
            }
        } else if (pilha.equals("P7")) {
            if (!gh.cor.equals(f.P7.top.item.cor) && gh.numero == f.P7.top.item.numero - 1) {
                Cartas g = excluir(indice);
                f.P7.empilharPilha(g);
            } else {
                System.out.println("nao e possivel inserir");
            }
        } else if (pilha.equals("P8")) {
            if (!gh.cor.equals(f.P8.top.item.cor) && gh.numero == f.P8.top.item.numero - 1) {
                Cartas g = excluir(indice);
                f.P8.empilharPilha(g);
            } else {
                System.out.println("nao e possivel inserir");
            }
        }
    }

    public void inserui(String pilha,Pilha2 f) {

        if (pilha.equals("P1")) {
            boolean cer = inserir(f.P1.top.item);
            if (cer) {
                f.P1.desempilhar();
            } else {
                System.out.println("nao e possivel");
            }
        } else if (pilha.equals("P2")) {
            boolean cer = inserir(f.P2.top.item);
            if (cer) {
                f.P2.desempilhar();
            } else {
                System.out.println("nao e possivel");
            }
        } else if (pilha.equals("P3")) {
            boolean cer = inserir(f.P3.top.item);
            if (cer) {
                f.P3.desempilhar();
            } else {
                System.out.println("nao e possivel");
            }
        } else if (pilha.equals("P4")) {
            boolean cer = inserir(f.P4.top.item);
            if (cer) {
                f.P4.desempilhar();
            } else {
                System.out.println("nao e possivel");
            }
        } else if (pilha.equals("P5")) {
            boolean cer = inserir(f.P5.top.item);
            if (cer) {
                f.P5.desempilhar();
            } else {
                System.out.println("nao e possivel");
            }
        } else if (pilha.equals("P6")) {
            boolean cer = inserir(f.P6.top.item);
            if (cer) {
                f.P6.desempilhar();
            } else {
                System.out.println("nao e possivel");
            }
        } else if (pilha.equals("P7")) {
            boolean cer = inserir(f.P7.top.item);
            if (cer) {
                f.P7.desempilhar();
            } else {
                System.out.println("nao e possivel");
            }
        } else if (pilha.equals("P8")) {
            boolean cer = inserir(f.P8.top.item);
            if (cer) {
                f.P8.desempilhar();
                System.out.println("desem");
            } else {
                System.out.println("nao e possivel");
            }
        }
    }

    public void inserirordena(String escolha, PilhaOrdenada2 f, int posicao) {
        if (escolha.equals("O1")) {
            inserirOrdena(f.O1, posicao);
        } else if (escolha.equals("O2")) {
            inserirOrdena(f.O2, posicao);
        } else if (escolha.equals("O3")) {
            inserirOrdena(f.O3, posicao);
        } else if (escolha.equals("O4")) {
            inserirOrdena(f.O4, posicao);
        } else {
            System.out.println("nao e possivel");
        }

    }

}
