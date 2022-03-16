public class IntegerArray {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {8, 7, 4, 2, 9};  
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  
}  