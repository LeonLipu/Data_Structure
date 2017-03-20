import java.util.Arrays;

/**
 * Created by brahmanandakar on 21/03/17.
 */
public class mergeSort {


    public static void main(String[] args) {

        Integer []  a = {12, 11, 13, 5, 6, 7,9};
        mergeS(a,0,a.length-1);

        System.out.println(Arrays.asList(a));

    }

    public static void mergeS(Integer [] a,int f,int l ){

        if(f>=l)
            return;
        int mid =(l+f)/2;
        mergeS(a,f,mid);
        mergeS(a,mid+1,l);

        merge(a,mid,f,l);
    }


    public static void merge(Integer [] a, int mid , int f, int l){


        int b=f;
        int e=mid+1 ;
        int k=0;

        Integer [] temp=new Integer[l-f+1];


        System.out.println(Arrays.asList(a).subList(f,mid+1)+"first half");
        System.out.println(Arrays.asList(a).subList(mid+1,l+1)+"second  half");

        System.out.println(temp.length);



        while (b<=mid || e<=l)
        {
            if(b<=mid && e<=l)
            {
                if(a[b]>a[e])
                    temp[k++]=a[e++];
                else
                    temp[k++]=a[b++];

            }else
                if(b<=mid)
                    temp[k++]=a[b++];
            else
                temp[k++]=a[e++];
        }

        for (int i=f;i<=l;i++){

            a[i]=temp[i-f];
        }






    }
}
