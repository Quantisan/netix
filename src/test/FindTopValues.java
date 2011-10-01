package test;

public interface FindTopValues {
	int findMaxValue(int[] anyOldOrderValues);				// should be static
	int[] findTopNValues(int[] anyOldOrderValues, int n);	// should be static
}