import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CharaccterLongestRepetitionTest {
    @Test
    public void exampleTests() {
        assertArrayEquals(new Object[]{"a", 4}, CharacterLongestRepetition.longestRepetition("aaaabb"));
        assertArrayEquals(new Object[]{"a", 4}, CharacterLongestRepetition.longestRepetition("bbbaaabaaaa"));
        assertArrayEquals(new Object[]{"u", 3}, CharacterLongestRepetition.longestRepetition("cbdeuuu900"));
        assertArrayEquals(new Object[]{"b", 5}, CharacterLongestRepetition.longestRepetition("abbbbb"));
        assertArrayEquals(new Object[]{"a", 2}, CharacterLongestRepetition.longestRepetition("aabb"));
        assertArrayEquals(new Object[]{"", 0}, CharacterLongestRepetition.longestRepetition(""));

    }
}