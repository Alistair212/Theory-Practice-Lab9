public class q2 {

    result result = new result();

    result returnResult(char x) {
        if (x == '1') {
            result.setFailure(false);
            result.setGoToNext(false);
            result.setRepeat(true);

        } else if (x == '0') {
            result.setFailure(false);
            result.setGoToNext(true);
            result.setRepeat(false);
        } else {
            result.setFailure(true);

        }


        return result;
    }


}
