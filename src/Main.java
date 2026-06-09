
public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");
        System.out.println(l1 == l2); // ?
        System.out.println(l1.equals(l2)); // ?

    }
}

/*

O comportamento padrão do metodo equals na classe
Object é usar o operador ==.

Sem sobrescrever override o metodo, ele continua
comparando apenas os endereços de memória, ignorando
o conteúdo dos atributos.

 */