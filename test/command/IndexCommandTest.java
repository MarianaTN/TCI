/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

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
public class IndexCommandTest {

    /**
     * Test of exec method, of class IndexCommand.
     */
    @Test
    public void testExec() throws Exception {
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        IndexCommand instance = new IndexCommand();
        instance.exec(request, response);
    }
    
}
