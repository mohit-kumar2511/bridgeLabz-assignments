import java.util.*;

abstract class emp {
    private String id;
    private String naam;
    private double base;

    public emp(String id, String naam, double base) {
        this.id = id;
        this.naam = naam;
        this.base = base;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getnaam() {
        return naam;
    }

    public void setnaam(String naam) {
        this.naam = naam;
    }

    public double getbase() {
        return base;
    }

    public void setbase(double base) {
        this.base = base;
    }

    public abstract double calsal();

    public void show() {
        System.out.println("id: " + id);
        System.out.println("naam: " + naam);
        System.out.println("base: " + base);
        System.out.println("sal: " + calsal());
    }
}

class fulltime extends emp {
    private double bonus;
    private String dept;

    public fulltime(String id, String naam, double base, double bonus, String dept) {
        super(id, naam, base);
        this.bonus = bonus;
        this.dept = dept;
    }

    public void setbonus(double bonus) {
        this.bonus = bonus;
    }

    public double getbonus() {
        return bonus;
    }

    public void setdept(String dept) {
        this.dept = dept;
    }

    public String getdept() {
        return dept;
    }

    public double calsal() {
        return getbase() + bonus;
    }

    public void show() {
        super.show();
        System.out.println("dept: " + dept);
    }
}

class parttime extends emp {
    private int hrs;
    private double rate;
    private String dept;

    public parttime(String id, String naam, double base, int hrs, double rate, String dept) {
        super(id, naam, base);
        this.hrs = hrs;
        this.rate = rate;
        this.dept = dept;
    }

    public void sethrs(int hrs) {
        this.hrs = hrs;
    }

    public int gethrs() {
        return hrs;
    }

    public void setrate(double rate) {
        this.rate = rate;
    }

    public double getrate() {
        return rate;
    }

    public void setdept(String dept) {
        this.dept = dept;
    }

    public String getdept() {
        return dept;
    }

    public double calsal() {
        return getbase() + (hrs * rate);
    }

    public void show() {
        super.show();
        System.out.println("dept: " + dept);
    }
}

public class employeeManagement {
    public static void main(String[] args) {
        List<emp> list = new ArrayList<>();

        fulltime e1 = new fulltime("emp01", "raju", 30000, 5000, "dev");
        parttime e2 = new parttime("emp02", "sita", 10000, 20, 300, "ops");

        list.add(e1);
        list.add(e2);

        for (emp e : list) {
            e.show();
            System.out.println();
        }
    }
}
