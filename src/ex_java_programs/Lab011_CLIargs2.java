package ex_java_programs;

public class Lab011_CLIargs2 {
    public static void main(String[] args2) {
        //String args2[]={"100", "20"};
        int a=Integer.parseInt(args2[0]);
        int b=Integer.parseInt(args2[1]);

        int max=a>=b ? a : b;
        System.out.println("Maximum number between "+a+" and "+b+" is "+max);
    }
}
