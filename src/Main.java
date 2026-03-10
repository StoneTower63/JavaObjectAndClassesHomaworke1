public class Main {

    public static void main(String[] args) {

        Author pushkin = new Author("Alexhander", "Pushkin");
        Book prorok = new Book("Prorok", pushkin, 1829);
        prorok.setYear(1828);
        System.out.println("Год публикации: " + prorok.getYear());

        Author dostoevsky = new Author("Fyodor", "Dostoevsky");
        Book prestuplenieINakazanie = new Book("Prestyplenie i nakazanie", dostoevsky, 1999);
        prestuplenieINakazanie.setYear(1866);
        System.out.println("Год публикации: " + prestuplenieINakazanie.getYear());

    }
}
