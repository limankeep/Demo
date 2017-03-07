package NumberTwo;
import java.util.*;
public class Cope {
	public static void main(String[] args){
		int arr[] = new int[] {23, 42 ,12};
		int newarr[] = Arrays.copyOf(arr,5);
		int arr2[] = new int[] {23, 42 ,12 , 22 , 1 , 2 , 3 };
		int newarr2 [] = Arrays.copyOfRange(arr2,0,3);
		for (int i =0;i < newarr.length; i++){
			System.out.println(newarr[i]);
		}
		for (int j =0;j < newarr2.length; j++){
			System.out.println(newarr2[j]);
		}
	}
	
}
