public class Snake {
    int x, y;

    public Snake(int x, int y){
       this.x = y;
        this.y = x;
    }

    public void moveLeft(){
        x--;
        
    }
    public  void moveRight() {
        x++;
        
    }
    public void moveUp(){
        y++;
    }
    public void moveDown(){
        y--;
    }
    public void println(){
        System.out.println("posisi Ular: (" + x + ", " + y + ")");
    }
}
