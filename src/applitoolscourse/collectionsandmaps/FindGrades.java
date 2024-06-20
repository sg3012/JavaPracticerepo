package src.applitoolscourse.collectionsandmaps;

import java.util.Map;

public class FindGrades {

    public static void main(String args[]) {
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpGrades = TestResults.getMakeUpGrades();

        for (var grade : makeUpGrades.entrySet()) {
            Integer firstGrade = originalGrades.get(grade.getKey());
            Integer secondGrade = makeUpGrades.get(grade.getKey());

            if (secondGrade > firstGrade) {
                originalGrades.put(grade.getKey(), secondGrade);
            }
        }

        System.out.println("Final Grades: " + originalGrades);
    }

}
