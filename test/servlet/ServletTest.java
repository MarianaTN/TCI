/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class ServletTest {
    
    /**
     * Test of doGet method, of class Servlet.
     */
    @Test
    public void testDoGet() throws Exception {
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        Servlet instance = new Servlet();
        instance.doGet(request, response);
    }

    /**
     * Test of doPost method, of class Servlet.
     */
    @Test
    public void testDoPost() throws Exception {
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        Servlet instance = new Servlet();
        instance.doPost(request, response);
    }
    
}
