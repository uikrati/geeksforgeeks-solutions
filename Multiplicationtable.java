import java.util.ArrayList;

public class Multiplicationtable {
    public static void main(String[] args) {
        class Solution {
            static ArrayList<Integer> getTable(int N) {
                // code here
                ArrayList<Integer> table = new ArrayList<Integer>();
                for (int i = 1; i <= 10; i++) {
                    table.add(N * i);
                }
                return table;

            }
        }
    }
}