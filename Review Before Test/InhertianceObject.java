public class InhertianceObject extends FirstObject {

    public InhertianceObject(int x, int y) {
        super(x, y);
    }

    public void changeX(int newX) {
        x = newX;
    }

    public void changeY(int newY) {
        System.out.println(y);
    }

}