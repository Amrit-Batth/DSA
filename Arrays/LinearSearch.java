public class LinearSearch {
    public int linearSearch(int arr[],int key) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        MinMax obj = new MinMax();
        LinearSearch ob = new LinearSearch();
        int arr[] = obj.arr();
        int key = 3;
        System.out.println(ob.linearSearch(arr,key));
        
    }
    
}
