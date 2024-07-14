/*
 * Copyright 2023 .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mydistance.util;

import com.mydistance.util.ConversionUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static java.lang.System.out;

/**
 *
 * @author hp
 */
public class ConversionUtilTest {
    
    public ConversionUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertKMToMile method, of class ConversionUtil.
     */
    @Test
    public void testConvertKMToMile() {
        out.println("convertKMToMile");
        double distance = 4.0;
        ConversionUtil instance = new ConversionUtil();
        double expResult = 2.48548;
        double result = instance.convertKMToMile(distance);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of convertkmToYard method, of class ConversionUtil.
     */
    @Test
    public void testConvertkmToYard() {
        out.println("convertkmToYard");
        double distance = 4.0;
        ConversionUtil instance = new ConversionUtil();
        double expResult = 4374.45;
        double result = instance.convertkmToYard(distance);
        assertEquals(expResult, result, 0.10);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of convertMToMile method, of class ConversionUtil.
     */
    @Test
    public void testConvertMToMile() {
        out.println("convertMToMile");
        double distance = 4000.0;
        ConversionUtil instance = new ConversionUtil();
        double expResult = 2.48548;
        double result = instance.convertMToMile(distance);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of convertMtoYard method, of class ConversionUtil.
     */
    @Test
    public void testConvertMtoYard() {
        out.println("convertMtoYard");
        double distance = 4000.0;
        ConversionUtil instance = new ConversionUtil();
        double expResult = 4374.45;
        double result = instance.convertMtoYard(distance);
        assertEquals(expResult, result, 0.10);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fnConvertKMToM method, of class ConversionUtil.
     */
    @Test
    public void testfnConvertKMToM() {
        out.println("fnConvertKMToM");
        double distance = 4.0;
        ConversionUtil instance = new ConversionUtil();
        double expResult = 4000.00;
        double result = instance.fnConvertKMToM(distance);
        assertEquals(expResult, result, 0.10);
    }
    
}
