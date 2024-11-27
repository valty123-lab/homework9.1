public class Main {
    public static void main(String[] args) {
        Author author1= new Author("Алексей", "Толстой");
        Book book1=new Book("Аэлита",author1,1925);
        Author author2 = new Author("Джоан", "Роулинг");
        System.out.println(author1.equals(author2));
        System.out.println( book1);
        System.out.println(author1);
    }
}