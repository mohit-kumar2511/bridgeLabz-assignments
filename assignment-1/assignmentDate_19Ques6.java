class demo{
    int demo;

    demo(int demo) {
        this.demo=demo;
    }
}
public class assignmentDate_19Ques6 {
    public static void main(String[] args) {
        demo d1 = new demo(10);
        demo d2 = new demo(20);
        System.out.println("d1.demo: " + d1.demo);
        System.out.println("d2.demo: " + d2.demo);
        d1.demo = 30;
        System.out.println("After changing d1.demo: " + d1.demo);
        System.out.println("d2.demo remains unchanged: " + d2.demo);
    }
}
