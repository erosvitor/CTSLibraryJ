/*
 * CTS Educare - Solutions for Trainings and Courses.
 * Copyright (c) 2018. All rights reserved.
 *
 */
package br.com.ctseducare.date;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CTSDateTest {

    @Test
    public void getDayFromValidDate() {
        assertEquals(10, CTSDate.getDay("10/10/2010"));
    }

    @Test
    public void getDayFromInvalidDate() {
        assertEquals(0, CTSDate.getDay("32/10/2010"));
    }

    @Test
    public void getMonthFromValidDate() {
        assertEquals(10, CTSDate.getMonth("10/10/2010"));
    }

    @Test
    public void getMonthFromInvalidDate() {
        assertEquals(0, CTSDate.getMonth("32/10/2010"));
    }

    @Test
    public void getYearFromValidDate() {
        assertEquals(2010, CTSDate.getYear("10/10/2010"));
    }

    @Test
    public void getYearFromInvalidDate() {
        assertEquals(0, CTSDate.getYear("32/10/2010"));
    }

}
