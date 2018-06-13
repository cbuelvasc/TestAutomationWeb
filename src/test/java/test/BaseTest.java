package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author cbuelvasc
 */
public abstract class BaseTest {

    @BeforeSuite
    public void setUp() {
    }


    @AfterSuite
    public void driverDown() {

    }
}
