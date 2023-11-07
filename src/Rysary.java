public class Rysary extends Spartance{
    private String zvanie;
    private int age;

    public Rysary(String name, int count, String zvanie, int age) {
        super(name, count);
        this.zvanie = zvanie;
        this.age = age;
    }

    public String getZvanie() {
        return zvanie;
    }

    public void setZvanie(String zvanie) {
        this.zvanie = zvanie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
