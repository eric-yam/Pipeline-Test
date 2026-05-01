import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SandboxTest {

    @Test
    public void Test_01() {
        assertTrue(true);
    }

    @Test
    public void Test_02() {
        String u = System.getenv("incorrectusernamevairablename");
        String p = System.getenv("DEV_PASSWORD");

        System.out.println("Username: " + u);
        System.out.println("Password: " + p);

        Allure.step("Show the environment variables. Username: " + u +" Password: "+ p, () -> {

        });
    }
}
