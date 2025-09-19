public class Grade {

    // Return letter grade for a numeric score (0-100)
    public static String getLetterGrade(double score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    // Return GPA-like point for a numeric score (4.0 scale)
    public static double getGradePoint(double score) {
        if (score >= 90) return 4.0;
        if (score >= 85) return 3.7;
        if (score >= 80) return 3.3;
        if (score >= 75) return 3.0;
        if (score >= 70) return 2.7;
        if (score >= 65) return 2.3;
        if (score >= 60) return 2.0;
        return 0.0;
    }

    // Compute average from an array of scores
    public static double average(double[] scores) {
        if (scores == null || scores.length == 0) return 0.0;
        double sum = 0.0;
        for (double s : scores) sum += s;
        return sum / scores.length;
    }

    // Get letter grade for an array of scores (based on average)
    public static String getLetterGradeForScores(double[] scores) {
        double avg = average(scores);
        return getLetterGrade(avg);
    }

    // Simple demonstration main (run with: javac Grade.java && java Grade)
    public static void main(String[] args) {
        double[] s1 = {92, 85, 78};
        System.out.println("Average: " + average(s1));
        System.out.println("Letter grade: " + getLetterGradeForScores(s1));
        System.out.println("Grade point: " + getGradePoint(average(s1)));
    }
}
