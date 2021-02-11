package competitive.programming.practice.platform.interviewbit.problem0040;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/merge-intervals/">https://www.interviewbit.com/problems/merge-intervals/</a>
 **/
public class MergeIntervals implements ISolution {

    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        String[] input = scanner.nextLine().split("],\\[");
        ArrayList<Interval> intervals = new ArrayList<>();
        for (String s : input) {
            int[] arr = Utility.getIntArray(s, ",");
            intervals.add(new Interval(arr[0], arr[1]));
        }
        int[] newArr = Utility.getIntArray(scanner.nextLine(), ",");
        Interval newInterval = new Interval(newArr[0], newArr[1]);
        System.out.println(printIntervals(insert(intervals, newInterval)));
    }

    private String printIntervals(ArrayList<Interval> intervals) {
        StringBuilder ans = new StringBuilder();
        for (Interval interval : intervals) {
            ans.append("[").append(interval.start).append(",").append(interval.end).append("]").append(",");
        }
        return ans.toString().substring(0, ans.length() - 1);
    }

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> output = new ArrayList<Interval>();

        int i = 0;
        int size = intervals.size();
        // Add all the points before we encounter the interval
        while (i < size && newInterval.start > intervals.get(i).end) {
            output.add(intervals.get(i));
            i++;
        }

        // For the overlapping ranges, compute the minimum start point and maximum end point of the range
        while (i < size && newInterval.end >= intervals.get(i).start) {
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }
        output.add(newInterval);

        // Add the points after we encounter the interval
        while (i < size) {
            output.add(intervals.get(i));
            i++;
        }
        return output;
    }


    static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}