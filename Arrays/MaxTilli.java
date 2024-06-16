public class MaxTilli { 
    public void maxtillI(int arr[]) {
        int max = arr[0];
        for(int i=0;i < arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            System.out.print(max+" ");
        }
    }
    public static void main(String[] args){
        MaxTilli obj = new MaxTilli();

        MinMax obj2 = new MinMax();
        int arr[] = obj2.arr();
        obj.maxtillI(arr);
    }
    
}
