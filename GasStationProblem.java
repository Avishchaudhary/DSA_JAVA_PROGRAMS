public class GasStationProblem {
    public static void main(String[] args) {
        int gas[] = { 1, 2, 3, 4, 5, };
        int cost[] = { 3, 4, 5, 1, 2 };
        int starting_point = 0;
        int surplus = 0;
        int deficit = 0;
        for (int i = 0; i < gas.length; i++) {
            surplus = deficit += gas[i] - cost[i];
            if (surplus < 0) {
                surplus = 0;
                starting_point++;
            }
            if (deficit >= 0) {
                System.out.println("Gas station start point is " + starting_point);
                return;
            } else {
                System.out.println("There is no starting point");
            }
        }
    }
}