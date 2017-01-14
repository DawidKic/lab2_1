package bsearch;

import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;

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
		Assert.assertThat(searchResult.isFound(), is(false));
	}

	@Test
	public void getPositionTest() {
		Assert.assertThat(searchResult.getPosition(), is(position));
	}

}
