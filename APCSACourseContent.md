The College Board restructured the AP Computer Science A course framework from the older 10-unit format down to **4 streamlined units**.

Because printing out every single sentence of the verbatim "Essential Knowledge" (EK) statements would result in dozens of pages of text, the core EK targets are grouped below by unit, topic, and foundational concept according to the updated Course and Exam Description (CED).

---

## Unit 1: Using Objects and Methods (15%–25% of Exam)

This unit establishes foundational syntax, primitives, and how to interact with pre-existing code using references and objects.

### Primitives & Evaluation

* **Variables:** Declaring and initializing `int`, `double`, and `boolean`.
* **Expressions:** Arithmetic operations (`+`, `-`, `*`, `/`, `%`) and precedence. Understanding integer truncation (e.g., `7 / 3` is `2`).
* **Casting & Limits:** Widening and narrowing types via explicit casting `(int)` or `(double)`. Knowing that `Integer.MAX_VALUE` and `Integer.MIN_VALUE` represent the boundaries of a 32-bit signed int.

### Objects & Method Calls

* **Reference Types:** Objects hold memory addresses (references) rather than raw values.
* **Instantiation:** Using the `new` keyword and constructors to instantiate objects.
* **Method Signatures:** Calling `void` and non-void methods with or without parameters. Differentiating between *parameters* (in the signature) and *arguments* (passed into the call).
* **Standard Library Abstractions:** Working with the `Math` class (specifically `Math.abs`, `Math.pow`, `Math.sqrt`, and `Math.random`) and standard `String` methods (`indexOf`, `substring`, `length`, `equals`, `compareTo`).

---

## Unit 2: Selection and Iteration (25%–35% of Exam)

This unit shifts the code execution path from sequential to dynamic, introducing logic control flow.

### Selection (Conditionals)

* **Boolean Logic:** Evaluating standard relational (`==`, `!=`, `<`, `>`, `<=`, `>=`) and logical (`&&`, `||`, `!`) operators.
* **Control Flow:** Tracing single selection (`if`), binary selection (`if-else`), and multi-way selection (`if-else if`).
* **Short-Circuit Evaluation:** Knowing that Java stops evaluating a compound boolean expression as soon as the outcome is guaranteed (e.g., if the left side of `&&` is false, the right side doesn't run).
* **De Morgan’s Laws:** Simplifying nested or negated logical conditions (e.g., `!(A && B)` is equivalent to `!A || !B`).

### Iteration (Loops)

* **While Loops:** Executing a code block zero or more times based on a continuous loop condition. Identifying infinite loops and off-by-one errors.
* **For Loops:** Utilizing standard initialization, boolean condition, and increment setups for explicit counts.
* **Nested Loops:** Inner loop executions fully completing for every single pass of the outer loop (crucial for pattern printing and grid traversals later).

---

## Unit 3: Class Creation (10%–18% of Exam)

This unit shifts students from being clients of objects to architects, testing object-oriented design and deep program architecture.

### Class Anatomy & Encapsulation

* **State & Behavior:** Instantiating instance variables to represent state and methods to represent behavior.
* **Information Hiding:** Enforcing encapsulation by making instance variables `private` and exposing access via `public` methods.
* **Constructors:** Writing default and overloaded constructors. Recognizing how local parameters can shadow instance variables, requiring the use of the `this` keyword.

### Scope, Context, & Documentation

* **Variable Scope:** Differentiating between local variables, formal parameters, and instance variables.
* **Static Context:** Distinguishing static variables/methods (belonging to the class) from instance variables/methods (belonging to specific object instances).
* **Preconditions & Postconditions:** Reading Java comments as documentation to ensure correct method execution boundaries.

---

## Unit 4: Data Collections (30%–40% of Exam)

The heaviest unit on the exam. It covers multi-variable storage, abstract collection APIs, hierarchy relationships, and algorithmic analysis.

### 1D, 2D, & Dynamic Arrays

* **1D Arrays:** Fixed-size data structures. Creating, indexing, and traversing them using standard `for` loops or enhanced `for-each` loops.
* **ArrayLists:** Part of the `java.util` library. Storing only reference types (utilizing `Integer` and `Double` wrapper classes) and executing dynamic modifications with `.add()`, `.get()`, `.set()`, `.remove()`, and `.size()`.
* **2D Arrays:** Stored natively as arrays of arrays. Traversing data sets in row-major vs. column-major order using nested loops.

### Inheritance & Polymorphism

* **Class Hierarchies:** Creating subclasses that extend superclasses. Using the `super` keyword to invoke parent constructors or overridden parent methods.
* **Polymorphism:** Declaring reference types using a superclass type while instantiating a subclass object (`Superclass obj = new Subclass();`). Understanding compile-time rules vs. run-time dynamic method dispatch.
* **The Object Class:** Knowing that all Java classes implicitly inherit from `java.lang.Object` and overriding default `.toString()` and `.equals()` behaviors.

### Recursion & Classic Algorithms

* **Recursion:** Tracing methods that call themselves, isolating the base case from the recursive step, and identifying stack overflow conditions.
* **Standard Search/Sort:** Reading and evaluating implementations of Linear Search, Binary Search, Selection Sort, Insertion Sort, and Merge Sort.

---

> **The Big Ideas Hook:** Every single Essential Knowledge target listed above rolls up into one of the three core **Big Ideas**: **Modularity** (how we organize code), **Variables** (how we abstract data), or **Control** (how we direct logic execution).

---

### Summary

* Variables
* Expressions
* Casting and Limits
>
* Reference types
* Instantiation
* Method Signatures
* Standard Library Abstraction
---
* Boolean Logic
* Control Flow
* Short Circuit
* De Morgan
>
* While loops
* For Loops
* Nested Loops
---
* Class and State Behavior
* Information Hiding
* Constructors (private, public, this)
>
* Variable Scope
* Static
* Pre/Post Conditions
---
* 1D Arrays (Create, Index, Traverse)
* ArrayList (add, get, set, remove, size, integer, double)
* 2D Arrays
>
* Super/Sub classes
* Polymorphism
* Object Class
>
* Recursion
* Search (Linear, Binary)
* Sort (Selection, Insertion, Merge)

