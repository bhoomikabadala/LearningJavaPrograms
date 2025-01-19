package ex_java_programs;

public class Lab006_MaxAmong3nos {
    public static void main(String[] args) {
        int x=100;
        int y=200;
        int z=30;

        int res = x>=y ? (x>=z ? x : z) : (y>=z ? y : z);
        System.out.println(res);
    }
}
