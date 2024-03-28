public class Light {

    String position;

    public Light(String position) {
        this.position = position;
    }

    public void on() {
        System.out.printf("%s light is On.\n", this.position);
    }

    public void off() {
        System.out.printf("%s light is Off.\n", this.position);
    }
}
