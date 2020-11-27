package com.company;



public class Main {


    void merge(int arr[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;


        int L[] = new int[n1];
        int R[] = new int[n2];


        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;


        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }


        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public void bubble(int arr[])
    {
        int i,j;
        for(i=0;i<arr.length;i++){
            for (j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void selection(int arr[]){
        int i,j,min;
        for(i=0;i<arr.length;i++){
            min=i;
            for(j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    public static void main(String args[])
    {
        int arr[] = { 15,5,24,8,1,3,16,10,20 };

        System.out.println("Given Array");
        printArray(arr);

        Main ob = new Main();
        ob.selection(arr);

        System.out.println("\nSorted array");
        printArray(arr);

    }
}
