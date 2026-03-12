public class Main {

    public static void main(String[] args) {

        Author pushkin = new Author("Alexhander", "Pushkin");
        Book prorok = new Book("Prorok", pushkin, 1829);
        prorok.setYear(1828);
        System.out.println("Год публикации: " + prorok.getYear());

        //ДЗ добавим копии для сверки
        Author pushkin2 = new Author("Alexhander", "Pushkin");
        Book prorok2 = new Book("Prorok", pushkin2, 1828);

        //Сравним
        System.out.println("Книги одинаковые? " + prorok.equals(prorok2));

        //Проверим хешКоды
        System.out.println("Хеш первой книги " + prorok.hashCode());
        System.out.println("Хеш второй книги " + prorok2.hashCode());

        //Проверим вывод
        System.out.println("Инфа о первой книге: " + prorok.toString());
        System.out.println("Инфа о второй книге: " + prorok2.toString());
        //Конечная

        Author dostoevsky = new Author("Fyodor", "Dostoevsky");
        Book prestuplenieINakazanie = new Book("Prestyplenie i nakazanie", dostoevsky, 1999);
        prestuplenieINakazanie.setYear(1866);
        System.out.println("Год публикации: " + prestuplenieINakazanie.getYear());

    }
}
