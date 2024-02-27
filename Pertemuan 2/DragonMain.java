public class DragonMain {
    public static void main(String[] args) {
        // Instantiating two Dragon objects
        Dragon dragon1 = new Dragon(0, 0, 1);
        Dragon dragon2 = new Dragon(3, 5, 2);

        // Move dragons
        dragon1.move(2);
        dragon2.move(3);

        // Print status
        dragon1.printStatus();
        dragon2.printStatus();
    }
}

    
