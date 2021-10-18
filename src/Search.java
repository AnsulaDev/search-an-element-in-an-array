 class Search {
    static int search(int arr[],int n, int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={23,43,56,65,11};
        int n=5;
        int x=56;
        int s=search(arr,n,x);
        System.out.print(s);
    }
}
