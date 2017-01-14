package bsearch;

import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class SequenceIsEmpty {
	
	SearchResult searchResult;


	 @Test(expected = IllegalArgumentException.class)
	    public void givenSequenceIsEmpty() {
			int key = 1;
			int[] seq = {};
			searchResult = BinarySearch.search(key, seq);
		 
	 }


}
