package com.sri.firstmavenapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sri.model.Calculator;

public class TestCalculator
{
    Calculator c = null;
	@BeforeEach
	public void setUp() throws Exception
	{
		c = new Calculator();
	}
	
	@AfterEach
	public void tearDown() throws Exception
	{
		c = null;
	}
	
	@Test
	public void testSquare()
	{
	    assertEquals(100,c.square(10));	
	}
	@Test
	public void testSum()
	{
	    assertEquals(25,c.sum(10,15));	
	}
	@Test
	public void testpower()
	{
	    assertEquals(16,c.power(2,4));	
	}
}

