package ex_java_programs;

public class Lab067_SortArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 10, 1, 100, 3, 4, 32};
        int temp=arr[0];
        for(int i=0; i<arr.length; i++){//i=0(0<8-t)
            for(int j=i; j<arr.length; j++){//j=0(0<8-t)
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
