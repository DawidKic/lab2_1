package bsearch;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class IsInSequenceIsFirstTest {
	
	SearchResult searchResult;
	int position = 1;

	@Before
	public void create() {
		int key = 1;
		int[] seq = {1,2,3,4,5,6,7,8,9,10,11,12};
		searchResult = BinarySearch.search(key, seq);
	}

	@Test
	public void isFoundTest() {
		assertSame(searchResult.isFound(), true);
	}

	@Test
	public void getPositionTest() {
		assertSame(searchResult.getPosition(), position);
	}


}
