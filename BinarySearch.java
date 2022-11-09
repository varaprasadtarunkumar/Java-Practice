public class BinarySearch {
public static int bsearch(int s,int e,int arr[],int key){
    int mid=0;
    if(s<=e){
        mid=(s+e)/2;
    }
    //if element is found at mid
    if(arr[mid]==key){
        //System.out.println("The element is found at the index "+mid);
        return (mid+1);
    }
    //if the element is greater than mid
    else if(arr[mid]<key){
        s=mid+1;
        return bsearch(s, e, arr, key);
    }
    else if(arr[mid]>key){
        e=mid-1;
        return bsearch(s, e, arr, key);
    }
    else{
        return -1;
    }

}
    public static void main(String args[]){
        int arr[]={2,4,6,16,27,30,38,45,48,69};
        int key=30;
        int result= bsearch(0, 9, arr, key);
        if(result==-1){
            System.out.println("The element is not found in the array");
        }
        else{
            System.out.println("The element is found at the index "+ result);
        }
    }
}
