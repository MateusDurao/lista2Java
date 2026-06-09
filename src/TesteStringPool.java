public class TesteStringPool {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        System.out.println(a == b); // ?
        System.out.println(a == c); // ?
        System.out.println(a.equals(c)); // ?
    }
}

/*
a == b → true
Porque ambas apontam para o mesmo objeto no String Pool.

a == c → false
Porque new String() cria um novo objeto na memória (heap).

equals → true
Porque compara o conteúdo da String.

String Pool:
É uma área especial da memória onde o Java armazena Strings literais.
Isso evita duplicação e economiza memória.

Regra:
Nunca usar == para comparar Strings.
Sempre usar .equals().
*/