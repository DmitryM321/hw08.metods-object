public class Main {
    public static void main(String[] args) {
        Author author = new Author("Алексей", "Толстой");
        Author author1 = new Author("Джозеф", "Хеллер");
        Book book = new Book("Буратино", author, 1927);
        Book book2 = new Book("Уловка22", author, 1961);

        System.out.println(author.toString());
        System.out.println(author1.toString());


        System.out.println(book.toString());
        book.setPublishingYear(2222);
        System.out.println(book.toString());
        System.out.println(book2.toString());

            }

}