public class Student {
    
    private String name;
    private int grade;

    // בנאי משודרג
    // שים לב: הפרמטרים קיבלו את אותו שם כמו השדות (name, grade)
    public Student(String name, int grade) {
        // המילה this אומרת: "תתייחס לשדה של האובייקט הזה"
        // צד שמאל (this.name) = השדה של האובייקט
        // צד ימין (name) = הפרמטר שקיבלנו בסוגריים
        this.name = name;
        this.grade = grade;
    }

    public void study() {
        System.out.println(name + " is studying...");
        grade = grade + 5;
        if (grade > 100) {
            grade = 100;
        }
    }

    public int getGrade() {
        return grade;
    }

    // --- השדרוג הגדול: toString ---
    // זו שיטה מיוחדת של ג'אווה. 
    // בכל פעם שמנסים להדפיס את האובייקט, המחשב יחפש את השיטה הזו אוטומטית.
    public String toString() {
        return "Student Name: " + this.name + " | Final Grade: " + this.grade;
    }
}