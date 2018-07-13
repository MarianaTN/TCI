/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marit
 */
public class InitialServiceTest {
    
    /**
     * Test of lerDadosIniciais method, of class InitialService.
     */
    @Test
    public void testLerDadosIniciais() {
        InitialService.lerDadosIniciais();
    }

    /**
     * Test of configuracoesIniciais method, of class InitialService.
     */
    @Test
    public void testConfiguracoesIniciais() {
        InitialService.configuracoesIniciais();
    }

    /**
     * Test of getGrupos method, of class InitialService.
     */
    @Test
    public void testGetGrupos() throws Exception {
        int idAtividade = 0;
        InitialService instance = new InitialService();
        instance.getGrupos(idAtividade);
    }

    /**
     * Test of getAtividade method, of class InitialService.
     */
    @Test
    public void testGetAtividade() throws Exception {
        int idAtividade = 1;
        InitialService instance = new InitialService();
        instance.getAtividade(idAtividade);
    }

    /**
     * Test of getDisciplina method, of class InitialService.
     */
    @Test
    public void testGetDisciplina() throws Exception {
        int idDisciplina = 0;
        InitialService instance = new InitialService();
        instance.getDisciplina(idDisciplina);
    }
    
}
