public class InsertionSort{
    public int[] insertionSort(int arr[]) {
        for(int i=1;i < arr.length;i++) {
            int cur = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > cur) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = cur;
        }
        return arr;
    }
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();

        MinMax obj2 = new MinMax();
        int arr[] = obj2.arr();

        int newArr[] = obj.insertionSort(arr);

        SelectionSort obj3 = new SelectionSort();
        obj3.print(newArr);

    }
}
