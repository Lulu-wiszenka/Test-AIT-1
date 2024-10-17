public class Autor {
    String fName;
    String lName;
    int age;

  public Autor(String fName, String lName, int age) {
      this.fName = fName;
      this.lName = lName;
      this.age = age;
  }


    public String toString() {
       return String.format("%s %s (%d)", fName, lName, age);
    }
}
