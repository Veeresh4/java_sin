public class StudentMarks {
    public static void main(String[] args) {
        int marks = 39;
        if (marks >= 90 && marks < 100) {
            System.out.println("O garde");
        }
        else if(marks >= 80 && marks < 90) {
            System.out.println("A garde");
        }
        else if(marks >= 70 && marks < 80) {
            System.out.println("B garde");
        }
        else if(marks >= 55 && marks < 70) {
            System.out.println("C grade");
        }
        else if(marks >= 40 && marks < 55) {
            System.out.println("D grade");
        }
        else {
            System.out.println("Fail");
        }
    }
}
