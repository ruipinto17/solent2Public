/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ruipinto17.com504.ood;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 4coelr28
 */
public class MyTestClassLog4jTest {
 @Test
    public void hello() {
             MyTestClassLog4j myTestClassLog4j = new MyTestClassLog4j();
       myTestClassLog4j.writeAboutMe();
    }
}
