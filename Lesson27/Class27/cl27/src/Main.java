import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>();
        list.add("ggg");
        list.add("qwert");

        GenericList<Person> list2 = new GenericList<>();
        list2.add(new Person("Nick",20));
        list2.add(new Person("Jack",21));
        list2.add(new Person("Lena",22));


        System.out.println(list);
        System.out.println(list2);

        GenericList<Author> authors = new GenericList<>();
        authors.add(new Author("Виктор", "Пелевин", 1963));
        authors.add(new Author("Александр", "Пушкин", 1880));
        Author author = authors.get(1);


        System.out.println("--------------------------------");
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Jack",10));
        persons.add(new Person("John",15));
        persons.add(new Person("Georg",30));
        persons.add(new Person("Jack",10));

        System.out.println(persons);

        for (int i=0; i< persons.size(); i++){
            System.out.println(persons.get(i));
        }

    }
}