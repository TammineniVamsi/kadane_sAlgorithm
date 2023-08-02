public class kadanealgorithm {
    public static void kadanealgo(int arr[]){
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum=currsum+arr[i];
            if(currsum<0){
                currsum=0;
            }
            System.out.println(currsum);
            if(currsum>maxsum){
                maxsum=currsum;
            }
        }
        System.out.println("maxsum is:" +maxsum);
    }
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadanealgo(arr);

    }
    
}
