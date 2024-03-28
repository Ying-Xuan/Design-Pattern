public class Stereo {

    String position;

    public Stereo(String position) {
        this.position = position;
    }

    public void on() {
        System.out.printf("Stereo in %s is On.\n", this.position);
    }

    public void off() {
        System.out.printf("Stereo in %s is Off.\n", this.position);
    }

    public void setCD() {
        System.out.printf("Stereo in %s is set for CD input.\n", this.position);
    }

    public void setVolume(int i) {
        System.out.printf("Stereo volume in %s sets to  %d.\n", this.position, i);
    }
}
