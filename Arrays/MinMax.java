import java.util.Scanner;
class MinMax {
//Declare Array
public int[] arr() {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Size of array......");
    int n = sc.nextInt();
   
    int arr[] = new int[n];
    
    System.out.println("enter elemets.......");
    for(int i=0;i<arr.length;i++){arr[i] = sc.nextInt();}
    
    sc.close();
    
    return arr;
}

    public static void main(String[] args) {
    //obj
    MinMax obj = new MinMax();
    int arr[] = obj.arr();

    for(int i=0;i<arr.length;i++){ System.out.print(arr[i]+" ");}
    System.out.println();

    int minNo = arr[0];
    int maxNo = arr[0];
    
    for(int i=0;i<arr.length;i++){
    
    // if(minNo > arr[i]) minNo = arr[i];
    // if(maxNo < arr[i]) maxNo = arr[i];
    
    minNo = Math.min(minNo,arr[i]);
    maxNo = Math.max(maxNo,arr[i]);
 
}
    System.out.println(minNo +" "+maxNo);
    
    }
}