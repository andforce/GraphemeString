package com.andforce;

public class Main {

    public static void main(String[] args) {
        String testText = "བོད་སྐད་";// +
//                "❤" +
//                "⏭️" +
//                "\uD83D\uDEF3️" +
//                "\uD83E\uDDDF\u200D♂" +
//                "⛹\uD83C\uDFFB\u200D♂" +
//                "\uD83E\uDDDD\uD83C\uDFFF\u200D♂" +
//                "\uD83E\uDDDD\uD83C\uDFFF\u200D♂️" +
//                "\uD83D\uDC68\u200D\uD83D\uDC67\u200D\uD83D\uDC66" +
//                "\uD83D\uDC69\u200D❤\u200D\uD83D\uDC8B\u200D\uD83D\uDC68" +
//                "\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC66\u200D\uD83D\uDC66" +
//                "\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC65\uDB40\uDC6E\uDB40\uDC67\uDB40\uDC7F";
        GraphemeString graphemeString = new GraphemeString(testText);
        System.out.println(graphemeString.graphemesCount());
    }
}
