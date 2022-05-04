public class FirstObject {

    protected int x;
    protected int y;

    public FirstObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void changeY(int newY) {
        y = newY;
    }

}