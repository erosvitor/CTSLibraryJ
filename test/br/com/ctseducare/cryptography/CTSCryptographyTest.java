/*
 * CTS Educare - Solutions for Trainings and Courses.
 * Copyright (c) 2018. All rights reserved.
 *
 */
package br.com.ctseducare.cryptography;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CTSCryptographyTest {

    @Test
    public void generateMD5() {
        assertEquals("2d087b840610c4eb2a8eaf3ab87948eb", CTSHashGenerator.md5("Eros Vitor"));
    }

    @Test
    public void generateSHA1() {
        assertEquals("0194470ad2ef06521edccfe314d40445b1d6b7c1", CTSHashGenerator.sha1("Eros Vitor"));
    }

    @Test
    public void generateSHA256() {
        assertEquals("e0bb240c2be09626d5a53bf93d77ce9af094ce8e0c6abbd5c2edeb9b5ba9aa18", CTSHashGenerator.sha256("Eros Vitor"));
    }

}