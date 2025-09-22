import java.util.*;

interface taxable {
    double calctax();
    String gettaxinfo();
}

abstract class product {
    private String pid;
    private String naam;
    private double price;

    public product(String pid, String naam, double price) {
        this.pid = pid;
        this.naam = naam;
        this.price = price;
    }

    public String getpid() {
        return pid;
    }

    public void setpid(String pid) {
        this.pid = pid;
    }

    public String getnaam() {
        return naam;
    }

    public void setnaam(String naam) {
        this.naam = naam;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public abstract double calcdisc();

    public void show() {
        System.out.println("id: " + pid);
        System.out.println("naam: " + naam);
        System.out.println("price: " + price);
    }
}

class elec extends product implements taxable {
    private double taxrate;

    public elec(String pid, String naam, double price, double taxrate) {
        super(pid, naam, price);
        this.taxrate = taxrate;
    }

    public double calcdisc() {
        return getprice() * 0.1;
    }

    public double calctax() {
        return getprice() * taxrate;
    }

    public String gettaxinfo() {
        return "elec tax " + (taxrate * 100) + "%";
    }

    public void show() {
        super.show();
        System.out.println(gettaxinfo());
    }
}

class cloth extends product implements taxable {
    private double taxrate;

    public cloth(String pid, String naam, double price, double taxrate) {
        super(pid, naam, price);
        this.taxrate = taxrate;
    }

    public double calcdisc() {
        return getprice() * 0.2;
    }

    public double calctax() {
        return getprice() * taxrate;
    }

    public String gettaxinfo() {
        return "cloth tax " + (taxrate * 100) + "%";
    }

    public void show() {
        super.show();
        System.out.println(gettaxinfo());
    }
}

class grocery extends product {
    public grocery(String pid, String naam, double price) {
        super(pid, naam, price);
    }

    public double calcdisc() {
        return getprice() * 0.05;
    }

    public void show() {
        super.show();
        System.out.println("no tax");
    }
}

public class ecommerce_plateform {
    public static void main(String[] args) {
        List<product> items = new ArrayList<>();

        elec p1 = new elec("p101", "tv", 30000, 0.18);
        cloth p2 = new cloth("p102", "shirt", 2000, 0.12);
        grocery p3 = new grocery("p103", "aata", 500);

        items.add(p1);
        items.add(p2);
        items.add(p3);

        for (product p : items) {
            p.show();
            double tax = 0;
            if (p instanceof taxable) {
                tax = ((taxable) p).calctax();
            }
            double disc = p.calcdisc();
            double finalamt = p.getprice() + tax - disc;
            System.out.println("disc: " + disc);
            System.out.println("tax: " + tax);
            System.out.println("final price: " + finalamt);
            System.out.println();
        }
    }
}
