import java.util.ArrayList;
@SuppressWarnings("unchecked")

public class Driver {

	public static void main(String [] args) {
			ArrayList AL = Sorts.populate(10, 1, 100);
      System.out.println( "ArrayList AL before sorting:\n" + AL );

			System.out.println( "ArrayList AL after bubble sorting:\n");
      System.out.println(Sorts.bubbleSort(AL));

			System.out.println( "ArrayList AL after insertion sorting:\n");
      System.out.println(Sorts.insertionSort(AL));

			System.out.println( "ArrayList AL after selection sorting:\n");
      System.out.println(Sorts.selectionSort(AL));
	}
}
