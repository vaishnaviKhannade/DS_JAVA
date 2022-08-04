 class BinarySearchByRecursion{

    public static void main(String[] args)
    {
        int[] arr={2,7,9,11,34,41,77};
        int startIndex=0;
        int endIndex=arr.length-1;
        int target=77;
      System.out.println(search(arr,target,startIndex,endIndex)); 
    }


    static int search(int[] arr,int target,int startIndex,int endIndex)
    {
        if(startIndex > endIndex)
        {
        return -1;
        }

      int  mid=(startIndex + endIndex)/2;
      if(target==arr[mid])
      {
        return  mid;
      }
      if(target>arr[mid])
      {
        return search(arr,target,mid+1,endIndex);
      }
     
        return search(arr,target,startIndex,mid-1);
      

    }
 }