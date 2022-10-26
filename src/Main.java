public class Main {
    public static void main(String[] args) {
        String primeiroNome = "Rafael";
        String segundoNome = "martins";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome,String segundoNome){
        return "resultado Teste " + primeiroNome.concat(" ").concat(segundoNome);
    }
}