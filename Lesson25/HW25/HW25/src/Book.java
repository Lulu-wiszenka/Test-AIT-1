import java.util.Arrays;

public class Book {
private String title;
private Autor[] autors;
private int year;
private String myAutors;

public Book(String title, Autor[] autors, int year) {
    this.title = title;
    this.year = year;
    this.autors = new Autor[5];

}

   public String AutorsString(Autor[] autors){
       StringBuilder autorsString = new StringBuilder();
       for (int i = 0; i < autors.length; i++) {
           if(autors[i]!=null){
               autorsString.append(autors[i]).append(";");
           }
       }
       myAutors = autorsString.toString();
       return myAutors;
   }

    @Override
    public String toString() {
        return String.format("%s - %s (%d)",gettitle(), getmyAutors(), getyear());
    }

    public String gettitle() {
        return title;
    }

    public int getyear() {
        return year;
    }
    public String getmyAutors() {
        return myAutors;
    }
}
