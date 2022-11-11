public class second {
    public static void main(String[] args) {
        ////2 1 2 3 3 4 4 4 fre of element, 3 2
        int count=0;
        int arr[]={2,1,2,3,3,4,4,4};
        int size = arr.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
    }
}
