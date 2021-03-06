import java.util.ArrayList;
@SuppressWarnings("unchecked")

public class Sorts {
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public static void bubbleSortV( ArrayList<Comparable> data ) {
    int passCtr = 0;
    int compCtr = 0;
    int swapCtr = 0;
    passCtr = data.size() - 1;
    for(int i = 0; i < data.size()-1; i++) { //completes n - 1 passes
    	for(int j = data.size() - 1; j > i; j--){ //traversal of the list
        compCtr++; //comparison
    		if((int)data.get(j) < (int)data.get(j - 1)) { //comparing adjacent terms
      		    int temp = (int)data.get(j);
      		    data.set(j, data.get(j - 1));
      		    data.set(j-1, temp);
              swapCtr++; //data.set swaps
    		}
    	}
    }
    System.out.println("bubbleSort # of passes: " + passCtr);
    System.out.println("bubbleSort # of comparisons: " + compCtr);
    System.out.println("bubbleSort # of swaps: " + swapCtr);
  }

  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ) {
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    bubbleSortV( data );

    return data;
  }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public static void selectionSortV( ArrayList<Comparable> data ) {
    int maxPos;
    int passCtr = 0;
    int compCtr = 0;
    int swapCtr = 0;
    passCtr = data.size() - 1;
    for(int pass = data.size() - 1; pass > 0; pass--) {
      System.out.println( "\nbegin pass " + (data.size() - pass) );//diag
      maxPos = pass;

      for(int i = pass - 1; i >= 0; i--) {
        compCtr++; //nexr line compares
        if((int)data.get(i) > (int)data.get(maxPos)) {
          maxPos = i;
        }

        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag

      }

      Comparable temp = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, temp);
      swapCtr++; //data.set is swapping
      System.out.println( "after swap: " +  data );//diag
    }
    System.out.println("selectionSort # of passes: " + passCtr);
    System.out.println("selectionSort # of comparisons: " + compCtr);
    System.out.println("selectionSort # of swaps: " + swapCtr);
  }//end selectionSort

  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input ) {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public static void insertionSortV( ArrayList<Comparable> data ) {
    int passCtr = 0;
    int compCtr = 0;
    int swapCtr = 0;
    passCtr = data.size() - 1;
    for(int partition = 1; partition < data.size(); partition++) {
      //partition marks first item in unsorted region
      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for(int i = partition; i > 0; i--) {
        compCtr++; //if statement compares
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i - 1)) < 0) {

          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag

          data.set( i, data.set( i-1, data.get(i) ) );
          swapCtr++; //elements at the index are being swapped
        }
        else
          break;
      }
    }
    System.out.println("insertionSort # of passes: " + passCtr);
    System.out.println("insertionSort # of comparisons: " + compCtr);
    System.out.println("insertionSort # of swaps: " + swapCtr);
  }//end insertionSortV

  public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> input ) {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    insertionSortV( data );

    //return working ArrayList
    return data;
  }//end insertionSort

}
