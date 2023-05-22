public class Main {
    public static void main(String[] args) {
        String in = (args[0]); //TODO:or overwrite this with a string of values to be read in;
        System.out.println("Input String: " + in);



        char current_state = '1'; //set starting state
        boolean fail = false; //set initial state as an accept state (if input is null, we accept)


        for (int i = 0; i < in.length(); i++) {
            char current = in.charAt(i);
            System.out.println("Looking at int: " + current + " (which is at position " + i + ")");

            if (current_state == '1') {
                q1 Q1 = new q1();
                Q1.returnResult(current);

                if (Q1.result.isFailure()) {
                    System.out.println("NOT ACCEPTED, failed from q1");
                    fail = true;
                    break;

                } else if (Q1.result.isGoToNext()) {
                    System.out.println("Moving from Q1 -> Q2");
                    current_state = '2';
                }


            } else if (current_state == '2') {
                q2 Q2 = new q2();
                Q2.returnResult(current);

                if (Q2.result.isFailure()) {
                    System.out.println("NOT ACCEPTED, failed from q2");
                    fail = true;
                    break;

                } else if (Q2.result.isGoToNext()) {
                    System.out.println("Moving from Q2 -> Q1");
                    current_state = '1';
                }


            }


        }

        if (current_state == '1' && !fail) {
            System.out.println("ACCEPTED");

        } else {
            System.out.println("FAILED, not in end accept state");

        }


    }
}