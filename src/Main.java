public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");
        Book kapitanskaya = new Book("Капитанская дочка", pushkin, 1836);
        Book voina = new Book("Война и мир", tolstoy, 1867);
        System.out.println(kapitanskaya);
        System.out.println(voina);
        kapitanskaya.setPublished(1937);
        System.out.println("kapitanskaya.getPublished() = " + kapitanskaya.getPublished());


    }

}