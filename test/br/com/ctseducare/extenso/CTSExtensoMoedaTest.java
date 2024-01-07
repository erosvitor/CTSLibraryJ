/*
 * CTS Educare - Solutions for Trainings and Courses.
 * Copyright (c) 2018. All rights reserved.
 *
 */
package br.com.ctseducare.extenso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CTSExtensoMoedaTest {

    @Test
    public void valorPorExtensoNumeroInteiro() {
        assertEquals("dez reais", CTSExtensoMoeda.valorPorExtenso("10"));
    }

    @Test
    public void valorPorExtensoNumeroFracionario() {
        assertEquals("dez reais", CTSExtensoMoeda.valorPorExtenso("10.00"));
    }

    @Test
    public void valorPorExtensoNumeroFracionarioGrande() {
        assertEquals("um mil setecentos e cinquenta reais e quarenta centavos", CTSExtensoMoeda.valorPorExtenso("1750.40"));
    }

    @Test
    public void valorPorExtensoValorNulo() {
        assertEquals("valor inválido", CTSExtensoMoeda.valorPorExtenso(null));
    }

    @Test
    public void valorPorExtensoValorVazio() {
        assertEquals("valor inválido", CTSExtensoMoeda.valorPorExtenso(""));
    }

}
