public class ValidadorSenha {
    public static void main(String[] args) {

        String senhaCorreta = new String("1234");
        String tentativa = "1234";

        if (tentativa == senhaCorreta) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado"); // este roda!
        }

        // Correção
        if (tentativa.equals(senhaCorreta)) {
            System.out.println("Acesso liberado (correto)");
        }

        /*
        O acesso é negado porque == compara referência de memória.

        Risco real:
        Pode causar falhas graves de autenticação (login),
        liberando ou bloqueando acesso indevidamente.
        */
    }
}
