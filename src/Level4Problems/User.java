package Level4Problems;

public class User {
    public static int rank = -8;
    public static int progress = 0;

    public int rank() {
        return rank;
    }

    public int progress() {
        return progress;
    }

    public void incrementProgress(int activityRank) {
        if (activityRank > 8 || activityRank < -8 || activityRank == 0) {
            throw new IllegalArgumentException();
        }
        if (rank == 8) {
            return;
        }
        if (activityRank == rank) {
            progress = +3;
        } else if ((activityRank == rank - 1 && rank != 1) || (activityRank == -1 && rank == 1)) {
            progress = +1;
        } else if (activityRank > rank) {
            int diffInRank;
            diffInRank = activityRank - rank;
            if (activityRank > 0 && rank < 0) {
                diffInRank--;
            }
            progress += (10 * diffInRank * diffInRank);
        }

        if (progress > 100 && rank != 8) {
            int t = progress / 100;
            progress = progress % 100;
            for (int i = 0; i < t; i++) {
                this.rank = rank + 1;
                if (rank == 0) {
                    rank = rank + 1;
                }
            }
            if (rank == 8) {
                progress = 0;
            }
        }

    }
}


