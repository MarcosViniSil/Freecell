package teste1;

import java.util.Scanner;

public class Verificar extends ListaJuncao {

    public void teste() {
        Scanner sc = new Scanner(System.in);
        EXTRA2 extra = new EXTRA2();
        Pilha2 pilha = new Pilha2();
        PilhaOrdenada2 ordena = new PilhaOrdenada2();

        //lista de pilhas
        this.inserirPliha(pilha);
        this.inserirOrdena(ordena);
        this.inserirExtra(extra);

        Pilha2 g = this.Pilha();
        EXTRA gh = this.Extra();
        PilhaOrdenada2 f = this.Ordena();

        System.out.println("\t\t\t---------FREECELL-------");
        g.Sorteio();
        gh.imprimir();
        System.out.println("");
        f.imprimeOr();
        System.out.println("");
        g.imprimirPilha1();
        System.out.println("");

        int opcao;
        do {

            System.out.println("\t\t\t0:Sair");
            System.out.println("\t\t\t1:Pilha para pilha");
            System.out.println("\t\t\t2:Pilha para espaco extra");
            System.out.println("\t\t\t3:Pilha para ordenada");
            System.out.println("\t\t\t4:Extra para ordenada ");
            System.out.println("\t\t\t5:Extra para pilha");
            
            opcao = sc.nextInt();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    String op3,
                     op4;
                    System.out.print("Deseja mover mais de 1 carta? s/n");
                    op3 = sc.next();
                    if (op3.equals("n") || op3.equals("N")) {
                        String op1,
                                op2;
                        System.out.print("digite de qual pilha deseja retirar: ex:P1");
                        op1 = sc.next();
                        System.out.print("digite para qual pilha deseja inserir:ex:P1");
                        op2 = sc.next();
                        g.pilhaParaPilha(op1, op2);
                    } else if (op3.equals("s") || op3.equals("S")) {
                        String op1,
                                op2;
                        System.out.print("digite de qual pilha deseja retirar: ex:P1");
                        op1 = sc.next();
                        System.out.print("digite para qual pilha deseja inserir: ex:P1");
                        op2 = sc.next();
                        g.mais1(extra, op1, op2);
                    }
                    gh.imprimir();
                    System.out.println("");
                    f.imprimeOr();
                    System.out.println("");
                    g.imprimirPilha1();
                    System.out.println("");

                    break;
                case 2:
                    String P1;
                    System.out.print("digite de qual pilha deseja inserir no espaco extra: ex:P1 ");
                    P1 = sc.next();
                    extra.inserui(P1, g);

                    gh.imprimir();
                    System.out.println("");
                    f.imprimeOr();
                    System.out.println("");
                    g.imprimirPilha1();
                    System.out.println("");

                    break;
                case 3:
                    String p1,
                     p2;
                    System.out.println("digite de qual pilha deseja inserir no espaco ordeado: ex:P1");
                    p1 = sc.next();
                    System.out.println("digite qual pilha ordenada deseja inserir: ex:P1");
                    p2 = sc.next();
                    f.insere(p1, p2, g);
                    gh.imprimir();
                    System.out.println("");
                    f.imprimeOr();
                    System.out.println("");
                    g.imprimirPilha1();
                    System.out.println("");

                    break;
                case 4:
                    gh.imprimir();
                    int posi;
                    String ord;
                    System.out.print("digite a posicao do espaco extra para inserir na ordenada: ");
                    posi = sc.nextInt();
                    System.out.print("digite para qual pilha ordenada: ex:P1 ");
                    ord = sc.next();
                    f.ExtraparaOrde(posi, gh, ord);
                    gh.imprimir();
                    System.out.println("");
                    f.imprimeOr();
                    System.out.println("");
                    g.imprimirPilha1();
                    System.out.println("");
                    break;

                case 5:
                    int indice;
                    gh.imprimir();
                    String pl1;
                    System.out.print("digite qual posicao do espaco extra: ");
                    indice = sc.nextInt();
                    System.out.print("digite para qual pilha deseja inserir: ex:P1 ");
                    pl1 = sc.next();
                    extra.remover(indice, pl1, g);

                    System.out.println("");
                    f.imprimeOr();
                    System.out.println("");
                    g.imprimirPilha1();
                    System.out.println("");
                    break;


            }

        } while (opcao != 0 && !ordena.ganha());

    }
}
