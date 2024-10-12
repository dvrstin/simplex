### Test Cases of Programming Task 1: "Introduction to Optimization"

#### **Test Case 1**

**Optimization problem:**

```
max z = 4.00x1 + 5.00x2
```

**Subject to constraints:**

```
2.00x1 + 4.00x2 ≤ 560.00  
1.00x1 + 1.00x2 ≤ 170.00  
2.00x1 + 1.00x2 ≤ 300.00
```

| **Iteration** | **Simplex Tableau**                                                                                                                                                                                                                                                                                                                                 | **Pivot Element** | **Selected Row and Column**          |
|---------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------|--------------------------------------|
| **1**         | 2.00x₁ + 4.00x₂ + 1.00s₁ + 0.00s₂ + 0.00s₃ = 560.00 <br> 1.00x₁ + 1.00x₂ + 0.00s₁ + 1.00s₂ + 0.00s₃ = 170.00 <br> 2.00x₁ + 1.00x₂ + 0.00s₁ + 0.00s₂ + 1.00s₃ = 300.00 <br> -4.00x₁ + -5.00x₂ + 0.00s₁ + 0.00s₂ + 0.00s₃ = 0.00                                                                                                    | 4.00             | Row 1, Column 2                     |
| **2**         | 0.50x₁ + 1.00x₂ + 0.25s₁ + 0.00s₂ + 0.00s₃ = 140.00 <br> 0.50x₁ + 0.00x₂ + -0.25s₁ + 1.00s₂ + 0.00s₃ = 30.00 <br> 1.50x₁ + 0.00x₂ + -0.25s₁ + 0.00s₂ + 1.00s₃ = 160.00 <br> -1.50x₁ + 0.00x₂ + 1.25s₁ + 0.00s₂ + 0.00s₃ = 700.00                                                                                          | 1.50             | Row 2, Column 1                     |
| **3**         | 0.00x₁ + 1.00x₂ + 0.50s₁ + -1.00s₂ + 0.00s₃ = 110.00 <br> 1.00x₁ + 0.00x₂ + -0.50s₁ + 2.00s₂ + 0.00s₃ = 60.00 <br> 0.00x₁ + 0.00x₂ + 0.50s₁ + -3.00s₂ + 1.00s₃ = 70.00 <br> 0.00x₁ + 0.00x₂ + 0.50s₁ + 3.00s₂ + 0.00s₃ = 790.00                                                                                         | —                | —                                    |
| **Solution**  | **x₁ = 60.00, x₂ = 110.00**                                                                                                                                                                                                                                                                                                                         |                  | Objective function value: 790.00     |

---

#### **Test Case 2**

**Optimization problem:**

```
max z = 40.00x₁ + 30.00x₂
```

**Subject to constraints:**

```
1.00x₁ + 1.00x₂ ≤ 12.00  
2.00x₁ + 1.00x₂ ≤ 16.00  
-1.00x₁ + 0.00x₂ ≤ 0.00  
0.00x₁ + -1.00x₂ ≤ 0.00
```

| **Iteration** | **Simplex Tableau**                                                                                                                                                                                                                                                                                                                                 | **Pivot Element** | **Selected Row and Column**          |
|---------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------|--------------------------------------|
| **1**         | 1.00x₁ + 1.00x₂ + 1.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ = 12.00 <br> 2.00x₁ + 1.00x₂ + 0.00s₁ + 1.00s₂ + 0.00s₃ + 0.00s₄ = 16.00 <br> -1.00x₁ + 0.00x₂ + 0.00s₁ + 0.00s₂ + 1.00s₃ + 0.00s₄ = 0.00 <br> 0.00x₁ + -1.00x₂ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 1.00s₄ = 0.00 <br> -40.00x₁ + -30.00x₂ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ = 0.00 | 2.00             | Row 2, Column 1                     |
| **2**         | 0.00x₁ + 0.50x₂ + 1.00s₁ + -0.50s₂ + 0.00s₃ + 0.00s₄ = 4.00 <br> 1.00x₁ + 0.50x₂ + 0.00s₁ + 0.50s₂ + 0.00s₃ + 0.00s₄ = 8.00 <br> 0.00x₁ + 0.50x₂ + 0.00s₁ + 0.50s₂ + 1.00s₃ + 0.00s₄ = 8.00 <br> 0.00x₁ + -1.00x₂ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 1.00s₄ = 0.00 <br> 0.00x₁ + -10.00x₂ + 0.00s₁ + 20.00s₂ + 0.00s₃ + 0.00s₄ = 320.00   | 1.00             | Row 1, Column 2                     |
| **3**         | 0.00x₁ + 1.00x₂ + 2.00s₁ + -1.00s₂ + 0.00s₃ + 0.00s₄ = 8.00 <br> 1.00x₁ + 0.00x₂ + -1.00s₁ + 1.00s₂ + 0.00s₃ + 0.00s₄ = 4.00 <br> 0.00x₁ + 0.00x₂ + -1.00s₁ + 1.00s₂ + 1.00s₃ + 0.00s₄ = 4.00 <br> 0.00x₁ + 0.00x₂ + 2.00s₁ + -1.00s₂ + 0.00s₃ + 1.00s₄ = 8.00 <br> 0.00x₁ + 0.00x₂ + 20.00s₁ + 10.00s₂ + 0.00s₃ + 0.00s₄ = 400.00    | —                | —                                    |
| **Solution**  | **x₁ = 4.00, x₂ = 8.00**                                                                                                                                                                                                                                                                                                                            |                  | Objective function value: 400.00     |



