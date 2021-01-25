package Level4Problems;

/* https://www.codewars.com/kata/5595c56aa6ca910f27000155/train/java*/
// from checked exception to run time exception
public class Matrix {
    public static void enter() throws Throwable {
        // throw new Neo();
        throwException(new Neo());
    }

    private static <T extends Throwable> void throwException(Throwable throwable) throws T {
        throw (T) throwable;
    }

    public static class Neo extends Exception {
    }


}


