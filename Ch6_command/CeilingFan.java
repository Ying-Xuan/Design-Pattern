public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }
    
    public void high() {
        speed = HIGH;
        System.out.printf("The speed of %s ceiling fan sets to high.\n", this.location);
    } 
    public void medium() {
        speed = MEDIUM; 
        System.out.printf("The speed of %s ceiling fan sets to medium.\n", this.location);
    }
    public void low() {
        speed = LOW;
        System.out.printf("The speed of %s ceiling fan sets to low.\n", this.location);
    }
    
    public void on() {
        System.out.printf("%s ceiling fan is On.\n", this.location);
    }

    public void off() {
        System.out.printf("%s ceiling fan is Off.\n", this.location);
    }
    
    public int getSpeed() {
        return speed;
    }
}
