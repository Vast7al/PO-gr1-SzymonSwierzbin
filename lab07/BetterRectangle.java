import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int w, int h) {
        this.setLocation(x, y);
        this.setSize(w, h);
    }

    public int GetPerimeter() {
        return 2 * (this.height + this.width);
    }

    public int GetArea() {
        return this.height * this.width;

    }

    public static void main(String args[]) {
        BetterRectangle s1 = new BetterRectangle(4, 2, 6, 8);
        System.out.println(s1.GetPerimeter());
        System.out.println(s1.GetArea());

    }

}
