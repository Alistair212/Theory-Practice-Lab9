public class result {
    private boolean failure = false;

    private boolean goToNext;

    private boolean repeat;

    public boolean isFailure() {
        return failure;
    }

    public void setFailure(boolean failure) {
        this.failure = failure;
    }

    public boolean isGoToNext() {
        return goToNext;
    }

    public void setGoToNext(boolean goToNext) {
        this.goToNext = goToNext;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }
}
