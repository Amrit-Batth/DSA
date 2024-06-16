public class SelectionSort {
    public int[] selectionSort(int arr[]) {
    for(int i=0;i<arr.length-1;i++) {
        for(int j=i+1;j<arr.length;j++) {
            if(arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr;
    }

    public void print(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");   
        }
    }
    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        MinMax obj = new MinMax();
        
        int arr[] = obj.arr();
        
        int newArr[] = ob.selectionSort(arr);
        ob.print(newArr);

    }
}