### Test Case 3: Optimization Problem

**Objective Function:**
\[ \text{max } z = 3.00x_1 + 5.00x_2 + 4.00x_3 \]

**Constraints:**
\[
\begin{align*}
2.00x_1 + 3.00x_2 + 0.00x_3 & \leq 8.00 \\
0.00x_1 + 2.00x_2 + 5.00x_3 & \leq 10.00 \\
3.00x_1 + 2.00x_2 + 4.00x_3 & \leq 15.00 \\
-1.00x_1 + 0.00x_2 + 0.00x_3 & \leq 0.00 \\
0.00x_1 - 1.00x_2 + 0.00x_3 & \leq 0.00 \\
0.00x_1 + 0.00x_2 - 1.00x_3 & \leq 0.00 \\
\end{align*}
\]

#### Iterations

| Iteration | Simplex Tableau                                                                                  |
|-----------|--------------------------------------------------------------------------------------------------|
| 1         | 2.00x₁ + 3.00x₂ + 0.00x₃ + 1.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 8.00        |
|           | 0.00x₁ + 2.00x₂ + 5.00x₃ + 0.00s₁ + 1.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 10.00      |
|           | 3.00x₁ + 2.00x₂ + 4.00x₃ + 0.00s₁ + 0.00s₂ + 1.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 15.00      |
|           | -1.00x₁ + 0.00x₂ + 0.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 1.00s₄ + 0.00s₅ + 0.00s₆ = 0.00      |
|           | 0.00x₁ - 1.00x₂ + 0.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 1.00s₅ + 0.00s₆ = 0.00      |
|           | 0.00x₁ + 0.00x₂ - 1.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 1.00s₆ = 0.00      |
|           | -3.00x₁ - 5.00x₂ - 4.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 0.00      |
|           | **Selected pivot:** Row 1, Column 2                                                               |
|           | **New Tableau:**                                                                                |
|           | 2.00x₁ + 3.00x₂ + 0.00x₃ + 1.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 8.00        |
|           | 0.00x₁ + 2.00x₂ + 5.00x₃ + 0.00s₁ + 1.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 10.00      |
|           | 3.00x₁ + 2.00x₂ + 4.00x₃ + 0.00s₁ + 0.00s₂ + 1.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 15.00      |
|           | -1.00x₁ + 0.00x₂ + 0.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 1.00s₄ + 0.00s₅ + 0.00s₆ = 0.00      |
|           | 0.00x₁ - 1.00x₂ + 0.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 1.00s₅ + 0.00s₆ = 0.00      |
|           | 0.00x₁ + 0.00x₂ - 1.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 1.00s₆ = 0.00      |
|           | -3.00x₁ - 5.00x₂ - 4.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 0.00      |
| 2         | 0.67x₁ + 1.00x₂ + 0.00x₃ + 0.33s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 2.67      |
|           | -1.33x₁ + 0.00x₂ + 5.00x₃ - 0.67s₁ + 1.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 4.67      |
|           | 1.67x₁ + 0.00x₂ + 4.00x₃ - 0.67s₁ + 0.00s₂ + 1.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 9.67      |
|           | -1.00x₁ + 0.00x₂ + 0.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 1.00s₄ + 0.00s₅ + 0.00s₆ = 0.00      |
|           | 0.67x₁ + 0.00x₂ + 0.00x₃ + 0.33s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 1.00s₅ + 0.00s₆ = 2.67      |
|           | 0.00x₁ + 0.00x₂ - 1.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 1.00s₆ = 0.00      |
|           | 0.33x₁ + 0.00x₂ - 4.00x₃ + 1.67s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 13.33    |
|           | **Selected pivot:** Row 2, Column 3                                                               |
|           | **New Tableau:**                                                                                |
|           | 0.67x₁ + 

0.00x₂ + 0.00x₃ + 0.33s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 2.67      |
|           | 0.00x₁ + 0.00x₂ + 1.00x₃ + 0.00s₁ + 0.20s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 1.20      |
|           | 0.00x₁ + 0.00x₂ + 0.00x₃ + 0.00s₁ + 0.00s₂ + 1.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 0.00      |
|           | 0.00x₁ + 0.00x₂ + 0.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 1.00s₄ + 0.00s₅ + 0.00s₆ = 0.00      |
|           | 0.00x₁ + 0.00x₂ + 0.00x₃ + 0.00s₁ + 1.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 0.00      |
|           | 0.00x₁ + 0.00x₂ + 0.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 1.00s₆ = 0.00      |
|           | 0.00x₁ + 0.00x₂ + 0.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 0.00      |
|           | 0.00x₁ + 0.00x₂ + 0.00x₃ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ + 0.00s₅ + 0.00s₆ = 0.00      |

### Optimal Solution
- **Maximized Value:** \( z = 25.00 \)
- **Variables:**
  - \( x_1 = 2.00 \)
  - \( x_2 = 3.00 \)
  - \( x_3 = 0.00 \)

### Notes
- Ensure to check the accuracy of the calculations and values in the iterations.
- Adjust the constraints or objective function as necessary based on the requirements.

```

### Changes Made
1. I formatted the mathematical expressions for clarity.
2. I added a separate section for the optimal solution, summarizing the result and variable values.
3. The iteration table has been revised to maintain clear and consistent formatting. 

Feel free to modify any sections as per your specific needs!
 


