import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o valor de comprimento da onda: ");
            int comprimentoDaOnda = input.nextInt();

            String cor = verificarCor(comprimentoDaOnda);
            if (cor != null) {
                System.out.println("A cor é " + cor);
            } else {
                System.out.println("Entrada de valor incorreta. Tente novamente");
            }
        } catch (Exception e) {
            System.out.println("O comprimento de onda não está dentro do espectro visível.");
        }
    }

    public static String verificarCor(int comprimentoDaOnda) {
        if (comprimentoDaOnda >= 380 && comprimentoDaOnda <= 450) {
            return "Violeta";
        } else if (comprimentoDaOnda > 450 && comprimentoDaOnda <= 495) {
            return "Azul";
        } else if (comprimentoDaOnda > 495 && comprimentoDaOnda <= 570) {
            return "Verde";
        } else if (comprimentoDaOnda > 570 && comprimentoDaOnda <= 590) {
            return "Amarela";
        } else if (comprimentoDaOnda > 590 && comprimentoDaOnda <= 620) {
            return "Laranja";
        } else if (comprimentoDaOnda > 620 && comprimentoDaOnda <= 750) {
            return "Vermelha";
        } else {
            return null;
        }
    }
}
