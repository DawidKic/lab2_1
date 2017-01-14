package bsearch;

import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class IsInSequenceIsMiddleIntervalTest {
	
	SearchResult searchResult;
	int position = 3;

	@Before
	public void create() {
		int key = 3;
		int[] seq = {1,2,3,4,5};
		searchResult = BinarySearch.search(key, seq);
	}

	@Test
	public void isFoundTest() {
		Assert.assertThat(searchResult.isFound(), is(true));
	}

	@Test
	public void getPositionTest() {
		Assert.assertThat(searchResult.getPosition(), is(position));
	}


}
