package AimsProject;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Bladin", "Animation", null, 0, 18.99f);
        DigitalVideoDisc[] dvdList={dvd1,dvd2,dvd3};
        anOrder.addDigitalVideoDisc(dvdList);
        anOrder.addDigitalVideoDisc(dvd1,dvd3);
        anOrder.displayCart();
    }
}
