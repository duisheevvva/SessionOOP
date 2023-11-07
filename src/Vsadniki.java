public class Vsadniki extends Spartance{
    private String gender;
    private String age;

    public Vsadniki(String name, int count, String gender, String age) {
        super(name, count);
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
