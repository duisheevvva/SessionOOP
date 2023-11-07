public class Filosofy extends Spartance{
    private String tema;
    private String author;

    public Filosofy(String name, int count, String tema, String author) {
        super(name, count);
        this.tema = tema;
        this.author = author;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void getFilosofByAuthor(Filosofy[] filosofies,String authorName){
        int count = 0;
        for (Filosofy filosofy1:filosofies) {
            if (filosofy1.author.equalsIgnoreCase(authorName)){
                System.out.println("Author : " + getAuthor()+ "Tema :" +getTema());
            }else {
                count++;

            }
        }if (count== filosofies.length){
            System.out.println("myndai author jok");
        }

    }

    @Override
    public String toString() {
        return "Filosofy{" +
                "name: " +getName()+
                "count : " +getCount()+
                "tema='" + tema + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
