
public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Caneta", 2.50);
        Produto p2 = new Produto("Caderno", 15.00);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("Item: " + p1);
        System.out.println("Item: " + p2);

        /*
        roduto@6d06d69c
        Produto@7852e922

        Não é legível (mostra referência de memória).
         */
    }
}