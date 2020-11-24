package Week1;

public class Roughnotes<T> {
    public static void main(String[] args) {
        int[] tree = new int[3];
        char[] arr2 = {'a', 'á', 'o', 'ó', 'u', 'ú'};
        for (int x : tree) {
            tree[x] = 2;
            //System.out.println(tree[x]);
            char[] backup = {'e', 'é', 'i', 'í', 'ö', 'ő', 'ü', 'ű'};
            String word = "abek";
            for (int j = 0; j < backup.length; j++) {
                System.out.println(backup.toString().codePointAt(j));
                for (int k = j; k < word.length(); k++) {
                    System.out.println(word.codePointAt(k) + "::");
                    // System.out.println("))))");
                }
            }

        }
        //  System.out.println(97==97);
    }

    public T gnericTest(T t) {
        return t;
    }


}
