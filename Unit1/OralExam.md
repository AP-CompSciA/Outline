# Easy Questions

These should be answerable by almost every student.

### 1. Variables

What is a variable? Why do programmers use variables?

---

### 2. Data Types

What is the difference between an `int` and a `double`?

---

### 3. Storing Data

What happens inside the computer when you write

```java
int age = 16;
```

---

### 4. Comments

What is a comment? Does the computer execute comments?

---

### 5. Arithmetic Operators

Name the five arithmetic operators in Java and explain what each one does.

---

### 6. Integer Division

Without using a computer, what is the result of

```java
17 / 5
```

Explain why.

---

### 7. Remainder

What does the `%` operator do?

Give an example.

---

### 8. Libraries

What is a software library?

Why would programmers use one instead of writing everything themselves?

---

# Medium Questions

These require students to explain code rather than just definitions.

---

### 1. Predict the Variables

```java
int a = 8;
int b = 3;

int c = a + b;
```

What value is stored in each variable?

---

### 2. Order of Operations

What is the value of

```java
3 + 4 * 2
```

How about

```java
(3 + 4) * 2
```

Explain why they are different.

---

### 3. Integer vs Double

Explain why these produce different answers.

```java
17 / 5
```

```java
17.0 / 5
```

---

### 4. Math Library

Name three methods from the `Math` library we've used.

Describe what each one does.

---

### 5. Parameters

Suppose we call

```java
Math.max(8, 12)
```

What are the arguments?

What value is returned?

---

### 6. Factory Analogy

Explain how a method is like a factory.

Be sure to include

* input
* work
* output

---

### 7. Spot the Error

What's wrong with this code?

```java
double x = Math.sqrt(16);
int y = Math.pow(2,3);
```

*(Looking for recognition that `Math.pow` returns a double.)*

---

### 8. Memory

Suppose we write

```java
int score = 80;
score = 95;
```

How many variables exist afterward?

What happened to the old value?

---

# Hard Questions

These are closer to AP reasoning questions.

---

### 1. Trace the Code

Without writing anything down, tell me the final values.

```java
int x = 6;
int y = x + 4;
x = x * 2;
double z = y / 4.0;
```

---

### 2. Explain Every Step

Walk me through what happens when Java executes

```java
double result =
Math.sqrt(Math.pow(3,2) + Math.pow(4,2));
```

Don't just give the answer—describe every method call.

---

### 3. Design a Solution

Suppose I want to calculate the average of four quiz grades.

What variables would I need?

What expression would calculate the average?

---

### 4. Choose the Data Type

For each situation, choose either `int` or `double` and explain why.

* Student age
* Temperature
* Number of students
* Bank account balance
* Height

---

### 5. Explain This Code

```java
double x = Math.abs(-5);
double y = Math.max(x, 8);
```

Explain exactly what happens from left to right.

---

### 6. Build an Expression

Write an expression (no calculator) that finds the distance between two numbers using the `Math` library.

*(Expected answer: `Math.abs(a - b)` or equivalent.)*

---

### 7. Why Libraries?

Suppose Java didn't include a `Math.sqrt()` method.

What would programmers have to do instead?

Why is having libraries useful?

---

### 8. Compare Variables and Methods

Explain the difference between a variable and a method.

How are they related?

---

# Challenge Questions (Optional Bonus)

These are excellent differentiators for top students.

### Why does Java have both `int` and `double` instead of just one number type?

---

### Explain why

```java
double x = 5;
```

works, but

```java
int x = 5.6;
```

does not.

---

### Imagine you're explaining variables to someone who has never programmed before.

Use an analogy that is **not** "a box."

---

## Suggested Rubric (2 points per question)

**Green - 2 points**

* Correct answer with clear reasoning and proper vocabulary.

**Yellow - 1 point**

* Mostly correct but incomplete, imprecise, or missing explanation.

**Red - 0 points**

* Incorrect or unable to explain.
