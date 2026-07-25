# AP Computer Science A

## Unit 1 Assessment

# Free Response

---

## Question 1 (8 points)

A student's science grade is calculated by averaging four quiz scores.

Write Java statements that

* declare four `double` variables named `quiz1`, `quiz2`, `quiz3`, and `quiz4`
* assign them values of your choice
* calculate the average
* store the result in a variable named `average`

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
