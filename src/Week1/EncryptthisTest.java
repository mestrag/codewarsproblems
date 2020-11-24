package Week1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncryptthisTest {
    @Test
    public void exampleTests() {
        assertEquals("", Encryptthis.encryptThis(""));
        assertEquals("65 119esi 111dl 111lw 108dvei 105n 97n 111ka", Encryptthis.encryptThis("A wise old owl lived in an oak"));
        assertEquals("84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp", Encryptthis.encryptThis("The more he saw the less he spoke"));
        assertEquals("84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare", Encryptthis.encryptThis("The less he spoke the more he heard"));
        assertEquals("87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri", Encryptthis.encryptThis("Why can we not all be like that wise old bird"));
        assertEquals("84kanh 121uo 80roti 102ro 97ll 121ruo 104ple", Encryptthis.encryptThis("Thank you Piotr for all your help"));
        assertEquals("105enV", Encryptthis.encryptThis("iVne"));


    }

    @Test
    public void largeExampleTests() {
        assertEquals("90srOe 68iWrokpwTIuOi 65VdWepVhdIZkNp 85pkUHTpirunyqzyzsTsh 121evylffayfWiGqUmpXDq 98 113fR 114MTJEqVRUhqTxwgrmM 116WgoTuvay 105enV 90NjFSbN 121UpJXeijyYf 108DVtsKmdbax",
                Encryptthis.encryptThis("ZerOs DiWrokpwTIuOi ApdWepVhdIZkNV UhkUHTpirunyqzyzsTsp yqvylffayfWiGqUmpXDe b qRf rMTJEqVRUhqTxwgrmM tygoTuvaW \n" +
                        "iVne ZNjFSbN yfpJXeijyYU lxVtsKmdbaD "));
    }
}
