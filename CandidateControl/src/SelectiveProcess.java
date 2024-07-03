public class SelectiveProcess {
    public static void main(String[] args) {
        analyzeCandidate(1900.0);
        analyzeCandidate(2200.0);
        analyzeCandidate(2000.0);
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
