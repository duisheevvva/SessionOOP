public class Luchniki extends Spartance{
    private String type;
    private String experiance;

    public Luchniki(String name, int count, String type, String experiance) {
        super(name, count);
        this.type = type;
        this.experiance = experiance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExperiance() {
        return experiance;
    }

    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }
}
