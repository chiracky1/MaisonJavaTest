/**
 * 
 */
package adneom.com;

import java.util.Arrays;
import java.util.List;

/**
 * @author chirac KYUNGU MUNDADI
 *
 */
public class MainFonctionPartition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
		System.out.println("Liste "+numbers1+" après partionnement: "+Partition.partition(numbers1, 2));
		final List<Integer> numbers2 = Arrays.asList(1,2,3,4,5);
		System.out.println("Liste "+numbers2+" après partionnement: "+Partition.partition(numbers2, 3));
		final List<Integer> numbers3 = Arrays.asList(1,2,3,4,5);
		System.out.println("Liste "+numbers3+" après partionnement: "+Partition.partition(numbers3, 1));

	}

}
