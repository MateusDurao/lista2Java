import java.util.HashSet;

public class BibliotecaTeste {
    public static void main(String[] args) {
        HashSet biblioteca = new HashSet<>();
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");
        biblioteca.add(l1);
        biblioteca.add(l2);
        System.out.println(biblioteca.size()); // 1 ou 2?

    }
}
/*
        Rodada A (com equals + hashCode):
        Resultado: 1

        Rodada B (sem hashCode):
        Pode resultar em 2

        Por quê?
        O HashSet usa:
        1. hashCode() → para localizar o bucket
        2. equals() → para verificar igualdade

        Se hashCode não for consistente com equals,
        o Set pode aceitar duplicados.

        Regra:
        Sobrescreveu equals? Sobrescreva hashCode também.
*/