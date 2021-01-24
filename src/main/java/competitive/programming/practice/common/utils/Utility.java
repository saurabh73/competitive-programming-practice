package competitive.programming.practice.common.utils;

import java.util.Arrays;

public class Utility {

    public static String[] getStringArray(String line, String delimiter) {
        return Arrays.stream(
                line.replace("[", "")
                        .replace("]", "")
                        .replaceAll("\"", "")
                        .split(delimiter)
        ).map(String::trim).toArray(String[]::new);
    }

    public static int[] getIntArray(String line, String delimiter) {
        return Arrays.stream(getStringArray(line, delimiter)).mapToInt(Integer::parseInt).toArray();
    }

}
