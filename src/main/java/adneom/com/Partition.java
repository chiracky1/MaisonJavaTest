/**
 * 
 */
package adneom.com;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chirac KYUNGU MUNDADI
 * @apiNote
 * Utility class Partition which allows to subdivide a list into sub-list of given size
 * 
 */
public final class Partition<T> extends AbstractList<List<T>> {
	
	/**
	 * List of items to be parted
	 */
	private final List<T> list;
	
	/**
	 * Size of the sub-list
	 */
	private final Integer taille;

	/**
	 * @param list
	 * @param taille
	 */
	public Partition(List<T> list, Integer taille) {
		super();
		this.list = list;
		this.taille = taille;
	}
	
	/**
	 * @param <T> Type of items
	 * @param list
	 * @param taille
	 * @return parted list
	 * 
	 * <p>Fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » 
	 * et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments</p>
	 * <p>Exemple: </p>
	 * <p>partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]</p>
	 * <p> partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]</p>
	 * <p>partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]</p>
	 * 
	 */
	public static <T> Partition<T> partition(List<T> list, Integer taille){
		return new Partition<T>(list, taille);
	}

	/**
	 *
	 */
	@Override
	public List<T> get(int index) {
		int start = index * taille;
		int end = Math.min(start + taille, list.size());
		
		if (start > end) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of the list range <0," + (size() - 1) + ">");
        }
		return new ArrayList<T>(list.subList(start, end));
	}

	/**
	 *@return size of the list
	 */
	@Override
	public int size() {
		return (int) Math.ceil((double) list.size() / (double) taille);
	}


}
