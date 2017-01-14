package bsearch;

import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;

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
		Assert.assertThat(searchResult.isFound(), is(true));
	}

	@Test
	public void getPositionTest() {
		Assert.assertThat(searchResult.getPosition(), is(position));
	}


}
