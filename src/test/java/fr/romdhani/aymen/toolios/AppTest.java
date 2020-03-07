package fr.romdhani.aymen.toolios;


import fr.romdhani.aymen.toolios.core.orm.UserAccount;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hibernate.Transaction;
import org.junit.Assert;

;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        UserAccount userAccount = new UserAccount("aym.rom", "aymen", "rom", "toto@gmail.com", "0657883456", "manual", null);
        Assert.assertNotNull(userAccount);
        Assert.assertEquals(userAccount.getF_name(), "aymen");
    }
}
