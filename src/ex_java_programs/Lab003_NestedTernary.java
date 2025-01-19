package ex_java_programs;

public class Lab003_NestedTernary {
    public static void main(String[] args) {
        int score = -50;
        String grade = score<=100 && score>=90 ? "A" : score<=89 && score>=80 ? "B" : score<=79 && score>=70 ? "C" : score<=69 && score>=60 ? "D" : score<=59 && score>=0 ? "F" : "Not a valid score";
        System.out.println(grade);
    }
}
