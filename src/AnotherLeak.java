import java.util.Map;

public class AnotherLeak {

    public static void main(String[] args) {

        givenMap_whenNoEqualsNoHashCodeMethods_thenOutOfMemory();

    }

    // @Test(expected = OutOfMemoryError.class)
    static void givenMap_whenNoEqualsNoHashCodeMethods_thenOutOfMemory(){
        Map<Object, Object> map = System.getProperties();
        while (true) {
            map.put(new Key("key"), "value");
        }}}
