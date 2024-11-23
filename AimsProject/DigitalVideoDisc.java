package AimsProject;

public class DigitalVideoDisc{
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDiscs = 0;
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title=title;
        this.category=category;
        this.director=director;
        this.length=length;
        this.cost=cost;
        this.id=nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title) {
        this.title=title;
        this.id=nbDigitalVideoDiscs++;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public int getId() {
        return id;
    }
    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

}