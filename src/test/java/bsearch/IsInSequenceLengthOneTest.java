package bsearch;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;


public class IsInSequenceLengthOneTest {

	SearchResult searchResult;
	int position = 1;
	int searchedElement = 1;

	@Before
	public void create() {
		int key = 1;
		int[] seq = new int[1];
		seq[0] = 1;
		searchResult = BinarySearch.search(key, seq);
	}

	@Test
	public void isFoundTest() {
		Assert.assertThat( searchResult.isFound(), is(true));
	}

	@Test
	public void getPositionTest() {
		Assert.assertThat(searchResult.getPosition(), is(position));
	}

}
