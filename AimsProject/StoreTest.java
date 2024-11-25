public class StoreTest {
    public static void main(String[] args) {
        Store anAvai = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king", "Animation", "Roger Allers", 87, 19.95f);
        anAvai.addDvd(dvd1);
        anAvai.removeDvd(dvd1);
    }
}
