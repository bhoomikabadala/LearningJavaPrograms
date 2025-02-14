package ex_java_programs;

public class Lab066_InvertedPyramidPattern {
    public static void main(String[] args) {
        int n = 6;
        for(int i=n;i>0;i--){//i=4 (4>0 - t)
            for(int j=0; j<=n-i;j++){//j=2 (2<=1 - f)
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){//j=0 (0>0 - f)
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
/*
_*_*_*_*_*_*_
__*_*_*_*_*_

 */