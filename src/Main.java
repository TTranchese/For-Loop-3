import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] arr = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		int c = 1;
		for (int i = 0; i <arr.length-1; i++) {
			if (c==3){
				c=0;
				arr[i]=arr[i].toUpperCase();
			}
			c++;
		}
		System.out.println(Arrays.toString(arr));
		//testing con pià di 7 giorni
		String[] arr1 = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		int c1 = 1;
		for (int i = 0; i <arr1.length-1; i++) {
			if (c1==3){
				c1=0;
				arr1[i]=arr1[i].toUpperCase();
			}
			c1++;
		}
		System.out.println(Arrays.toString(arr1));

	}
}