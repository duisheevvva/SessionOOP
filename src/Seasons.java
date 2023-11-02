public class Seasons {
    int month;

    public Seasons(int month) {
        this.month = month;
    }
    public Seasons (){
    }

    public void getSeasons(){
        switch (month){
            case 1,2,3 :
                System.out.println("This month is Winter");
                break;
            case 4,5,6 :
                System.out.println("This month is Spring");
                break;
            case 7,8,9 :
                System.out.println("This month is Sammer");
                break;
            case 10,11,12 :
                System.out.println("This month is Autumn");
                break;
            default:
                System.out.println("Not month!");
        }
    }

}
