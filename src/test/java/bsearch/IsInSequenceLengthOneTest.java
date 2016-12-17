package bsearch;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import edu.iis.mto.bsearch.SearchResult;


public class IsInSequenceLengthOneTest {
	
	SearchResult searchResult;
	
	@Before
	public void create()
	{
		searchResult = mock(SearchResult.class);
		when(searchResult.isFound()).thenReturn(true);
		when(searchResult.getPosition()).thenReturn(1);
		
	}
	
	@Test
	public void test()
	{
		
	}

}
