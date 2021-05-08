import java.util.*;

public class Sorting{


    public static void main(String[] args){

        int[] arr = {5,4,3,10,9,1};

        //InsertionSort(arr);
        //SelectionSort(arr);
        //BubbleSort(arr);

        //int[] ans = MergeSort(arr, 0, arr.length-1);

        QuickSort(arr, 0, arr.length-1);

        for(int ele: arr)
          System.out.print(ele+" ");

          System.out.println();

    }


    public static void InsertionSort(int[] arr){
        
        int n = arr.length;
        for(int i = 1;i<n;i++){

           int key = arr[i];
           int j = i-1;

           while(j>=0 && arr[j]>key){

              arr[j+1] = arr[j];
              j--;


           }

           arr[j+1] = key;

        }

    }

    public static void SelectionSort(int[] arr){

          int n = arr.length;
        
          for(int i = 0;i<n-1;i++){
            
             int minIndex = i;
             for(int j = i+1;j<n;j++){
                 
                 if(arr[j]<arr[minIndex])
                    minIndex = j;
             }

             if(minIndex!=i){
                 int temp = arr[i];
                 arr[i] = arr[minIndex];
                 arr[minIndex] = temp;
             }


          }

    }

    public static void BubbleSort(int[] arr){
      
       int n = arr.length;

       for(int i = n-1;i>=1;i--){
         boolean swapped = false;
          for(int j = 0;j<i;j++){
             
             if(arr[j+1]<arr[j]){
                 int temp = arr[j+1];
                 arr[j+1] = arr[j];
                 arr[j] = temp;
                 swapped = true;
             }

          }

          if(!swapped) break;

       }

    }

    public static int[] MergeSort(int[] arr,int si, int ei){
        
         if(si == ei){
             int[] ans1 = new int[1];
             ans1[0] = arr[si];
             return ans1;
         }


           int mid = (si+ei)/2;
            
           int[] fsh = MergeSort(arr, si, mid);
           int[] ssh = MergeSort(arr, mid+1, ei);

           int[] ans = Merge2SortedArrays(fsh, ssh);

           return ans;
 
    }

    public static int[] Merge2SortedArrays(int[] arr1, int[] arr2){

       int n1 = arr1.length;
       int n2 = arr2.length;


       int[] ans = new int[n1+n2];

       int i = 0;
       int j = 0;
       int k = 0;

       while(i<n1&&j<n2){
             
           if(arr1[i]<=arr2[j]){
               ans[k] = arr1[i];
               i++;
               k++; 
           }else if(arr2[j]<=arr1[i]){
               ans[k] = arr2[j];
               j++; 
               k++;
           }

       }

       while(i<n1){
         ans[k] = arr1[i];
         i++;
         k++; 
       }

       while(j<n2){
        ans[k] = arr2[j];
        j++;
        k++; 
       }



       return ans;

    }

    public static void QuickSort(int[] arr, int si, int ei){
       
        if(si<ei){
         
        int pi = partition(arr,si,ei);

        QuickSort(arr, si, pi-1);
        QuickSort(arr, pi+1, ei);

        }

    }

    public static int partition(int[] arr, int si, int ei){
   
        int pivot = arr[ei];
        int i = si, j = ei-1;
        
        while(i<=j){

            if(arr[i]<pivot){
                i++;
            }

            if(arr[j]>pivot){
                j--;
            }

            else if(arr[j]<=pivot && arr[i] > pivot){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;

            }

            
        }

        arr[ei] = arr[i];
            arr[i] = pivot;


            return i;

        
    }


}