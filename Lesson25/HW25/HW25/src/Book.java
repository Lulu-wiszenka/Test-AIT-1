import java.util.Arrays;

public class Book {
private String title;
private Autor[] autors;
private int year;

public Book(String title, Autor[] autors, int year) {
    this.title = title;
    this.year = year;
    this.autors = new Autor[5];
}

    @Override
    public String toString() {
      StringBuilder autorsString = new StringBuilder();
        for (int i = 0; i < autors.length; i++) {
            if(autors[i]!=null){
                autorsString.append(autors[i]).append(";");
            }
        }
        return String.format("%s - %s (%d)",gettitle(), autorsString, getyear());
    }

    public String gettitle() {
        return title;
    }

    public int getyear() {
        return year;
    }
}
/*
Создайте класс Book

title - название,
authors - массив (!) авторов
year - год издания В классе сделайте конструктор, toString toString
должен корректно формировать строку в случае если задан 1 автор и в случаее,
если их несколько
Сделайте commit
 */