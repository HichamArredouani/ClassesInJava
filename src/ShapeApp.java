public class ShapeApp {
    public static void main (String [] args) {
        Rectangle first = new Rectangle();
        first.setHeight(300);
        first.setWitdh(50);
        first.setxPos(50);
        first.setyPos(100);

        Rectangle second = new Rectangle();
        second.setHeight(150);
        second.setWitdh(80);
        second.setxPos(120);
        second.setyPos(200);

        Rectangle third = new Rectangle();
        third.setHeight(250);
        third.setWitdh(60);
        third.setxPos(30);
        third.setyPos(75);
        System.out.println("First rectangle: height = " + first.getHeight() +
                ", width = " + first.getWitdh() +
                ", position = (" + first.getxPos() + ", " + first.getyPos() + ")");

        System.out.println("Second rectangle: height = " + second.getHeight() +
                ", width = " + second.getWitdh() +
                ", position = (" + second.getxPos() + ", " + second.getyPos() + ")");

        System.out.println("Third rectangle: height = " + third.getHeight() +
                ", width = " + third.getWitdh() +
                ", position = (" + third.getxPos() + ", " + third.getyPos() + ")");
    }
}
