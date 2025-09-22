import java.util.*;

interface insurable {
    double calcins();
    String getinsinfo();
}

abstract class vehicle {
    private String vno;
    private String vtype;
    private double rate;

    public vehicle(String vno, String vtype, double rate) {
        this.vno = vno;
        this.vtype = vtype;
        this.rate = rate;
    }

    public String getvno() {
        return vno;
    }

    public void setvno(String vno) {
        this.vno = vno;
    }

    public String getvtype() {
        return vtype;
    }

    public void setvtype(String vtype) {
        this.vtype = vtype;
    }

    public double getrate() {
        return rate;
    }

    public void setrate(double rate) {
        this.rate = rate;
    }

    public abstract double calcrent(int days);

    public void show() {
        System.out.println("vno: " + vno);
        System.out.println("type: " + vtype);
        System.out.println("rate: " + rate);
    }
}

class car extends vehicle implements insurable {
    private String policyno;

    public car(String vno, String vtype, double rate, String policyno) {
        super(vno, vtype, rate);
        this.policyno = policyno;
    }

    public void setpol(String policyno) {
        this.policyno = policyno;
    }

    public String getpol() {
        return policyno;
    }

    public double calcrent(int days) {
        return getrate() * days;
    }

    public double calcins() {
        return getrate() * 0.15;
    }

    public String getinsinfo() {
        return "car ins id: " + policyno;
    }

    public void show() {
        super.show();
        System.out.println(getinsinfo());
    }
}

class bike extends vehicle implements insurable {
    private String policyno;

    public bike(String vno, String vtype, double rate, String policyno) {
        super(vno, vtype, rate);
        this.policyno = policyno;
    }

    public void setpol(String policyno) {
        this.policyno = policyno;
    }

    public String getpol() {
        return policyno;
    }

    public double calcrent(int days) {
        return getrate() * days * 0.9;
    }

    public double calcins() {
        return getrate() * 0.1;
    }

    public String getinsinfo() {
        return "bike ins id: " + policyno;
    }

    public void show() {
        super.show();
        System.out.println(getinsinfo());
    }
}

class truck extends vehicle implements insurable {
    private String policyno;

    public truck(String vno, String vtype, double rate, String policyno) {
        super(vno, vtype, rate);
        this.policyno = policyno;
    }

    public void setpol(String policyno) {
        this.policyno = policyno;
    }

    public String getpol() {
        return policyno;
    }

    public double calcrent(int days) {
        return getrate() * days + 1000;
    }

    public double calcins() {
        return getrate() * 0.2;
    }

    public String getinsinfo() {
        return "truck ins id: " + policyno;
    }

    public void show() {
        super.show();
        System.out.println(getinsinfo());
    }
}

public class Vehical_rental_System {
    public static void main(String[] args) {
        List<vehicle> list = new ArrayList<>();

        car v1 = new car("MH12AA1234", "car", 1500, "C12345");
        bike v2 = new bike("MH14BB4321", "bike", 500, "B98765");
        truck v3 = new truck("MH13CC9999", "truck", 2500, "T54321");

        list.add(v1);
        list.add(v2);
        list.add(v3);

        int days = 5;

        for (vehicle v : list) {
            v.show();
            double rent = v.calcrent(days);
            double ins = 0;

            if (v instanceof insurable) {
                ins = ((insurable) v).calcins();
            }

            System.out.println("rent for " + days + " days: " + rent);
            System.out.println("insurance: " + ins);
            System.out.println("total cost: " + (rent + ins));
            System.out.println();
        }
    }
}
