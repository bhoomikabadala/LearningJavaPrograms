package ex_java_programs;

import java.util.Scanner;

public class Lab040_TypeOfWebsite {
    public static void main(String[] args) {
        /*String str = "Something.comqqq";
        String domain = "";
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='.'){
                domain=str.substring(i+1);
                break;
            }
        }
        System.out.println(domain);*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the url: ");
        String url = sc.next();
        String domain = "";

        for(int i=url.length()-1;i>=0;i--){
            if(url.charAt(i)=='.'){
                domain=url.substring(i+1);
                break;
            }
        }

        if(domain.equalsIgnoreCase("com")){
            System.out.println("The website type is: Commercial website");
        } else if (domain.equalsIgnoreCase("org")) {
            System.out.println("The website type is: Non-profit organization");
        } else if (domain.equalsIgnoreCase("edu")) {
            System.out.println("The website type is: Educational institution");
        } else if (domain.equalsIgnoreCase("gov")) {
            System.out.println("The website type is: Government website");
        } else if (domain.equalsIgnoreCase("net")) {
            System.out.println("The website type is: Network-related website");
        } else if (domain.equalsIgnoreCase("info")) {
            System.out.println("The website type is: Informational website");
        } else{
            System.out.println("The website type is: Unknown or other types of websites");
        }

        sc.close();
    }
}
