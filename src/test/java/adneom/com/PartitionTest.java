package adneom.com;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PartitionTest {
	
	List<Integer> list;
	int taille;
	
	@Before
	public void setup() {
		list = Arrays.asList(1, 2, 3, 4, 5);
	}
	
	/**
	 * 
	 */
	@Test
	public void testPartition() {
		
		//Arrange
		List<List<Integer>> expected1 = 
				Arrays.asList(
					Arrays.asList(1, 2),
					Arrays.asList(3, 4),
					Arrays.asList(5));
		List<List<Integer>> expected2 = 
				Arrays.asList(
					Arrays.asList(1,2,3),
					Arrays.asList(4,5));
		List<List<Integer>> expected3 = 
				Arrays.asList(
					Arrays.asList(1),
					Arrays.asList(2),
					Arrays.asList(3),
					Arrays.asList(4),
					Arrays.asList(5));
		//Act
		taille = 2;
		List<List<Integer>> result1 = Partition.partition(list, taille);
		taille = 3;
		List<List<Integer>> result2 = Partition.partition(list, taille);
		taille = 1;
		List<List<Integer>> result3 = Partition.partition(list, taille);
		//Assert
		assertEquals(expected1, result1);	
		assertEquals(expected2, result2);
		assertEquals(expected3, result3);
	}
	
	@Test
	public void testget() {
		//Act1
		taille = 2;
		List<Integer> resultListIndex1 = Arrays.asList(3, 4);
		List<List<Integer>> result = Partition.partition(list, taille);
		List<Integer> listIndex1 = result.get(1);
		
		//Act2
		
		taille = 3;
		List<Integer> resultListIndex2 = Arrays.asList(4, 5);
		List<List<Integer>> result2 = Partition.partition(list, taille);
		List<Integer> listIndex2 = result2.get(1);
		
		//Act 3
		taille = 1;
		List<Integer> resultListIndex3 = Arrays.asList(4);
		List<List<Integer>> result3 = Partition.partition(list, taille);
		List<Integer> listIndex3 = result3.get(3);
		//Assert
		assertEquals(resultListIndex1, listIndex1);
		assertEquals(resultListIndex2, listIndex2);
		assertEquals(resultListIndex3, listIndex3);
	}
	
	@Test
	public void testSize() {
		
		//Act1
		taille = 2;
		List<List<Integer>> result1 = Partition.partition(list, taille);
		int resultSize1 = 3;
		int size1 = result1.size();
		
		//Act2
		taille = 3;
		List<List<Integer>> result2 = Partition.partition(list, taille);		
		int resultSize2 = 2;
		int size2 = result2.size();
		
		//Act3
		taille = 1;
		List<List<Integer>> result3 = Partition.partition(list, taille);
		int resultSize3 = 5;
		int size3 = result3.size();
		
		//Assert
		assertEquals(resultSize1, size1);
		assertEquals(resultSize2, size2);
		assertEquals(resultSize3, size3);
	}

}
