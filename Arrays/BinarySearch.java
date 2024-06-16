import java.util.Scanner;
public class BinarySearch{
    public int binarySearch(int arr[],int key) {
        int st=0;
        int e=arr.length;
        while(st <= e) {
            int mid = (st + e)/2;
            if(arr[mid] == key) {
                return mid;
            }
            else if(arr[mid] > key) {
                e = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //obj
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];

        for(int i=0;i<arr.length;i++){ arr[i] = sc.nextInt();}
        int key = sc.nextInt();

        BinarySearch ob = new BinarySearch();
        
        int res = ob.binarySearch(arr,key);
        System.out.println(res);
        
        sc.close();
    }
}
