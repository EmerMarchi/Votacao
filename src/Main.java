import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votosTaffe = 0;
        int votosRodrigo = 0;
        int votosLucas = 0;
        int votosAlessandro = 0;

        System.out.println("Informe a quantidade de eleitores: ");
        int quantEleitor = sc.nextInt();

        int[] votosRealizados = new int[quantEleitor];

        for (int i = 0; i < quantEleitor; i++) {
            int voto = 0;
            do {
                System.out.println("Eleitor " + i) ;
                System.out.println(" 99 - Taffe \n 88 - Rodrigo \n 77 - Lucas \n 66 - Alessandro");
                System.out.println("Qual o seu voto?");
                voto = sc.nextInt();
            }while (voto != 99 && voto != 88 && voto != 77 && voto != 66);

            votosRealizados[i] = voto;

            if (voto == 99) {
                votosTaffe++;
            }else if (voto == 88) {
                votosRodrigo++;
            }else if (voto == 77) {
                votosLucas++;
            }else if (voto == 66) {
                votosAlessandro++;
            }
        }

        System.out.println("Exibindo os votos:");
        System.out.println(" Taffe " + votosTaffe + " votos \n Rodrigo " +votosRodrigo + " votos \n Lucas " + votosLucas + " votos \n Alessandro " + votosAlessandro + " votos");
        if (votosTaffe > votosRodrigo && votosTaffe > votosLucas && votosTaffe > votosAlessandro) {
            System.out.println("Taffe Eleito com " +votosTaffe + " votos");
        }else if (votosRodrigo > votosTaffe && votosRodrigo > votosLucas && votosRodrigo > votosAlessandro) {
            System.out.println("Rodrigo Eleito com " + votosRodrigo + " votos");
        } else if (votosLucas > votosTaffe && votosLucas > votosRodrigo && votosLucas > votosAlessandro) {
            System.out.println("Lucas Eleito com " + votosLucas + " votos");
        } else if (votosAlessandro > votosTaffe && votosAlessandro > votosRodrigo && votosAlessandro > votosLucas) {
            System.out.println("Alessandro Eleito com " + votosAlessandro + " votos");
        }
    }
}
