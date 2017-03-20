import com.sun.tools.corba.se.idl.IncludeGen;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 21/03/17.
 */
public class QuickSort {

    public static void main(String[] args) {
        Integer []  a = {12, 11, 13, 5, 6, 7};

        quickS(a,0,a.length-1);

    }

    public static void quickS(Integer [] a, int f, int l){

        if(f>l)
            return;

        int pivot =a[f];
        int p=partition (a,pivot,f+1,l);
        quickS(a,f,p-1);
        quickS(a,p+1,l);
    }


    public  static int  partition(Integer[] a, int pivot,int f, int l)
    {


        int originPivotIndex=f-1;

        while (l>f)
        {
            if(a[l]>pivot)
                l--;
            if(a[f]<pivot)
                f++;

            if(a[l]<a[f])
            {
                int temp=a[f];
                a[f]=a[l];
                a[l]=temp;
                l--;
                f++;

            }

        }

        a[originPivotIndex]=a[l];



        a[l]=pivot;



        System.out.println(Arrays.asList(a)+"\n the pivot"+pivot);

        return l;




    }
}
