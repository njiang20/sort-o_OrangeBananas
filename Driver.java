import java.util.ArrayList;
@SuppressWarnings("unchecked")

public class Driver {

	public static void main(String [] args) {
		ArrayList bestCase = new ArrayList<Integer>();
    bestCase.add(12);
    bestCase.add(7);
    bestCase.add(5);
    bestCase.add(3);
    bestCase.add(1);

		ArrayList worstCase = new ArrayList<Integer>();
    bestCase.add(1);
    bestCase.add(3);
    bestCase.add(5);
    bestCase.add(7);
    bestCase.add(12);

		System.out.println("Bubble Sort best-case # of passes: " + Sorts.bubbleSort(bestCase));
		System.out.println("Selection Sort best-case # of passes: " + Sorts.selectionSort(bestCase));
		System.out.println("Insertion Sort best-case # of passes: " + Sorts.insertionSort(bestCase));

		System.out.println("\nBubble Sort worst-case # of passes: " + Sorts.bubbleSort(worstCase));
		System.out.println("Selection Sort worst-case # of passes: " + Sorts.selectionSort(worstCase));
		System.out.println("Insertion Sort worst-case # of passes: " + Sorts.insertionSort(worstCase));

		/*
		ArrayList AL = Sorts.populate(10, 1, 100);
    System.out.println( "\nArrayList AL before sorting:\n" + AL );

		System.out.println( "\nArrayList AL after bubble sorting:\n");
    System.out.println(Sorts.bubbleSort(AL));

		System.out.println( "\nArrayList AL after insertion sorting:\n");
    System.out.println(Sorts.insertionSort(AL));

		System.out.println( "\nArrayList AL after selection sorting:\n");
    System.out.println(Sorts.selectionSort(AL));
		*/
	}
}
