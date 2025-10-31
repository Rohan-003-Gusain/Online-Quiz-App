package quizeapp;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Question> questions; 
    
    public Quiz() {
        questions = new ArrayList<>();
        LoadQuestions();
    }

    private void LoadQuestions() {
        questions.add(new Question(
        "Which of the following statements about the Java Virtual Machine (JVM) is TRUE?",
        new String[]{
            "JVM converts Java source code directly to machine code.",
            "JVM executes Java bytecode to make Java platform-independent.",
            "JVM compiles Java code at runtime into source code.",
            "JVM is used only for C and C++ programs."
        },
        'B'
    ));
        questions.add(new Question(
        "What is the main feature of Java?",
        new String[]{
            "Platform dependent",
            "Write Once, Run Anywhere", 
            "Assembly-based language", 
            "Hardware-specific language"
        },
        'B'
    ));
        questions.add(new Question(
        "Which of the following is the correct extension of Java code files?",
        new String[]{
            ".java",
            ".class",
            ".js",
            ".jar"
        },
        'A'
    ));
        questions.add(new Question(
        "Which part of Java is responsible for converting bytecode into machine code?",
        new String[]{
            "JDK (Java Development Kit)",
            "JRE (Java Runtime Environment)",
            "JVM (Java Virtual Machine)",
            "JIT (Java Interpreter Tool)"
        },
        'C'
    ));
        questions.add(new Question(
        "Which keyword is used to inherit a class in Java?",
        new String[]{
            "super",
            "this",
            "extends",
            "implements"
        },
        'C'));
        
    }

    public List<Question> getQuestions() {
        return questions;
    }
    
}
 