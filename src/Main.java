public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBookDetails("tung tung sahur", "brainrot", 6969);
        System.out.println("Book No. 1");
        book1.displayInfo();
        book1.borrowBook();
        book1.returnBook();
        book1.borrowBook();
        book1.borrowBook();

        Book book2 = new Book();
        System.out.println(" ");
        book2.setBookDetails("mamama miyar", "JOJOJO", 1515);
        System.out.println("Book No. 2");
        book2.displayInfo();
        book2.borrowBook();
        book2.returnBook();
        book2.borrowBook();
        book2.borrowBook();

        Book book3 = new Book();
        System.out.println(" ");
        book3.setBookDetails("ttralelo tralala", "Doniel Eubnson Ko", 1212);
        System.out.println("Book No. 3");
        System.out.println(" ");
        book3.displayInfo();
        System.out.println(" ");
        book3.borrowBook();
        System.out.println(" ");
        book3.returnBook();
        System.out.println(" ");
        book3.borrowBook();
        System.out.println(" ");
        book3.borrowBook();
        System.out.println(" ");

    }
}
