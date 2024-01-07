/*
 * CTS Educare - Solutions for Trainings and Courses.
 * Copyright (c) 2018. All rights reserved.
 *
 */
package br.com.ctseducare.extenso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CTSExtensoDataTest {

    //--------------------------------------------------------------------------------
    // Testes para validar dia da semana por extenso
    //--------------------------------------------------------------------------------
    @Test
    public void nomeDoDiaDaSemanaValido() {
        assertEquals("segunda", CTSExtensoData.nomeDoDiaDaSemana(1));
    }

    @Test
    public void nomeDoDiaDaSemanaInvalido() {
        assertEquals("dia semana inválido", CTSExtensoData.nomeDoDiaDaSemana(8));
    }

    @Test
    public void nomeDoDiaDaSemanaCompletoValido() {
        assertEquals("segunda-feira", CTSExtensoData.nomeDoDiaDaSemanaCompleto(1));
    }

    @Test
    public void nomeDoDiaDaSemanaCompletoInvalido() {
        assertEquals("dia semana inválido", CTSExtensoData.nomeDoDiaDaSemanaCompleto(8));
    }

    //--------------------------------------------------------------------------------
    // Testes para validar dia do mês por extenso
    //--------------------------------------------------------------------------------
    @Test
    public void nomeDoMesValido() {
        assertEquals("outubro", CTSExtensoData.nomeDoMes(10));
    }

    @Test
    public void nomeDoMesInvalido() {
        assertEquals("mês inválido", CTSExtensoData.nomeDoMes(0));
    }

    @Test
    public void nomeDoMesUsandoDataValida() {
        assertEquals("outubro", CTSExtensoData.nomeDoMes("10/10/2010"));
    }

    @Test
    public void nomeDoMesUsandoDataInvalida() {
        assertEquals("mês inválido", CTSExtensoData.nomeDoMes("10/20/2010"));
    }

    @Test
    public void nomeDoMesUsandoDataIncompleta() {
        assertEquals("mês inválido", CTSExtensoData.nomeDoMes("10/10/20"));
    }

    @Test
    public void nomeDoMesUsandoDataNula() {
        assertEquals("mês inválido", CTSExtensoData.nomeDoMes(null));
    }

    //--------------------------------------------------------------------------------
    // Testes para validar data por extenso
    //--------------------------------------------------------------------------------
    @Test
    public void dataPorExtensoDataValida() {
        assertEquals("10 de outubro de 2010", CTSExtensoData.dataPorExtenso("10/10/2010"));
    }

    @Test
    public void dataPorExtensoDataInvalida() {
        assertEquals("data inválida", CTSExtensoData.dataPorExtenso("10/20/2010"));
    }

    @Test
    public void dataPorExtensoDataIncompleta() {
        assertEquals("data inválida", CTSExtensoData.dataPorExtenso("10/20/20"));
    }

    @Test
    public void dataPorExtensoDataNula() {
        assertEquals("data inválida", CTSExtensoData.dataPorExtenso(null));
    }

    @Test
    public void dataPorExtensoDataVazia() {
        assertEquals("data inválida", CTSExtensoData.dataPorExtenso(""));
    }

}
