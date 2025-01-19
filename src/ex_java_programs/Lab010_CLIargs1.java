package ex_java_programs;

public class Lab010_CLIargs1 {
    public static void main(String[] args1) {
        String name=args1[0];
        int age=Integer.parseInt(args1[1]);
        int sal=Integer.parseInt(args1[2]);

        System.out.println("Name    : "+name);
        System.out.println("Age     : "+age);
        System.out.println("Salary  : "+sal);
    }
}
