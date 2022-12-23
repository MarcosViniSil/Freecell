package teste1;

import java.util.Scanner;

public class Pilha extends Cartas2 implements IPilha {

    protected Celula top;
    protected Celula head;
    protected long numelementos;

    private Cartas2 p = new Cartas2();//para testes das cartas,sem a utilizacao de heanca

    protected class Celula {

        Celula ant;
        Celula prox;
        Cartas item;

    }

    public long getNumelementos() {
        return numelementos;
    }

    public void setNumelementos(long numelementos) {
        this.numelementos = numelementos;
    }

    @Override
    public void empilharSorteio(int valor) {//insere as cartas aleatorias nas 8 pilhas

        Celula novo = new Celula();

        novo.item = p.Escolha(valor);

        if (head == null) {
            head = novo;
            top = novo;
        } else {
            novo.ant = top;
            top.prox = novo;
            top = novo;
        }
        this.numelementos++;

    }

    @Override
    public boolean empilharPilha(Cartas a) {
        Celula novo = new Celula();
        novo.item = a;

        if (head == null) {
            head = novo;
            top = novo;
            this.numelementos++;
            System.out.println("inserido");
            return true;
        } else {
            if (a != null && !a.cor.equals(top.item.cor) && a.numero == top.item.numero - 1) {
                novo.ant = top;
                top.prox = novo;
                top = novo;
                this.numelementos++;
                System.out.println("inserido");
                return true;
            } else {

                System.out.println("nao e possivel inserir esta carta");
                return false;
            }
        }

    }

    private boolean Pilhaaux(Cartas a, Pilha b) {//pilha auxiliar criada para o "arrastar" mais de 1 carta
        Celula novo = new Celula();
        novo.item = a;

        if (head == null) {
            head = novo;
            top = novo;
            this.numelementos++;
            System.out.println("inserido");

        } else {
            if (!a.cor.equals(top.item.cor) && a.numero == top.item.numero + 1) {
                novo.ant = top;
                top.prox = novo;
                top = novo;
                this.numelementos++;
                System.out.println("inserido");

            } else {

                System.out.println("a carta nao cumpre os requisitos");
                if (b.top.ant.item.numero == b.top.item.numero + 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void empilharmais1(EXTRA2 a, Pilha b, Pilha c) {//"arrastar" mais de 1 cartas
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int cont2 = 0;
        int posicao;
        int o = a.getNumelementos();
        int y = 5 - o;
        System.out.println("voce pode mover no maximo: " + y + " cartas");
        System.out.println("digite a quantidade de elementos");
        posicao = sc.nextInt();

        if (posicao <= y) {
            Celula aux = b.top;
            int gh = 0;
            while (gh < posicao - 1) {
                if (aux.item.numero == aux.ant.item.numero - 1 && !(aux.item.cor.equals(aux.ant.item.cor))) {
                    cont++;
                }
                gh++;
                aux = aux.ant;
            }

            if (cont == posicao - 1) {

                Cartas vet[] = new Cartas[5];
                Celula aux2 = b.top;
                int indice = 0;
                while (cont2 < posicao) {

                    vet[indice] = aux2.item;
                    cont2++;
                    indice++;
                    aux2 = aux2.ant;
                }

                for (int j = 0; j < vet.length; j++) {
                    if (vet[j] != null) {
                        System.out.println("vetor----");
                        System.out.println(vet[j].cor + vet[j].numero);
                        System.out.println("--------");
                    }
                }
                for (int j = 4; j >= 0; j--) {
                    System.out.println(j);
                    if (vet[j] != null) {
                        System.out.println(vet[j].numero + vet[j].cor);
                        boolean h = c.empilharPilha(vet[j]);
                        if (h) {

                            b.desempilhar();

                        } else {
                            System.out.println("NAO E POSSIVEL");
                        }
                    }

                }
            } else {
                System.out.println("alguma carta nao esta em sequencia");
            }
        } else {
            System.out.println("posicao invalida");
        }
    }

    protected void desempilhar() {
        if (top != null) {
            top = top.ant;
            top.prox = null;
            this.numelementos--;

        } else {
            System.out.println("esta vazia");
        }

    }

    protected String imprimePilha(Celula aux, Pilha a) {

        StringBuilder sd = new StringBuilder();
        int cont = 0;
        if (aux.prox == null) {
            sd.append(a.top.item.numero);
            sd.append(a.top.item.cor);
            sd.append(a.top.item.simbolo);
            return sd.toString();
        } else if (aux.prox != null) {

            if (aux.prox != null) {
                sd.append(aux.item.numero);
                sd.append(aux.item.cor);
                sd.append(aux.item.simbolo);
                return sd.toString();
            } else {

            }

        } else {

        }
        return "\t";
    }

    public boolean vazia() {
        if (head != null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean vazia2(Celula a) {
        if (a.prox == null) {
            return true;
        } else {
            return false;
        }
    }
}
