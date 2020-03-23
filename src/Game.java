public class Game {
    RoundResult[] roundHistory;
    int roundConter = 0;

    public Game() {
        roundHistory = new RoundResult[6];
    }

    public String play(int realPlayerFingers, int virtualPlayerFingers) {
        String result = "";
        int sum = realPlayerFingers + virtualPlayerFingers;
        if (sum % 2 == 0) {
            result = "EVEN";
        } else {
            result = "ODD";
        }

        updateHistory(realPlayerFingers, virtualPlayerFingers);

        return result;
    }

    private void updateHistory(
        int realPlayerFingers,
        int virtualPlayerFingers
    ) {
        RoundResult round = new RoundResult();
        round.virtualPlayerFingers = virtualPlayerFingers;

        roundHistory[roundConter] = round;
        roundConter++;
    }
}
