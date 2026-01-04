import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Map<String, byte[]> CACHE = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        int i = 0;

        while (true) {
            String key = "key-" + i;
            CACHE.put(key, new byte[512 * 1024]); // 512KB

            System.out.println("Cache size: " + CACHE.size());
            i++;

            Thread.sleep(100);
        }
    }
}
