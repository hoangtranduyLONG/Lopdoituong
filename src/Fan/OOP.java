package Fan;

public class OOP {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setSpeed(f1.FAST);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);

        Fan f2 = new Fan();
        f2.setSpeed(f1.MEDIUM);
        f2.setRadius(5);
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}