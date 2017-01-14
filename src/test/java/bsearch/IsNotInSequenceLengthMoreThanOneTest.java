package bsearch;

import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;


import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class IsNotInSequenceLengthMoreThanOneTest {
	SearchResult searchResult;
	int position = -1;

	@Before
	public void create() {
		int key = 1;
		int[] seq = {-3,-2,2,5,6};
		searchResult = BinarySearch.search(key, seq);
	}

	@Test
	public void isFoundTest() {
		Assert.assertThat(searchResult.isFound(), is(false));
	}

	@Test
	public void getPositionTest() {
		Assert.assertThat(searchResult.getPosition(), is(position));
	}


}
