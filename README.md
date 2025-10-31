# Online Quiz App 

## Objective

A simple console-based **Quiz Application** built using Core Java.
This project demonstrates the use of OOP concepts, control flow, and logical structures to create an interactive quiz that checks user knowledge and displays results.

---

## Tools

- **Language:** Java
- **IDE:** Visual Studio Code
- **Execution:** Run via the IDE or Command Prompt

---

## Features
- Displays a welcome screen and user instructions.
- Countdown timer before the quiz starts.
- Multiple-choice questions (A/B/C/D format).
- Instant feedback on each answer.
- Score calculation and result display.
- Encouragement messages based on performance.
- Smooth real-time countdown (5→0) appears on the same line before the quiz starts. Only the number updates dynamically while the text “Starting quiz in” remains constant.


---

## How to run
1. Compile the Java files:
```bash 
	javac Main.java Quize.java Question.java
```

2. Run the Java files:
```bash
	java quizeapp.Main
```
3. Application Preview:
```text 
	====================================
		Welcome To Online Quiz App     
	====================================

	Enter your name: Rohan Gusain
	Welcome, Rohan Gusain Let's start the Quiz!

	<--- INSTRUCTIONS: --->
	1. Each questions have 4 options.
	2. Type the correct option excatly shown as (A/B/C/D).
	3. Each correct answer gives you 1 point.
	4. No negative marking.
	Press Enter to start...

	Starting quiz in 5
	Q1. Which of the following statements about the Java Virtual Machine (JVM) is TRUE?
	A. JVM converts Java source code directly to machine code.
	B. JVM executes Java bytecode to make Java platform-independent.
	C. JVM compiles Java code at runtime into source code.
	D. JVM is used only for C and C++ programs.
	Your answer: 
	B
	Correct!
```
