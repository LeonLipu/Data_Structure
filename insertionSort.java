import java.util.Arrays;

/**
 * Created by brahmanandakar on 21/03/17.
 */
public class insertionSort {

    public static void main(String[] args) {
        Integer []  a = {12, 11, 13, 5, 6, 7};


        for (int i = 1; i <a.length ; i++) {

            int c=i;
            int element=a[i];
            while( c>=1 && a[c-1]>element )
            {

                a[c]=a[c-1];
                c--;
            }
            a[c]=element;



        }

        System.out.println(Arrays.asList(a));



    }


}
