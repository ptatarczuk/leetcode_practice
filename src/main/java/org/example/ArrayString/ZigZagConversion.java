package org.example.ArrayString;

/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

        P   A   H   N
        A P L S I I G
        Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows);
*/

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] sbs = new StringBuilder[numRows];
        int row = 0;
        int dir = 0;

        for (int i = 0; i < sbs.length; i++) {
            sbs[i] = new StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            row += dir;
            sbs[row].append(c);

            if (row == 0 || row == numRows -1) {
                dir = (dir == 0) ? 1 : -dir;
            }
        }
        return convert(sbs);
    }

    private String convert(StringBuilder[] sbs) {
        StringBuilder result = new StringBuilder();

        for (StringBuilder sb: sbs) {
            result.append(sb.toString());
        }
        return result.toString();
    }
}
