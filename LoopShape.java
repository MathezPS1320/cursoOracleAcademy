public class LoopShape {
    public static void main(String[] args) {
        int larguraRetangulo = 5;
        int alturaRetangulo = 4;

        System.out.println("Retângulo:");
        createRectangle(larguraRetangulo, alturaRetangulo);

        int tamanhoTriangulo = 5;

        System.out.println("\nTriângulo:");
        createTriangle(tamanhoTriangulo);
    }

    public static void createRectangle(int largura, int altura) {
        if (largura < 1 || altura < 1) {
            System.out.println("As dimensões devem ser maiores ou iguais a 1.");
            return;
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void createTriangle(int tamanho) {
        if (tamanho < 1) {
            System.out.println("A dimensão do triângulo deve ser maior ou igual a 1.");
            return;
        }

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
