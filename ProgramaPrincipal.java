import javax.swing.JOptionPane;

public class ProgramaPrincipal {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String[] informacoes = {"nome", "idade", "altura em metros", "peso em kg", "floresta",
                "livro", "primeiro desejo", "segundo desejo", "lugar", "animal"};
        String[] messages = new String[informacoes.length];

        for (int i = 0; i < informacoes.length; i++) {
            System.out.print("Digite o seu " + informacoes[i] + ": ");
            messages[i] = scanner.nextLine();
        }

        int anoNascimento = calcularAnoNascimento(Integer.parseInt(messages[1]));
        double pesoNaLua = calcularPesoNaLua(Double.parseDouble(messages[3]));

        String story = String.format("Olá, %s!\n\n" +
                        "Em um belo dia, quando você tinha %s anos,\n" +
                        "você decidiu explorar uma misteriosa floresta chamada %s.\n" +
                        "A altura imponente das árvores, que tinham em média %s metros de altura,\n" +
                        "deixou você maravilhado(a).\n\n" +
                        "Curiosamente, ao chegar ao coração da floresta %s,\n" +
                        "você encontrou um antigo livro de magia chamado %s.\n" +
                        "Intrigado(a), você começou a ler e descobriu que o livro\n" +
                        "tinha o poder de realizar desejos!\n\n" +
                        "Para realizar os seus desejos, você tinha que inserir o seu ano de nascimento\n" +
                        "e o seu peso na lua. \n" +
                        "Após fazer alguns cálculos você descobriu que nasceu no ano %d \n" +
                        "e o seu peso na lua é de %.2f kg. \n" +
                        "Ansioso, você parte para a realização dos desejos. \n" +
                        "O primeiro desejo que você pensou foi %s,\n" +
                        "e o segundo desejo foi %s.\n\n" +
                        "Mas o livro ainda não tinha revelado todos os seus segredos.\n" +
                        "Enquanto você continuava explorando as páginas,\n" +
                        "encontrou um feitiço para viajar para o lugar %s,\n" +
                        "onde você encontrou um incrível %s.\n\n" +
                        "Após essa emocionante aventura, você guardou o livro de magia\n" +
                        "e decidiu voltar para casa, sabendo que tinha vivido uma grande história.\n\n" +
                        "Fim da história!",
                messages[0], messages[1], messages[4], messages[2], messages[4], messages[5],
                anoNascimento, pesoNaLua, messages[6], messages[7], messages[8], messages[9]);

        System.out.println(story);
    }
}


