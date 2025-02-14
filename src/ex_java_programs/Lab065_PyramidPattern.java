package ex_java_programs;

public class Lab065_PyramidPattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {//i=2(2<6-t)
            for (int j = n-i; j > 1; j--) {//j=1(1>1-f)
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {//j=2(2<=1-f)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
_____*_
____*_*_

 */