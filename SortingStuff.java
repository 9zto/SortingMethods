
/**
 * Write a description of class SortingStuff here.
 *
 * @author Kacey Pitcher
 * @version 1/25/18
 */
import java.lang.Math;
public class SortingStuff
{
    int array[];
    public SortingStuff(){
        array = new int[7];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10) + 1;
        }
    }

    public void bubbleSort(){
        boolean unsorted = true;
        while(unsorted){
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++){
                if(array[i + 1] < array[i]){
                    int placeholder = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = placeholder;
                    unsorted = true;
                }
            }
        }
    }

    public void selectionSort(){
        for (int i = 0; i < array.length; i++){
            int temp = array[i];
            boolean placed = false;
            int key = i;
            while(!placed){
                if(temp > array[key + 1]){
                    key++;
                    if(temp == array.length){
                        placed = true;
                    }
                }else{
                    temp = array[key + 1];
                }
            }
        }
    }

    public void insertionSort(){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            boolean placed = false;
            int key = i;
            while (!placed){
                if(temp > array[key - 1]){
                    array[key] = temp;
                    placed = true;
                }else{
                    array[key] = array[key - 1];
                    key--;
                    if(key == 0){
                     array[0] = temp;   
                     placed = true;
                    }
                }
            }
        }
    }

    public boolean checkSort(){
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
    }
}
