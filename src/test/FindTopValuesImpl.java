package test;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;;

public class FindTopValuesImpl implements FindTopValues {
	/* 
	 * anyOldOrderValues must not be null
	 */
	@Override
	public int findMaxValue(int[] anyOldOrderValues) {
		return findTopNValues(anyOldOrderValues, 1)[0];
	}
	
	@Override
	public int[] findTopNValues(int[] anyOldOrderValues, int n) {
		int[] arr = Arrays.copyOf(anyOldOrderValues, anyOldOrderValues.length);
		Arrays.sort(arr);
		ArrayUtils.reverse(arr);
		return ArrayUtils.subarray(arr, 0, n);
	}
}
