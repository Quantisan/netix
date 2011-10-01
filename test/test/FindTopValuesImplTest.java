package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FindTopValuesImplTest {
	FindTopValues instance;
	int[] arrEmpty, arrSingle, arrOverlap, arrNormal;
	
	@Before
	public void setUp() throws Exception {
		instance = FindTopValuesImpl.getInstance();
		
		arrSingle = new int[1];
		arrSingle[0] = 10;
		
		arrOverlap = new int[5];
		arrOverlap[0] = 40;
		arrOverlap[1] = 20;
		arrOverlap[2] = 10;
		arrOverlap[3] = 0;
		arrOverlap[4] = 20;
		
		arrNormal = new int [5];
		arrNormal[0] = 50;
		arrNormal[1] = 10;
		arrNormal[2] = 30;
		arrNormal[3] = 20;
		arrNormal[4] = 40;		
	}

	@Test
	public void testFindMaxValueSingle() {
		assertEquals(10, instance.findMaxValue(arrSingle));
	}
	
	@Test
	public void testFindMaxValueEmptyOverlap() {
		assertEquals(40, instance.findMaxValue(arrOverlap));
	}
	
	@Test
	public void testFindMaxValueNormal() {
		assertEquals(50, instance.findMaxValue(arrNormal));
	}
	
	@Test
	public void testFindTopNValuesSingle() {
		assertArrayEquals(new int[]{50}, instance.findTopNValues(arrNormal, 1));
	}

	@Test
	public void testFindTopNValuesFull() {
		assertArrayEquals(new int[]{50, 40, 30, 20, 10}, instance.findTopNValues(arrNormal, 5));		
	}
	
	@Test
	public void testFindTopNValuesOverlap() {
		assertArrayEquals(new int[]{40, 20, 20, 10, 0}, instance.findTopNValues(arrOverlap, 5));
	}
}
