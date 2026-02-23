package coding;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int arr[]={2,7,11,19,18};
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(firstMax<arr[i]){
                secondMax=firstMax;
                firstMax=arr[i];

                System.out.println(firstMax);
            }
            if(firstMax>arr[i] && secondMax<arr[i]){
                secondMax=arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
