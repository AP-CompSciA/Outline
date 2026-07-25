# AP Computer Science A

## Unit 1 Assessment

### Multiple Choice

**20 Questions**

Choose the best answer.

---

### 1.

Which declaration correctly creates an integer variable named `age` with value `16`?

A.

```java
int age = 16;
```

B.

```java
double age = 16;
```

C.

```java
age = 16;
```

D.

```java
integer age = 16;
```

**Answer:** A

---

### 2.

Which data type should be used to store the value `3.14159`?

A. int

B. double

C. decimal

D. float

**Answer:** B

---

### 3.

What value is stored in `x`?

```java
int x = 8 + 4;
```

A. 4

B. 8

C. 12

D. 32

**Answer:** C

---

### 4.

What is the value of `x`?

```java
int x = 17 / 5;
```

A. 3

B. 3.4

C. 4

D. 2

**Answer:** A

---

### 5.

What is the value of `y`?

```java
double y = 17 / 5;
```

A. 3

B. 3.4

C. 3.0

D. 17.5

**Answer:** C

---

### 6.

What is the value of `z`?

```java
double z = 17.0 / 5;
```

A. 3

B. 3.4

C. 3.0

D. 4

**Answer:** B

---

### 7.

Which operator calculates the remainder after division?

A. /

B. %

C. *

D. ^

**Answer:** B

---

### 8.

What is the value of `x`?

```java
int x = 14 % 5;
```

A. 2

B. 4

C. 5

D. 9

**Answer:** B

---

### 9.

What is the value of `a`?

```java
int a = 3 + 2 * 4;
```

A. 20

B. 11

C. 14

D. 24

**Answer:** B

---

### 10.

What is the value of `b`?

```java
int b = (3 + 2) * 4;
```

A. 20

B. 11

C. 14

D. 24

**Answer:** A

---

### 11.

Which line correctly calls the square root method?

A.

```java
Math.sqrt(25);
```

B.

```java
sqrt(25);
```

C.

```java
math.sqrt(25);
```

D.

```java
Math.squareRoot(25);
```

**Answer:** A

---

### 12.

What value does `Math.sqrt(81)` return?

A. 9

B. 8

C. 40.5

D. 81

**Answer:** A

---

### 13.

Which method returns the larger of two numbers?

A.

```java
Math.big()
```

B.

```java
Math.max()
```

C.

```java
Math.high()
```

D.

```java
Math.large()
```

**Answer:** B

---

### 14.

Which expression returns the absolute value of `-8`?

A.

```java
Math.abs(-8)
```

B.

```java
Math.absolute(-8)
```

C.

```java
Math.absValue(-8)
```

D.

```java
Math.max(-8)
```

**Answer:** A

---

### 15.

What is the value of `x`?

```java
double x = Math.pow(2,3);
```

A. 5

B. 6

C. 8

D. 9

**Answer:** C

---

### 16.

Which comment is written correctly?

A.

```java
// This is a comment
```

B.

```java
## This is a comment
```

C.

```java
<!-- comment -->
```

D.

```java
** comment **
```

**Answer:** A

---

### 17.

Which statement best describes a variable?

A. A mathematical formula

B. A named location in memory that stores data

C. A type of method

D. A computer program

**Answer:** B

---

### 18.

Which statement best describes a method?

A. A place to store data

B. A type of variable

C. A reusable set of instructions that performs a task

D. A computer chip

**Answer:** C

---

### 19.

A method receives information through its

A. comments

B. parameters

C. operators

D. variables

**Answer:** B

---

### 20.

Which best describes a software library?

A. A place to save files

B. A collection of useful methods

C. A memory chip

D. A programming language

**Answer:** B

---

# Free Response

---

## Question 1 (8 points)

A student's science grade is calculated by averaging four quiz scores.

Write Java statements that

* declare four `double` variables named `quiz1`, `quiz2`, `quiz3`, and `quiz4`
* assign them values of your choice
* calculate the average
* store the result in a variable named `average`

Do **not** print anything.

---

### Sample Solution

```java
double quiz1 = 88.5;
double quiz2 = 94.0;
double quiz3 = 81.5;
double quiz4 = 90.0;

double average = (quiz1 + quiz2 + quiz3 + quiz4) / 4;
```

---

## Question 2 (10 points)

A rectangular garden has

* length = 12.5 meters
* width = 8.0 meters

Write Java statements that

* store these values
* calculate the area
* calculate the perimeter
* calculate the diagonal using `Math.sqrt()`

Store each answer in an appropriately named variable.

---

### Sample Solution

```java
double length = 12.5;
double width = 8.0;

double area = length * width;
double perimeter = 2 * (length + width);
double diagonal = Math.sqrt(length * length + width * width);
```

---

## Question 3 (12 points)

A student has an amount of money saved.

Create variables to store

* the starting amount
* the amount earned from a summer job
* the cost of a new laptop

Then calculate

* the total money after earning
* the money remaining after buying the laptop

Finally, use the `Math` library to calculate

* the absolute value of the remaining balance

Store every result in appropriately named variables.

---

### Sample Solution

```java
double savings = 850.00;
double earnings = 450.00;
double laptopCost = 975.00;

double totalMoney = savings + earnings;
double remaining = totalMoney - laptopCost;

double distanceFromZero = Math.abs(remaining);
```

---

# Suggested Point Breakdown

### Multiple Choice (20 points)

* 1 point each

### FRQ 1 (8 points)

* Correct declarations (4)
* Correct average formula (2)
* Correct variable name (2)

### FRQ 2 (10 points)

* Variables (2)
* Area (2)
* Perimeter (2)
* Diagonal formula (4)

### FRQ 3 (12 points)

* Variable declarations (3)
* Total calculation (2)
* Remaining calculation (2)
* `Math.abs()` used correctly (3)
* Meaningful variable names (2)

This assessment stays within the first AP CSA unit while exposing students to the style of AP questions without requiring concepts they haven't learned yet, such as `if` statements, loops, arrays, objects, or writing their own methods.
