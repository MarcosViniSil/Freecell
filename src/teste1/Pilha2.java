package teste1;

import java.util.Scanner;

public class Pilha2 extends Pilha {

    protected Pilha P1 = new Pilha();
    protected Pilha P2 = new Pilha();
    protected Pilha P3 = new Pilha();
    protected Pilha P4 = new Pilha();
    protected Pilha P5 = new Pilha();
    protected Pilha P6 = new Pilha();
    protected Pilha P7 = new Pilha();
    protected Pilha P8 = new Pilha();
    private SORTEIO1 a = new SORTEIO1();//
    private SORTEIO2 A = new SORTEIO2();//sorteios como instancia porque nao seria possivel utilizar heranca

    public void Sorteio() {//a partir da classe "Pilha" sorteia os valores e insere nas 8 pilhas de forma aleatoria

        int sorte1 = (int) A.sortear();
        int sorte2 = (int) A.sortear();
        int sorte3 = (int) A.sortear();
        int sorte4 = (int) A.sortear();//sorteia 4 numeros para determinar quais pilhas teram mais elementos,para completar 52 cartas

        if (sorte1 == 1 || sorte2 == 1 || sorte3 == 1 || sorte4 == 1) {
            for (int i = 0; i < 7; i++) {
                P1.empilharSorteio((int) a.sortear());
            }

        } else {

            if (P1.vazia()) {
                for (int i = 0; i < 6; i++) {
                    P1.empilharSorteio((int) a.sortear());
                }
            }

        }
        if (sorte1 == 2 || sorte2 == 2 || sorte3 == 2 || sorte4 == 2) {
            for (int i = 0; i < 7; i++) {
                P2.empilharSorteio((int) a.sortear());
            }

        } else {

            if (P2.vazia()) {
                for (int i = 0; i < 6; i++) {
                    P2.empilharSorteio((int) a.sortear());
                }
            }

        }
        if (sorte1 == 3 || sorte2 == 3 || sorte3 == 3 || sorte4 == 3) {
            for (int i = 0; i < 7; i++) {
                P3.empilharSorteio((int) a.sortear());
            }

        } else {

            if (P3.vazia()) {
                for (int i = 0; i < 6; i++) {
                    P3.empilharSorteio((int) a.sortear());
                }
            }

        }
        if (sorte1 == 4 || sorte2 == 4 || sorte3 == 4 || sorte4 == 4) {
            for (int i = 0; i < 7; i++) {
                P4.empilharSorteio((int) a.sortear());
            }

        } else {

            if (P4.vazia()) {
                for (int i = 0; i < 6; i++) {
                    P4.empilharSorteio((int) a.sortear());
                }
            }

        }
        if (sorte1 == 5 || sorte2 == 5 || sorte3 == 5 || sorte4 == 5) {
            for (int i = 0; i < 7; i++) {
                P5.empilharSorteio((int) a.sortear());
            }

        } else {

            if (P5.vazia()) {
                for (int i = 0; i < 6; i++) {
                    P5.empilharSorteio((int) a.sortear());
                }
            }

        }

        if (sorte1 == 6 || sorte2 == 6 || sorte3 == 6 || sorte4 == 6) {
            for (int i = 0; i < 7; i++) {
                P6.empilharSorteio((int) a.sortear());
            }

        } else {

            if (P6.vazia()) {
                for (int i = 0; i < 6; i++) {
                    P6.empilharSorteio((int) a.sortear());
                }
            }

        }
        if (sorte1 == 7 || sorte2 == 7 || sorte3 == 7 || sorte4 == 7) {
            for (int i = 0; i < 7; i++) {
                P7.empilharSorteio((int) a.sortear());
            }

        } else {

            if (P7.vazia()) {
                for (int i = 0; i < 6; i++) {
                    P7.empilharSorteio((int) a.sortear());
                }
            }

        }
        if (sorte1 == 8 || sorte2 == 8 || sorte3 == 8 || sorte4 == 8) {
            for (int i = 0; i < 7; i++) {
                P8.empilharSorteio((int) a.sortear());
            }

        } else {

            if (P8.vazia()) {
                for (int i = 0; i < 6; i++) {
                    P8.empilharSorteio((int) a.sortear());
                }
            }

        }

    }

