
public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Clean Code 2", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");
        System.out.println(l1 == l2); // ?
        System.out.println(l1.equals(l2)); // ?

    }
}

/*
 os livros são iguais

não lança a execução

Porque é único para cada livro.
Título pode repetir ou variar.
 */