import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
    public static void main(String[] args) {
        String [] candidates = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };
        for (String candidate: candidates) {
            gettingInTouch(candidate);
        }
    }

    static void gettingInTouch(String candidate) {
        int attemptsMade = 1;
        boolean keepTrying = true;
        boolean attended = false;
        do { 
            attended = toAnswer();
            keepTrying = !attended;
            if(keepTrying)
                attemptsMade++;
            else
                System.out.println("Successful contact made");

        } while (keepTrying && attemptsMade < 3);

        if(attended) 
            System.out.println("We have contacted " + candidate + " with " + attemptsMade + " attempt");
        else
            System.out.println("We were unable to contact " + candidate + ", maximum number of attempts " + attemptsMade + " made");
    }

    static boolean toAnswer() {
        return new Random().nextInt(3) == 1;
    }

    static void PrintSelectedCandidates() {
        String [] candidates = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };

        System.out.println("To print the list of candidates, indicating the index of each element");

        for (int index=0; index < candidates.length; index++) {
            System.out.println("Candidate Number " + (index+1) + " is " + candidates[index]);
        }

        System.out.println("Shortened form of the for each loop");

        for(String candidate: candidates) {
            System.out.println("The selected candidate was " + candidate);
        }
    }

    static void CandidateSelection() {
        String [] candidates = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int SelectedCandidates = 0;
        int currentCandidates = 0;
        double baseSalary = 2000.0;
        while(SelectedCandidates < 5 && currentCandidates < candidates.length) {
            String candidate = candidates[currentCandidates];
            double intendedSalary = targetValue();

            System.out.println("The candidate " + candidate + "requested this salary value " + intendedSalary );
            if(baseSalary >= intendedSalary) {
                System.out.println("The candidate " + candidate + "was selected for the position");
                SelectedCandidates++;
            }
            currentCandidates++;
        }
    }

    static double targetValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analyzeCandidate(double intendedSalary) {
        double baseSalary = 1900.0;
        if (baseSalary > intendedSalary) {
            System.out.println("Call the candidate");
        } else if (baseSalary == intendedSalary) {
            System.out.println("Call the candidate with a counter proposal");
        } else {
            System.out.println("Waiting for the results of the other candidates");
        }
    }
}
