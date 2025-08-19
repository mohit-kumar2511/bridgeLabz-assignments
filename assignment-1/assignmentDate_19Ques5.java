class Test {
    static int count = 0;
}
public class assignmentDate_19Ques5 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.count = 5; 

        Test t2 = new Test();
        System.out.println("Access from t2: " + t2.count); 
    }
}
