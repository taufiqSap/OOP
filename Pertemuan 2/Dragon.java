public class Dragon {

    private int x;
    private int y;
    private int direction;

    public Dragon(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Direction Gagal!");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1: 
                y += steps;
                break;
            case 2: 
                x += steps;
                break;
            case 3: 
                y -= steps;
                break;
            case 4: 
                x -= steps;
                break;
        }
    }

    public void printStatus() {
        System.out.println("Dragon pososi: (" + x + ", " + y + "), Direction: " + direction);
    }
}


