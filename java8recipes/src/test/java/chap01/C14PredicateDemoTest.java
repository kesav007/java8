package chap01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C14PredicateDemoTest {
    public static final Predicate<String> LENGTH_FIVE = s -> s.length() == 5;
    public static final Predicate<String> STARTS_WITH_S = s -> s.startsWith("S");
    private final C14PredicateDemo demo = new C14PredicateDemo();
    private String[] names;

    @BeforeEach
    public void setup() {
        names = Stream.of("Kesav", "Mal", "Wash", "Kaylee", "Inara", "Zoë", "Jayne", "Simon", "River", "Shepherd Book").sorted()
                .toArray(String[]::new);
    }

    @Test
    public void getNamesOfLength5() {
        assertEquals("Inara, Jayne, Kesav, River, Simon", demo.getNamesOfLength(5, names));
    }

    @Test
    public void getNamesStartsWith() {
        assertEquals("Kaylee, Kesav", demo.getNamesStartsWith("K", names));
    }

    @Test
    public void composed() {
        assertEquals("Simon", demo.getNamesSatisfyingCondition(LENGTH_FIVE.and(STARTS_WITH_S), names));
        assertEquals("Inara, Jayne, Kesav, River, Shepherd Book, Simon", demo.getNamesSatisfyingCondition(LENGTH_FIVE.or(STARTS_WITH_S), names));
        assertEquals("Kaylee, Mal, Shepherd Book, Wash, Zoë", demo.getNamesSatisfyingCondition(LENGTH_FIVE.negate(), names));
    }

}
