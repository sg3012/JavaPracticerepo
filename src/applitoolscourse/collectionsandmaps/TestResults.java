package src.applitoolscourse.collectionsandmaps;
import java.util.HashMap;
import java.util.Map;

public class TestResults {

    public static Map getOriginalGrades(){
        Map grades = new HashMap();
        grades.put("Shubham",66);
        grades.put("Ajay",87);
        grades.put("Sampreet",90);
        grades.put("Lisa",93);
        grades.put("Karan",76);
        grades.put("Rahul",78);
        grades.put("Karen",97);
        grades.put("Matthew",67);
        grades.put("Raman",89);
        grades.put("Kunal",50);
        grades.put("Rishabh",95);

        return grades;
    }

    public static Map getMakeUpGrades(){
        Map grades = new HashMap();
        grades.put("Shubham",98);
        grades.put("Ajay",90);
        grades.put("Sampreet",76);
        grades.put("Lisa",95);
        grades.put("Karan",89);
        grades.put("Rahul",70);
        grades.put("Karen",89);
        grades.put("Matthew",93);
        grades.put("Raman",94);
        grades.put("Kunal",96);
        grades.put("Rishabh",87);

        return grades;
    }
    
}
