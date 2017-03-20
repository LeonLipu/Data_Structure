/**
 * Created by brahmanandakar on 21/03/17.
 */
public class binarysort {

    public static void main(String[] args) {

        Integer[] a = {2, 5, 6, 7, 9, 77};

        int index =binaryS(a,0,a.length-1,77);
        System.out.println(index);
    }

    public static int binaryS(Integer [] a,int f,int l ,int num){

        if(f>l)
            return 0;
        int pivot =(l+f)/2;


        if(a[pivot]==num)
            return pivot;


        if(a[pivot]<num)
         return    binaryS(a,pivot+1,l,num);
        else
           return binaryS(a,f,pivot-1,num);
    }

}
