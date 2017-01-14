package bsearch;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class IsInSequenceDecreasingSequenceTest {

	SearchResult searchResult;
	int position = -1;

	@Before
	public void create() {
		int key = 1;
		int[] seq = {5,4,3,2,1};
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
