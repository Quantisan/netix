package test;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;;

public class FindTopValuesImpl implements FindTopValues {
	/* (non-Javadoc)
	 * @see test.FindTopValues#findMaxValue(int[])
	 * 
	 * @param anyOldOrderValues must not be null
	 */
	@Override
	public int findMaxValue(int[] anyOldOrderValues) {
		return findTopNValues(anyOldOrderValues, 1)[0];		// code re-use
	}
	
	
	/* (non-Javadoc)
	 * @see test.FindTopValues#findTopNValues(int[], int)
	 * 
	 * @param anyOldOrderValues must not be null
	 * 
	 * reverse sort the array with O(n*log(n)), then extract the head subarray
	 */
	@Override
	public int[] findTopNValues(int[] anyOldOrderValues, int n) {
		int[] arr = Arrays.copyOf(anyOldOrderValues, anyOldOrderValues.length);
		Arrays.sort(arr);
		ArrayUtils.reverse(arr);	// making use of Apache Commons for simplicity
		return ArrayUtils.subarray(arr, 0, n);
	}
}
