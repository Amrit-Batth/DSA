public class Main
{
    static void sum(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            int sum=0;
            for(int j=i;j<arr.length;j++) {
                sum+=arr[j];
                System.out.println(sum);
            }
        }
    }
    static void longestArithmetic(int arr[]) {
        int pre_def=arr[1]-arr[0];
        int j=2;
        int cur=2;
        int ans=2;
        while(j<arr.length) {
            if(arr[j] - arr[j-1] == pre_def) {
                cur++;
            }else {
                pre_def = arr[j] - arr[j-1];
                ans = Math.max(cur,ans);
                cur=2;
            }
            j++;
        }
        System.out.println(ans);
    }
    static void recordBreaker(int arr[]) {
        int mx=-1;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] > mx && arr[i] > arr[i+1]) {
                System.out.println(arr[i]);
            }
            mx=Math.max(mx,arr[i]);
        }
        if(arr[arr.length-1] > mx) {
            System.out.println(arr[arr.length-1]);
        }
    }
    static void givenSum(int arr[],int target) {
        int flag=0;
        for(int i=0;i<arr.length;i++) {
            int sum=0;
            for(int j=i;j<arr.length;j++) {
                sum+=arr[j];
                if(sum == target) {
                    System.out.print(i+" "+j);
                    flag=1;
                    break;
                }
            }
            if(flag == 1) {
                break;
            }
        }
        if(flag == 0) {
            System.out.println("not found");
        }
    }
    static void smallestPositiveMissing(int arr[]) {
        int idx[] = new int[20];
        
        for(int i=0;i<arr.length;i++) {
            idx[i]=-1;
        }
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>=0) {
            idx[arr[i]]=i; 
            }
        }
        
        for(int i=0;i<arr.length;i++) {
            if(idx[i] == -1) {
                System.out.print(i);
                break;
            }
        }
    }
    static int kadane(int arr[]) {
        int maxsum=0,sum=0;
        for(int i=0;i<arr.length;i++) {
            
            sum+=arr[i];
            
            maxsum=Math.max(maxsum,sum);
            
            if(sum < 0) {
                sum=0;    
            }
        }
        return maxsum;
    }
    static void subArrays(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                for(int k=i;k<j;k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println("");
            }
        }
    }
    static void rotateSubSum(int arr[]) {
        int total=0;
        for(int i=0;i<arr.length;i++) {
            total+=arr[i];
            arr[i] = -arr[i];
        }
        
        int nonwraped = kadane(arr[]);
        
        int sum = total+nonwraped;
        System.out.println(sum);
    }
    static void pairSum(int arr[])
	public static void main(String[] args) {
	    int arr[]={-4,4,6,-6,10,-11,12};
	    rotateSubSum(arr);
// 		System.out.println("Hello World");
	}
}
