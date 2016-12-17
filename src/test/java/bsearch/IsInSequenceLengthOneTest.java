package bsearch;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

import static org.junit.Assert.*;

public class IsInSequenceLengthOneTest {

	SearchResult searchResult;
	int position = 1;

	@Before
	public void create() {
		int key = 1;
		int[] seq = new int[1];
		seq[0] = 1;
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
