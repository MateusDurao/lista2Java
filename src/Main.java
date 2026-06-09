
public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Caneta", 2.50);
        Produto p2 = new Produto("Caderno", 15.00);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("Item: " + p1);
        System.out.println("Item: " + p2);

        /*
        Produto{nome='Caneta', preco=2.5}
        Produto{nome='Caderno', preco=15.0}

        O toString() é chamado automaticamente no println e na concatenação com +.
         */
    }
}