public class VowelHarmony {
    public static void main(String[] args) {
        System.out.println(dative("tükör"));
        System.out.println(dative("albak"));

        String word = "tükör";
        char[] front = {'e', 'é', 'i', 'í', 'ö', 'ő', 'ü', 'ű'};
        char[] back = {'a', 'á', 'o', 'ó', 'u', 'ú'};

        for (char c : front) {
            // System.out.println(word.indexOf(c));
            if (c == word.indexOf(c)) {
                System.out.println(word + "nek");
            }
            break;
        }
    }

    public static String dative(String word) {
        //'e'|| 'é'|| 'i'|| 'í'|| 'ö'|| 'ő'|| 'ü' ||'ű'
        char[] front = {'e', 'é', 'i', 'í', 'ö', 'ő', 'ü', 'ű'};
        char[] back = {'a', 'á', 'o', 'ó', 'u', 'ú'};

        for (char c : front) {
            if (c == word.indexOf(word)) {
                System.out.println(word + "nek");
            }

        }



/*        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < front.length; i++) {
           builder.append(front[i]);
        }

        String checkWord = builder.toString();
        for (int i = 0; i < checkWord.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                if (checkWord.charAt(i) == word.charAt(j)) ;
                return word + "nek";
            }
            break;
        }*/
        return null;
    }
}
