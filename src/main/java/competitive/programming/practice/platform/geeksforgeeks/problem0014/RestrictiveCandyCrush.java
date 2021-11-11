package competitive.programming.practice.platform.geeksforgeeks.problem0014;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/8c8f95810b05b4cab665f2997d36991bd58308a2/1/">https://practice.geeksforgeeks.org/problems/8c8f95810b05b4cab665f2997d36991bd58308a2/1/</a>
 **/
public class RestrictiveCandyCrush implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int k = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        System.out.println(reducedString(k, s));
    }

    public String reducedString(int k, String s) {
        final String regex = String.format("(.)\\1{%d}", k-1);
        final Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            s = matcher.replaceAll("");
            matcher = pattern.matcher(s);
        }
       return s;
    }
}