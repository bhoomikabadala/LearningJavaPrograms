package ex_java_programs;

public class Lab064_ForInvertedRightAngledTriangle {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--){
            for(int j=i; j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