    public void pilhaParaPilha(String de, String para) {//de=pilha que o elemento ira sair,para=para qual pilha (de) ira
        if (de.equals("P1") && para.equals("P2")) {

            boolean verificar = P2.empilharPilha(P1.top.item);
            if (verificar) {
                P1.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P1") && para.equals("P3")) {

            boolean verificar = P3.empilharPilha(P1.top.item);
            if (verificar) {
                P1.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P1") && para.equals("P4")) {
            boolean verificar = P4.empilharPilha(P1.top.item);
            if (verificar) {
                P1.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P1") && para.equals("P5")) {
            boolean verificar = P5.empilharPilha(P1.top.item);
            if (verificar) {
                P1.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P1") && para.equals("P6")) {
            boolean verificar = P6.empilharPilha(P1.top.item);
            if (verificar) {
                P1.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P1") && para.equals("P7")) {
            boolean verificar = P7.empilharPilha(P1.top.item);
            if (verificar) {
                P1.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P1") && para.equals("P8")) {
            boolean verificar = P8.empilharPilha(P1.top.item);
            if (verificar) {
                P1.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P2") && para.equals("P1")) {
            boolean verificar = P1.empilharPilha(P2.top.item);
            if (verificar) {
                P2.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P2") && para.equals("P3")) {
            boolean verificar = P3.empilharPilha(P2.top.item);
            if (verificar) {
                P2.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P2") && para.equals("P4")) {
            boolean verificar = P4.empilharPilha(P2.top.item);
            if (verificar) {
                P2.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P2") && para.equals("P5")) {
            boolean verificar = P5.empilharPilha(P2.top.item);
            if (verificar) {
                P2.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P2") && para.equals("P6")) {
            boolean verificar = P6.empilharPilha(P2.top.item);
            if (verificar) {
                P2.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P2") && para.equals("P7")) {
            boolean verificar = P7.empilharPilha(P2.top.item);
            if (verificar) {
                P2.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P2") && para.equals("P8")) {
            boolean verificar = P8.empilharPilha(P2.top.item);
            if (verificar) {
                P2.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P3") && para.equals("P1")) {
            boolean verificar = P1.empilharPilha(P3.top.item);
            if (verificar) {
                P3.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P3") && para.equals("P2")) {
            boolean verificar = P2.empilharPilha(P3.top.item);
            if (verificar) {
                P3.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P3") && para.equals("P4")) {
            boolean verificar = P4.empilharPilha(P3.top.item);
            if (verificar) {
                P3.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P3") && para.equals("P5")) {
            boolean verificar = P5.empilharPilha(P3.top.item);
            if (verificar) {
                P3.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P3") && para.equals("P6")) {
            boolean verificar = P6.empilharPilha(P3.top.item);
            if (verificar) {
                P3.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P3") && para.equals("P7")) {
            boolean verificar = P7.empilharPilha(P3.top.item);
            if (verificar) {
                P3.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P3") && para.equals("P8")) {
            boolean verificar = P8.empilharPilha(P3.top.item);
            if (verificar) {
                P3.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P4") && para.equals("P1")) {
            boolean verificar = P1.empilharPilha(P4.top.item);
            if (verificar) {
                P4.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P4") && para.equals("P2")) {
            boolean verificar = P2.empilharPilha(P4.top.item);
            if (verificar) {
                P4.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P4") && para.equals("P3")) {
            boolean verificar = P3.empilharPilha(P4.top.item);
            if (verificar) {
                P4.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P4") && para.equals("P5")) {
            boolean verificar = P5.empilharPilha(P4.top.item);
            if (verificar) {
                P4.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P4") && para.equals("P6")) {
            boolean verificar = P6.empilharPilha(P4.top.item);
            if (verificar) {
                P4.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P4") && para.equals("P7")) {
            boolean verificar = P7.empilharPilha(P4.top.item);
            if (verificar) {
                P4.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P4") && para.equals("P8")) {
            boolean verificar = P8.empilharPilha(P4.top.item);
            if (verificar) {
                P4.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P5") && para.equals("P1")) {
            boolean verificar = P1.empilharPilha(P5.top.item);
            if (verificar) {
                P5.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P5") && para.equals("P2")) {
            boolean verificar = P2.empilharPilha(P5.top.item);
            if (verificar) {
                P5.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P5") && para.equals("P3")) {
            boolean verificar = P3.empilharPilha(P5.top.item);
            if (verificar) {
                P5.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P5") && para.equals("P4")) {
            boolean verificar = P4.empilharPilha(P5.top.item);
            if (verificar) {
                P5.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P5") && para.equals("P6")) {
            boolean verificar = P6.empilharPilha(P5.top.item);
            if (verificar) {
                P5.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P5") && para.equals("P7")) {
            boolean verificar = P7.empilharPilha(P5.top.item);
            if (verificar) {
                P5.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P5") && para.equals("P8")) {
            boolean verificar = P8.empilharPilha(P5.top.item);
            if (verificar) {
                P5.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P6") && para.equals("P1")) {
            boolean verificar = P1.empilharPilha(P6.top.item);
            if (verificar) {
                P6.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P6") && para.equals("P2")) {
            boolean verificar = P2.empilharPilha(P6.top.item);
            if (verificar) {
                P6.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P6") && para.equals("P3")) {
            boolean verificar = P3.empilharPilha(P6.top.item);
            if (verificar) {
                P6.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P6") && para.equals("P4")) {
            boolean verificar = P4.empilharPilha(P6.top.item);
            if (verificar) {
                P6.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P6") && para.equals("P5")) {
            boolean verificar = P5.empilharPilha(P6.top.item);
            if (verificar) {
                P6.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P6") && para.equals("P7")) {
            boolean verificar = P7.empilharPilha(P6.top.item);
            if (verificar) {
                P6.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P6") && para.equals("P8")) {
            boolean verificar = P8.empilharPilha(P6.top.item);
            if (verificar) {
                P6.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P7") && para.equals("P1")) {
            boolean verificar = P1.empilharPilha(P7.top.item);
            if (verificar) {
                P7.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P7") && para.equals("P2")) {
            boolean verificar = P2.empilharPilha(P7.top.item);
            if (verificar) {
                P7.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P7") && para.equals("P3")) {
            boolean verificar = P3.empilharPilha(P7.top.item);
            if (verificar) {
                P7.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P7") && para.equals("P4")) {
            boolean verificar = P4.empilharPilha(P7.top.item);
            if (verificar) {
                P7.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P7") && para.equals("P5")) {
            boolean verificar = P5.empilharPilha(P7.top.item);
            if (verificar) {
                P7.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P7") && para.equals("P6")) {
            boolean verificar = P6.empilharPilha(P7.top.item);
            if (verificar) {
                P7.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P7") && para.equals("P8")) {
            boolean verificar = P8.empilharPilha(P7.top.item);
            if (verificar) {
                P7.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P8") && para.equals("P1")) {
            boolean verificar = P1.empilharPilha(P8.top.item);
            if (verificar) {
                P8.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P8") && para.equals("P2")) {
            boolean verificar = P2.empilharPilha(P8.top.item);
            if (verificar) {
                P8.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P8") && para.equals("P3")) {
            boolean verificar = P3.empilharPilha(P8.top.item);
            if (verificar) {
                P8.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P8") && para.equals("P4")) {
            boolean verificar = P1.empilharPilha(P8.top.item);
            if (verificar) {
                P8.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P8") && para.equals("P5")) {
            boolean verificar = P5.empilharPilha(P8.top.item);
            if (verificar) {
                P8.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P8") && para.equals("P6")) {
            boolean verificar = P6.empilharPilha(P8.top.item);
            if (verificar) {
                P8.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        } else if (de.equals("P8") && para.equals("P7")) {
            boolean verificar = P7.empilharPilha(P8.top.item);
            if (verificar) {
                P8.desempilhar();
            } else {
                System.out.println("impossivel inserir a carta solicitada");
            }
        }
    }

    public void mais1(EXTRA2 a, String b, String c) {//metodo "arrastar" da classe "Pilha" com as 8 determinadas pilhas
        if (b.equals("P1") && c.equals("P2")) {
            empilharmais1(a, P1, P2);
        } else if (b.equals("P1") && c.equals("P3")) {
            empilharmais1(a, P1, P3);
        } else if (b.equals("P1") && c.equals("P4")) {
            empilharmais1(a, P1, P4);
        } else if (b.equals("P1") && c.equals("P5")) {
            empilharmais1(a, P1, P5);
        } else if (b.equals("P1") && c.equals("P6")) {
            empilharmais1(a, P1, P6);
        } else if (b.equals("P1") && c.equals("P7")) {
            empilharmais1(a, P1, P7);
        } else if (b.equals("P1") && c.equals("P8")) {
            empilharmais1(a, P1, P8);
        } else if (b.equals("P2") && c.equals("P1")) {
            empilharmais1(a, P2, P1);
        } else if (b.equals("P2") && c.equals("P3")) {
            empilharmais1(a, P2, P3);
        } else if (b.equals("P2") && c.equals("P4")) {
            empilharmais1(a, P2, P4);
        } else if (b.equals("P2") && c.equals("P5")) {
            empilharmais1(a, P2, P5);
        } else if (b.equals("P2") && c.equals("P6")) {
            empilharmais1(a, P2, P6);
        } else if (b.equals("P2") && c.equals("P7")) {
            empilharmais1(a, P2, P7);
        } else if (b.equals("P2") && c.equals("P8")) {
            empilharmais1(a, P2, P8);
        } else if (b.equals("P3") && c.equals("P1")) {
            empilharmais1(a, P3, P1);
        } else if (b.equals("P3") && c.equals("P2")) {
            empilharmais1(a, P3, P2);
        } else if (b.equals("P3") && c.equals("P4")) {
            empilharmais1(a, P3, P4);
        } else if (b.equals("P3") && c.equals("P5")) {
            empilharmais1(a, P3, P5);
        } else if (b.equals("P3") && c.equals("P6")) {
            empilharmais1(a, P3, P6);
        } else if (b.equals("P3") && c.equals("P7")) {
            empilharmais1(a, P3, P7);
        } else if (b.equals("P3") && c.equals("P8")) {
            empilharmais1(a, P3, P8);
        } else if (b.equals("P4") && c.equals("P1")) {
            empilharmais1(a, P4, P1);
        } else if (b.equals("P4") && c.equals("P2")) {
            empilharmais1(a, P4, P2);
        } else if (b.equals("P4") && c.equals("P3")) {
            empilharmais1(a, P4, P3);
        } else if (b.equals("P4") && c.equals("P5")) {
            empilharmais1(a, P4, P5);
        } else if (b.equals("P4") && c.equals("P6")) {
            empilharmais1(a, P4, P6);
        } else if (b.equals("P4") && c.equals("P7")) {
            empilharmais1(a, P4, P7);
        } else if (b.equals("P4") && c.equals("P8")) {
            empilharmais1(a, P4, P8);
        } else if (b.equals("P5") && c.equals("P1")) {
            empilharmais1(a, P5, P1);
        } else if (b.equals("P5") && c.equals("P2")) {
            empilharmais1(a, P5, P2);
        } else if (b.equals("P5") && c.equals("P3")) {
            empilharmais1(a, P5, P3);
        } else if (b.equals("P5") && c.equals("P4")) {
            empilharmais1(a, P5, P4);
        } else if (b.equals("P5") && c.equals("P6")) {
            empilharmais1(a, P5, P6);
        } else if (b.equals("P5") && c.equals("P7")) {
            empilharmais1(a, P5, P7);
        } else if (b.equals("P5") && c.equals("P8")) {
            empilharmais1(a, P5, P8);
        } else if (b.equals("P6") && c.equals("P1")) {
            empilharmais1(a, P6, P1);
        } else if (b.equals("P6") && c.equals("P2")) {
            empilharmais1(a, P6, P2);
        } else if (b.equals("P6") && c.equals("P3")) {
            empilharmais1(a, P6, P3);
        } else if (b.equals("P6") && c.equals("P4")) {
            empilharmais1(a, P6, P4);
        } else if (b.equals("P6") && c.equals("P5")) {
            empilharmais1(a, P6, P5);
        } else if (b.equals("P6") && c.equals("P7")) {
            empilharmais1(a, P6, P7);
        } else if (b.equals("P6") && c.equals("P8")) {
            empilharmais1(a, P6, P8);
        } else if (b.equals("P7") && c.equals("P1")) {
            empilharmais1(a, P7, P1);
        } else if (b.equals("P7") && c.equals("P2")) {
            empilharmais1(a, P7, P2);
        } else if (b.equals("P7") && c.equals("P3")) {
            empilharmais1(a, P7, P3);
        } else if (b.equals("P7") && c.equals("P4")) {
            empilharmais1(a, P7, P4);
        } else if (b.equals("P7") && c.equals("P5")) {
            empilharmais1(a, P7, P5);
        } else if (b.equals("P7") && c.equals("P6")) {
            empilharmais1(a, P7, P6);
        } else if (b.equals("P7") && c.equals("P8")) {
            empilharmais1(a, P7, P8);
        } else if (b.equals("P8") && c.equals("P1")) {
            empilharmais1(a, P8, P1);
        } else if (b.equals("P8") && c.equals("P2")) {
            empilharmais1(a, P8, P2);
        } else if (b.equals("P8") && c.equals("P3")) {
            empilharmais1(a, P8, P3);
        } else if (b.equals("P8") && c.equals("P4")) {
            empilharmais1(a, P8, P4);
        } else if (b.equals("P8") && c.equals("P5")) {
            empilharmais1(a, P8, P5);
        } else if (b.equals("P8") && c.equals("P6")) {
            empilharmais1(a, P8, P6);
        } else if (b.equals("P8") && c.equals("P7")) {
            empilharmais1(a, P8, P7);
        } else {
            System.out.println("Nao e possivel encntrar esta pilha");
        }
    }

    private long impressao() {
        long vet[] = {P1.getNumelementos(), P2.getNumelementos(), P3.getNumelementos(), P4.getNumelementos(), P5.getNumelementos(), P6.getNumelementos(),
            P7.getNumelementos(), P8.getNumelementos()};
        long maior = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (maior < vet[i]) {
                maior = vet[i];
            }
        }
      
        return maior;

    }  

    public void imprimirPilha1() {
        StringBuilder sd = new StringBuilder();
        StringBuilder so = new StringBuilder();
        StringBuilder sid = new StringBuilder();
        StringBuilder pia2 = new StringBuilder();
        StringBuilder pia3 = new StringBuilder();
        StringBuilder pia4 = new StringBuilder();
        StringBuilder pia5 = new StringBuilder();
        StringBuilder pia6 = new StringBuilder();
        StringBuilder pia7 = new StringBuilder();
        StringBuilder pia8 = new StringBuilder();

        int conta1 = 0, conta2 = 0, conta3 = 0, conta4 = 0, conta5 = 0, conta6 = 0, conta7 = 0, conta8 = 0;
        Celula aux = P1.head;
        Celula aux2 = P2.head;
        Celula aux3 = P3.head;
        Celula aux4 = P4.head;
        Celula aux5 = P5.head;
        Celula aux6 = P6.head;
        Celula aux7 = P7.head;
        Celula aux8 = P8.head;
        String as = "", b = "", c = "", d = "", e = "", f = "", g = "", h = "";
        long maio = impressao();
        int cont = 0;
        System.out.println("\tPILHA1\tPILHA2\tPILHA3\tPILHA4\tPILHA5\tPILHA6\tPILHA7\tPILHA8");

        long P1a = P1.getNumelementos();
        long P2b = P2.getNumelementos();
        long P3c = P3.getNumelementos();
        long P4d = P4.getNumelementos();
        long P5e = P5.getNumelementos();
        long P6f = P6.getNumelementos();
        long P7g = P7.getNumelementos();
        long P8h = P8.getNumelementos();

        while (cont < maio - 1) {

            if (cont < P1a) {
                as = P1.imprimePilha(aux, P1);

            } else {
                as = "";
            }
            if (cont < P2b) {
                b = P2.imprimePilha(aux2, P2);

            } else {
                b = "";
            }
            if (cont < P3c) {
                c = P3.imprimePilha(aux3, P3);

            } else {
                c = "";
            }
            if (cont < P4d) {
                d = P2.imprimePilha(aux4, P4);

            } else {
                d = "";
            }
            if (cont < P5e) {
                e = P3.imprimePilha(aux5, P5);

            } else {
                e = "";
            }
            if (cont < P6f) {
                f = P2.imprimePilha(aux6, P6);

            } else {
                f = "";
            }
            if (cont < P7g) {
                g = P3.imprimePilha(aux7, P7);

            } else {
                g = "";
            }
            if (cont < P8h) {
                h = P2.imprimePilha(aux8, P8);

            } else {
                h = "";
            }

            System.out.println("\t" + as + "\t" + b + "\t" + c + "\t" + d + "\t" + e + "\t" + f + "\t" + g + "\t" + h);

            cont++;
            if (aux.prox != null) {
                aux = aux.prox;
                conta1++;
            }
            if (aux2.prox != null) {
                aux2 = aux2.prox;
                conta2++;
            }
            if (aux3.prox != null) {
                aux3 = aux3.prox;
                conta3++;
            }
            if (aux4.prox != null) {
                aux4 = aux4.prox;
                conta4++;
            }
            if (aux5.prox != null) {
                aux5 = aux5.prox;
                conta5++;
            }
            if (aux6.prox != null) {
                aux6 = aux6.prox;
                conta6++;
            }
            if (aux7.prox != null) {
                aux7 = aux7.prox;
                conta7++;
            }
            if (aux8.prox != null) {
                aux8 = aux8.prox;
                conta8++;
            }
        }

        if (conta1 == maio - 1) {
            sid.append(P1.top.item.numero);
            sid.append(P1.top.item.cor);
            sid.append(P1.top.item.simbolo);

        } else {

        }
        if (conta2 == maio - 1) {
            pia2.append(P2.top.item.numero);
            pia2.append(P2.top.item.cor);
            pia2.append(P2.top.item.simbolo);

        } else {

        }
        if (conta3 == maio - 1) {
            pia3.append(P3.top.item.numero);
            pia3.append(P3.top.item.cor);
            pia3.append(P3.top.item.simbolo);

        } else {

        }
        if (conta4 == maio - 1) {
            pia4.append(P4.top.item.numero);
            pia4.append(P4.top.item.cor);
            pia4.append(P4.top.item.simbolo);

        } else {

        }
        if (conta5 == maio - 1) {
            pia5.append(P5.top.item.numero);
            pia5.append(P5.top.item.cor);
            pia5.append(P5.top.item.simbolo);

        } else {

        }
        if (conta6 == maio - 1) {
            pia6.append(P6.top.item.numero);
            pia6.append(P6.top.item.cor);
            pia6.append(P6.top.item.simbolo);

        } else {

        }
        if (conta7 == maio - 1) {
            pia7.append(P7.top.item.numero);
            pia7.append(P7.top.item.cor);
            pia7.append(P7.top.item.simbolo);

        } else {

        }
        if (conta8 == maio - 1) {
            pia8.append(P8.top.item.numero);
            pia8.append(P8.top.item.cor);
            pia8.append(P8.top.item.simbolo);

        } else {

        }

        System.out.println("\t" + sid.toString() + "\t" + pia2.toString() + "\t" + pia3.toString() + "\t" + pia4.toString() + "\t" + pia5.toString() + "\t" + pia6.toString() + "\t" + pia7.toString() + "\t" + pia8.toString() + "\t");

    }

}
