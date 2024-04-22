import org.example.IAMRolePolicyVerifier;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class IAMRolePolicyVerifierTest {

    @Test
    void testVerifyJsonWithValidResource() {

        String filePath = "src/test/java/testTrue.json";

        boolean result = IAMRolePolicyVerifier.verifyJson(filePath);
        assertTrue(result, "Prawidłowy JSON nie powinien zawierać pojedynczej gwiazdki w polu Resource");
    }

    @Test
    void testVerifyJsonWithInvalidResource() {
        String filePath = "src/test/java/testFalse.json";

        boolean result = IAMRolePolicyVerifier.verifyJson(filePath);
        assertFalse(result, "Nieprawidłowy JSON zawiera pojedynczą gwiazdkę w polu Resource");
    }

    @Test
    void testVerifyJsonWithMissingFile() {
        String filePath = "src/test/java/notExistingFile.json";
        File file = new File(filePath);
        assertFalse(file.exists(), "Plik nie powinien istnieć przed wykonaniem testu");

        boolean result = IAMRolePolicyVerifier.verifyJson(filePath);
        assertFalse(result, "Metoda powinna zwrócić false, gdy plik nie istnieje");
    }

    @Test
    void testVerifyJsonWithWhiteSpaces() {
        String filePath = "src/test/java/testWhite.json";

        boolean result = IAMRolePolicyVerifier.verifyJson(filePath);
        assertTrue(result, "Nieprawidłowy JSON zawiera pojedynczą gwiazdkę w polu Resource");
    }
}
