package org.fastcatsearch.ir.query;

import static org.junit.Assert.*;

import org.junit.Test;

public class BooleanClauseTest {

	@Test
	public void test() {
		
		BooleanClause booleanClause = null;//new BooleanClause();
		
		
		
		RankInfo rankInfo = new RankInfo();
		while(booleanClause.next(rankInfo)){
			System.out.println(rankInfo);
		}
		
	}

}
