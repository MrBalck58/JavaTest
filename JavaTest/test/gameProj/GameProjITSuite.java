/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameProj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Denis
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({gameProj.SimpleDotCom2IT.class, gameProj.DotComIT.class, gameProj.SimpleDotComGameIT.class, gameProj.GameHelperIT.class, gameProj.SimpleDotComTestDriveIT.class})
public class GameProjITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
