import java.util.*;
import java.util.List;
import java.util.ArrayList;


public class InSert {

public static void main(String[] args) {
    int[] array={11,22,33,44,55,66,77,88};
    int i,j;
    ArrayList<String> newArray= new ArrayList<String>();
    newArray=insert(array,47);
	for(j=0;j<array.length;j++){

    System.out.print(array[j]+", ");
	}
	System.out.println();
    System.out.println("插入后的新数组为：");
    for(i=0;i<newArray.size();i++){
        System.out.print(newArray.get(i)+",");
		
    }
	System.out.println();
}

public static ArrayList<String> insert(int[] arr, int key){
    ArrayList<String> oldArray = new ArrayList<String>();
    int i;
    int j;
    for (i = 0; arr[i] < key; i++) {
        oldArray.add(String.valueOf(arr[i]));
    }
    oldArray.add(String.valueOf(key));
    for (j = i; j < arr.length; j++) {
        oldArray.add(String.valueOf(arr[j]));
    }
    return oldArray;
}

}
