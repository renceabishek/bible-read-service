/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bible.read.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    @Test public void testAppHasAGreeting() {
        Application classUnderTest = new Application();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
