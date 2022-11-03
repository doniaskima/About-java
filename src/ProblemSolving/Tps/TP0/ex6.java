public class ex6 {
    public static double examan(double note) {
        return note;
    }
    public static void main(String[] args) {
        double note = examan(11);
        if (note > 10) {
            System.out.println("success");
        }
        else {
            System.exit(1);
        }
    }
}
