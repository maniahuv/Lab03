package AimsProject;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 18.95f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 29.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 19.95f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 25.00f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 22.99f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Bladin", "Animation", null, 0, 18.99f);
        DigitalVideoDisc[] dvdList={dvd1,dvd2,dvd3,dvd4,dvd5,dvd6,dvd7,dvd8};
        anOrder.addDigitalVideoDisc(dvdList);
        anOrder.searchById(5);
        anOrder.searchByTitle("Alddin");
        
    }
}
