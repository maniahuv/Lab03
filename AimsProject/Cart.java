package AimsProject;

public class Cart {
    public static int maxDvD=1;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[maxDvD];
    private static int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < maxDvD) {
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        // Tìm kiếm disc được remove
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    // Đẩy dics ra ngoài, sắp xếp các disc còn lại theo lượt
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; // Cập nhật lại danh sách
                qtyOrdered--; 
                System.out.println("The disc has been removed.");
                return;
            }
        }
    }
    
    public double calculateTotalCost() {
        double total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost(); 
        }
        return total;
    }
    public void displayCart() {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
        } else {
            for (int i = 0; i < qtyOrdered; i++) {
                DigitalVideoDisc disc = itemsOrdered[i];
                System.out.printf("%d. Title: %s, Category: %s, Director: %s, Length: %d min, Cost: $%.2f%n", i + 1, disc.getTitle(), disc.getCategory(), disc.getDirector() != null ? disc.getDirector() : "N/A", disc.getLength(), disc.getCost());
            }
        }
    }
}
