import java.util.ArrayList;

public class Driver {

	public static void main(String [] args) {
			ArrayList AL = Sorts.populate(10, 1, 100);
      System.out.println( "ArrayList AL before bubble sorting:\n" + AL );
      Sorts.bubble(AL);
      System.out.println( "ArrayList AL after bubble sorting:\n" + AL );

			System.out.println( "ArrayList AL before insertion sorting:\n" + AL );
      Sorts.insertion(AL);
      System.out.println( "ArrayList AL after insertion sorting:\n" + AL );

			System.out.println( "ArrayList AL before selection sorting:\n" + AL );
      Sorts.selection(AL);
      System.out.println( "ArrayList AL after selection sorting:\n" + AL );
	}
}
