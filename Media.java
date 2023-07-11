import java.util.Scanner;

public class Media {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        double nota,nota1,nota2,nota3,soma,media;
        System.out.println("Insira uma nota");
        nota = Double.valueOf(s.nextLine());
        System.out.println("Insira uma nota");
        nota1 =Double.valueOf(s.nextLine()) ;
        System.out.println("Insira uma nota");
        nota2 =Double.valueOf(s.nextLine()) ;
        System.out.println("Insira uma nota");
        nota3 =Double.valueOf(s.nextLine()) ;
        soma = nota1 + nota + nota3 + nota2;
        media = soma / 4;
        for (int cont = 1; cont <= 4; cont++) {
            if (cont == 4) {
                if (media >= 7 && media <= 10) {
                    System.out.println("Aprovado, media " + media);
                } else if (media >= 5) {
                    System.out.println("Recuperação,media :" + media);
                } else {
                    System.out.println("Reprovado, media :" + media);
                }

            }
            
        }
    }
}

