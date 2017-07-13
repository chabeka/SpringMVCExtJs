package com.gj.common;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.gj.manager.IBswJournalManager;

public class AppTest {
	
	private IBswJournalManager BswJournalManager = null;
	private 
	
	 @BeforeClass
	 public static void avantTest() {
	        System.out.println("------------------------");
	        System.out.println("Avant Test");
	 }
	    
	 @AfterClass
	 public static void apresTest() {
	        System.out.println("Après Test");
	        System.out.println("------------------------");
	 }
	 
	@Test
    public void additionAvecDeuxNombres() {
        final long lAddition = Operations.additionner(10, 20);
        Assert.assertEquals(30, lAddition);
    }

    @Test
    public void additionAvecCinqNombres() {
        final long lAddition = Operations.additionner(256, 512, 1024, 2048, 4096);
        Assert.assertEquals(7936, lAddition);
    }

    @Test
    public void mutiplicationAvecDeuxNombres() {
        final long lMultiplication = Operations.multiplier(10, 20);
        System.out.println(lMultiplication);
        Assert.assertEquals(200, lMultiplication);
    }
    
    public void testMutiplicationAvecCinqNombres() {
        final long lMultiplication = Operations.additionner(256, 512, 1024, 2048, 4096);
        Assert.assertEquals(1125899906842624L, lMultiplication);
    }
    
    
	    
}
