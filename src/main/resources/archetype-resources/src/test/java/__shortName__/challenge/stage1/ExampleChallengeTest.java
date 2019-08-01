#set($hash = '#')
package ${package}.${shortName}.challenge.stage1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleChallengeTest {
    @BeforeEach
    void setUp(){
        System.out.println("${hash}${hash}polylith[testStarted");
    }

    @Test
    void test_scenarioOne() {
        // TODO: Write your first test here
    }

    @AfterEach
    void tearDown() {
        System.out.println("${hash}${hash}polylith[testFinished");
    }
}