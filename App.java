
public class App
{
    private static int size;

    public static void main(String args[])
    {

        /*
        int[] array = {7,6,4,2,9,4};
        size = array.length;
        sort(array);
       */

        //System.out.print("e");

    }

    public static void sort(int[] array)
    {
        int[] newArr = new int[size];

        for (int i=size-1; i>0; i--) {
            System.out.print(" " + 1 + "~");
            for (int k=0; k<i; k++) {
                System.out.print(2);
                if (array[k] > array[k+1]) {
                    int tmp = array[k];
                    array[k] = array[k+1];
                    array[k+1] = tmp;
                }
            }
    }

        for (int i=0; i<size; i++) {
            //System.out.print(" " + array[i]);
        }
    }


}
