
public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Clean Code 2", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132341884");
        System.out.println(l1 == l2); // ?
        System.out.println(l1.equals(l2)); // ?


        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
    }
}

/*
sim, são iguais

o hash é diferente
 */