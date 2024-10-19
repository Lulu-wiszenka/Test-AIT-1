import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();  // создали ArrayList

        people.add(new Person("Jack0",10));  // добавили в него элементы
        people.add(new Person("Jack1",14));
        people.add(new Person("Jack2",18));

        for (int i = 0; i < people.size() ; i++) {  // перебираем элементы
            System.out.println(people.get(i));
        }
        System.out.println("remove");
        System.out.println(people);
        people.remove(1);                 // удаляем элемент с индексом 1
        System.out.println(people);            // Обратите внимание, при удалении элементы "хвоста" сдвигаются

        List<String> colors = new ArrayList<>();
        colors.add("черный");
        colors.add("белый");
        colors.add("красный");
        System.out.println(colors);
        System.out.println(colors.indexOf("белый"));   // indexOf - возвращает индекс заданного элемента, или -1 если элемента нет


        people.add(new Person("Nick",30));
        System.out.println(people);
        System.out.println(people.indexOf(new Person("Jack2", 18)));


    }
}