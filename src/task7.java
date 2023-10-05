class gettersSetters {
    private int a;
    private double b;
    private boolean c;
    private String d;

    // Getter and Setter methods for each property
    public int geta() {
        return a;
    }

    public void seta(int value) {
        a = value;
    }

    public double getb() {
        return b;
    }

    public void setb(double value) {
        b = value;
    }

    public boolean isc() {
        return c;
    }

    public void setc(boolean value) {
       c = value;
    }

    public String getd() {
        return d;
    }

    public void setd(String value) {
        d = value;
    }
}

// Main class for task 7
public class task7 {
    public static void main(String[] args) {
        gettersSetters obj = new gettersSetters();

        // Using setters to assign values
        obj.seta(2);
        obj.setb(3.141592653589793238462643383279502884197);
        obj.setc(true);
        obj.setd("It Depends");

        // Using getters to retrieve values
        System.out.println("int " + obj.geta());
        System.out.println("double " + obj.getb());
        System.out.println("boolean " + obj.isc());
        System.out.println("String " + obj.getd());
    }

}