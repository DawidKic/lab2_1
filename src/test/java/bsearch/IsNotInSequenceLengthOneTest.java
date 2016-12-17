package bsearch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class IsNotInSequenceLengthOneTest {
	
	SearchResult searchResult;
	int position = -1;

	@Before
	public void create() {
		int key = 1;
		int[] seq = new int[1];
		seq[0] = 2;
		searchResult = BinarySearch.search(key, seq);
	}

	@Test
	public void isFoundTest() {
		assertSame(searchResult.isFound(), false);
	}

	@Test
	public void getPositionTest() {
		assertSame(searchResult.getPosition(), position);
	}

}
