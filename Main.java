import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        
        System.out.println(arr + " - " + remove2(arr) + " - Удаление четных чисел");
        System.out.println(arr + " - " + min(arr) + " - Минимальное значение");
        System.out.println(arr + " - " + max(arr) + " - Максимальное значение");
        System.out.println(arr + " - " + summ_div_size(arr) + " - Ср. ариф.");

    }
    public static ArrayList<Integer> remove2(ArrayList<Integer> array_in){
        ArrayList<Integer> array = new ArrayList<>(array_in);
        // Копия листа чтобы не изменялся исходный массив
        for (int index = array.size() - 1; index >= 0; index--) {
            if(array.get(index) % 2 == 0) array.remove(index);
            }
        return array;
    }

    public static Integer min(ArrayList<Integer> array) {
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < min) min = array.get(i);                
        }
        return min;
    }

    public static Integer max(ArrayList<Integer> array) {
        int max = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > max) max = array.get(i);                
        }
        return max;
    }

    public static Integer summ_div_size(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum+=array.get(i);
        }
        int res = sum / array.size();
        return res;
    }
  
}