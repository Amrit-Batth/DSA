public class BubbleSort {
    public int[] bubbleSort(int arr[]) {
        for(int i=1;i < arr.length;i++) {
            for(int j=0;j < arr.length - i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        
        MinMax obj2 = new MinMax();
        int arr[] = obj2.arr();

        int newArr[] = obj.bubbleSort(arr);

        SelectionSort obj3 = new SelectionSort();
        obj3.print(newArr);

    }
    
}
