package com.andforce;

import java.util.List;

public final class GraphemeString {
    private final List<String> mGraphemes;
    private final String mSource;

    public GraphemeString(int version, String src) {
        IGrapheme iGrapheme;
        if (version == 10) {
            iGrapheme = new CodePoint10_0_0();
        } else {
            iGrapheme = new CodePoint10_0_0();
        }
        mSource = src;
        mGraphemes = iGrapheme.splitGraphemes(mSource);
    }

    public GraphemeString(String src) {
        this(10, src);
    }

    public String graphemeAt(int index) {
        return mGraphemes.get(index);
    }

    public String subGraphemes(int beginGraphemeIndex, int endGraphemeIndex) {
        if (mGraphemes == null) {
            return null;
        }
        List<String> sub = mGraphemes.subList(beginGraphemeIndex, endGraphemeIndex);
        StringBuilder sb = new StringBuilder();
        for (String s : sub) {
            sb.append(s);
        }
        return sb.toString();
    }

    // Returns the number of grapheme clusters there are in the given string
    public int graphemesCount() {
        return mGraphemes.size();
    }

    public List<String> getGraphemes() {
        return mGraphemes;
    }

    @Override
    public String toString() {
        return mSource;
    }
}