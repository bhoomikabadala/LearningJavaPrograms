package ex_java_programs;

public class Lab068_SecSmallInt {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int temp=arr[0];
        for(int i=0; i<arr.length;i++){
            for(int j=i;j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("The second smallest number is "+arr[1]);
    }
}
