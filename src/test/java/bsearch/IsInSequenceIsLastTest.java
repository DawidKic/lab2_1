package bsearch;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class IsInSequenceIsLastTest {

	
	
	SearchResult searchResult;
	int position = 6;

	@Before
	public void create() {
		int key = 1;
		int[] seq = {2,3,4,5,6,1};
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
