package ex_java_programs;

public class Lab48_WhileEvenNos1to20 {
    public static void main(String[] args) {
        int i=1;
        while(i<=20){
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
