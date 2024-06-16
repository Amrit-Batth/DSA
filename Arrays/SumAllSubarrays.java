public class SumAllSubarrays {
    public void printSubArrays(int arr[]) {
        for(int i=0;i < arr.length;i++) {
            int max = 0;
            for(int j=i;j < arr.length;j++) {
                max += arr[j];
                System.out.print(max+" ");
            }
        }
    }
    public static void main(String[] args) {
        SumAllSubarrays obj = new SumAllSubarrays();
        
        MinMax obj2 = new MinMax();
        int arr[] = obj2.arr();

        obj.printSubArrays(arr);
    }
    
}
