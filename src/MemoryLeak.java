import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class MemoryLeak {

    public static void main(String[] args) {
        try {
            givenMap_whenNoEqualsNoHashCodeMethods_thenOutOfMemory();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("End");
        }
    }

    // @Test(expected = OutOfMemoryError.class)
    static void givenMap_whenNoEqualsNoHashCodeMethods_thenOutOfMemory()
            throws IOException, URISyntaxException {

        Map<Object, Object> map = System.getProperties();

        while (true) {
            map.put(new Key("key"), "value");
        }
    }
}
