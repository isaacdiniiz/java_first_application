public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o ScreenMatch!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Media calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com gala dos anos 80
                Muito bom!
                Ano de Lancamento
                """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}