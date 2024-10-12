### Test Cases of Programming Task 1: "Introduction to Optimization"

---

#### **Test Case 1**

**Optimization problem:**

```
max z = 4.00x₁ + 5.00x₂
```

**Subject to constraints:**

```
2.00x₁ + 4.00x₂ ≤ 560.00  
1.00x₁ + 1.00x₂ ≤ 170.00  
2.00x₁ + 1.00x₂ ≤ 300.00
```

| **Iteration** | **Simplex Tableau** | **Pivot Element** | **Selected Row and Column** |
|---------------|---------------------|-------------------|-----------------------------|
| **1**         | 2.00x₁ + 4.00x₂ + 1.00s₁ + 0.00s₂ + 0.00s₃ = 560.00 <br> 1.00x₁ + 1.00x₂ + 0.00s₁ + 1.00s₂ + 0.00s₃ = 170.00 <br> 2.00x₁ + 1.00x₂ + 0.00s₁ + 0.00s₂ + 1.00s₃ = 300.00 <br> -4.00x₁ + -5.00x₂ + 0.00s₁ + 0.00s₂ + 0.00s₃ = 0.00 | 4.00 | Row 1, Column 2 |
| **2**         | 0.50x₁ + 1.00x₂ + 0.25s₁ + 0.00s₂ + 0.00s₃ = 140.00 <br> 0.50x₁ + 0.00x₂ + -0.25s₁ + 1.00s₂ + 0.00s₃ = 30.00 <br> 1.50x₁ + 0.00x₂ + -0.25s₁ + 0.00s₂ + 1.00s₃ = 160.00 <br> -1.50x₁ + 0.00x₂ + 1.25s₁ + 0.00s₂ + 0.00s₃ = 700.00 | 1.50 | Row 2, Column 1 |
| **3**         | 0.00x₁ + 1.00x₂ + 0.50s₁ + -1.00s₂ + 0.00s₃ = 110.00 <br> 1.00x₁ + 0.00x₂ + -0.50s₁ + 2.00s₂ + 0.00s₃ = 60.00 <br> 0.00x₁ + 0.00x₂ + 0.50s₁ + -3.00s₂ + 1.00s₃ = 70.00 <br> 0.00x₁ + 0.00x₂ + 0.50s₁ + 3.00s₂ + 0.00s₃ = 790.00 | — | — |
| **Solution** | **x₁ = 60.00, x₂ = 110.00** | Objective function value: 790.00 |

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

| **Iteration** | **Simplex Tableau** | **Pivot Element** | **Selected Row and Column** |
|---------------|---------------------|-------------------|-----------------------------|
| **1**         | 1.00x₁ + 1.00x₂ + 1.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ = 12.00 <br> 2.00x₁ + 1.00x₂ + 0.00s₁ + 1.00s₂ + 0.00s₃ + 0.00s₄ = 16.00 <br> -1.00x₁ + 0.00x₂ + 0.00s₁ + 0.00s₂ + 1.00s₃ + 0.00s₄ = 0.00 <br> 0.00x₁ + -1.00x₂ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 1.00s₄ = 0.00 <br> -40.00x₁ + -30.00x₂ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 0.00s₄ = 0.00 | 2.00 | Row 2, Column 1 |
| **2**         | 0.00x₁ + 0.50x₂ + 1.00s₁ + -0.50s₂ + 0.00s₃ + 0.00s₄ = 4.00 <br> 1.00x₁ + 0.50x₂ + 0.00s₁ + 0.50s₂ + 0.00s₃ + 0.00s₄ = 8.00 <br> 0.00x₁ + 0.50x₂ + 0.00s₁ + 0.50s₂ + 1.00s₃ + 0.00s₄ = 8.00 <br> 0.00x₁ + -1.00x₂ + 0.00s₁ + 0.00s₂ + 0.00s₃ + 1.00s₄ = 0.00 <br> 0.00x₁ + -10.00x₂ + 0.00s₁ + 20.00s₂ + 0.00s₃ + 0.00s₄ = 320.00   | 1.00 | Row 1, Column 2 |
| **3**         | 0.00x₁ + 1.00x₂ + 2.00s₁ + -1.00s₂ + 0.00s₃ + 0.00s₄ = 8.00 <br> 1.00x₁ + 0.00x₂ + -1.00s₁ + 1.00s₂ + 0.00s₃ + 0.00s₄ = 4.00 <br> 0.00x₁ + 0.00x₂ + -1.00s₁ + 1.00s₂ + 1.00s₃ + 0.00s₄ = 4.00 <br> 0.00x₁ + 0.00x₂ + 2.00s₁ + -1.00s₂ + 0.00s₃ + 1.00s₄ = 8.00 <br> 0.00x₁ + 0.00x₂ + 20.00s₁ + 10.00s₂ + 0.00s₃ + 0.00s₄ = 400.00 | — | — |
| **Solution**  | **x₁ = 4.00, x₂ = 8.00** |  | Objective function value: 400.00 |

---

#### **Test Case 3**

**Optimization problem:**

```
max z = 3.00x₁ + 5.00x₂ + 4.00x₃
```

**Subject to constraints:**

```
2.00x₁ + 3.00x₂ + 0.00x₃ ≤ 8.00  
0.00x₁ + 2.00x₂ + 5.00x₃ ≤ 10.00  
3.00x₁ + 2.00x₂ + 4.00x₃ ≤ 15.00  
-1.00x₁ + 0.00x₂ + 0.00x₃ ≤ 0.00
0.00x₁ - 1.00x₂ + 0.00x₃ ≤ 0.00
0.00x₁ + 0.00x₂ - 1.00x₃ ≤ 0.00
```

| **Iteration** | **Simplex Tableau** | **Pivot Element** | **Selected Row and Column** |
|---------------|---------------------|-------------------|-----------------------------|
| **1**         | 2,00x1 + 3,00x2 + 0,00x3 + 1,00s1 + 0,00s2 + 0,00s3 + 0,00s4 + 0,00s5 + 0,00s6 = 8,00 0,00x1 + 2,00x2 + 5,00x3 + 0,00s1 + 1,00s2 + 0,00s3 + 0,00s4 + 0,00s5 + 0,00s6 = 10,00 3,00x1 + 2,00x2 + 4,00x3 + 0,00s1 + 0,00s2 + 1,00s3 + 0,00s4 + 0,00s5 + 0,00s6 = 15,00 -1,00x1 + 0,00x2 + 0,00x3 + 0,00s1 + 0,00s2 + 0,00s3 + 1,00s4 + 0,00s5 + 0,00s6 = 0,00 0,00x1 + -1,00x2 + 0,00x3 + 0,00s1 + 0,00s2 + 0,00s3 + 0,00s4 + 1,00s5 + 0,00s6 = 0,00 0,00x1 + 0,00x2 + -1,00x3 + 0,00s1 + 0,00s2 + 0,00s3 + 0,00s4 + 0,00s5 + 1,00s6 = 0,00 -3,00x1 + -5,00x2 + -4,00x3 + 0,00s1 + 0,00s2 + 0,00s3 + 0,00s4 + 0,00s5 + 0,00s6 = 0,00  |  0,00 | Row 1, Column 2 |
| **2**         | 0,67x1 + 1,00x2 + 0,00x3 + 0,33s1 + 0,00s2 + 0,00s3 + 0,00s4 + 0,00s5 + 0,00s6 = 2,67 -1,33x1 + 0,00x2 + 5,00x3 + -0,67s1 + 1,00s2 + 0,00s3 + 0,00s4 + 0,00s5 + 0,00s6 = 4,67 1,67x1 + 0,00x2 + 4,00x3 + -0,67s1 + 0,00s2 + 1,00s3 + 0,00s4 + 0,00s5 + 0,00s6 = 9,67 -1,00x1 + 0,00x2 + 0,00x3 + 0,00s1 + 0,00s2 + 0,00s3 + 1,00s4 + 0,00s5 + 0,00s6 = 0,00 0,67x1 + 0,00x2 + 0,00x3 + 0,33s1 + 0,00s2 + 0,00s3 + 0,00s4 + 1,00s5 + 0,00s6 = 2,67 0,00x1 + 0,00x2 + -1,00x3 + 0,00s1 + 0,00s2 + 0,00s3 + 0,00s4 + 0,00s5 + 1,00s6 = 0,00 0,33x1 + 0,00x2 + -4,00x3 + 1,67s1 + 0,00s2 + 0,00s3 + 0,00s4 + 0,00s5 + 0,00s6 = 13,33    | 13,33 | Row 1, Column 2 |
| **3**         | 0,67x1 + 1,00x2 + 0,00x3 + 0,33s1 + 0,00s2 + 0,00s3 + 0,00s4 + 0,00s5 + 0,00s6 = 2,67 -0,27x1 + 0,00x2 + 1,00x3 + -0,13s1 + 0,20s2 + 0,00s3 + 0,00s4 + 0,00s5 + 0,00s6 = 0,93 2,73x1 + 0,00x2 + 0,00x3 + -0,13s1 + -0,80s2 + 1,00s3 + 0,00s4 + 0,00s5 + 0,00s6 = 5,93 -1,00x1 + 0,00x2 + 0,00x3 + 0,00s1 + 0,00s2 + 0,00s3 + 1,00s4 + 0,00s5 + 0,00s6 = 0,00 0,67x1 + 0,00x2 + 0,00x3 + 0,33s1 + 0,00s2 + 0,00s3 + 0,00s4 + 1,00s5 + 0,00s6 = 2,67 -0,27x1 + 0,00x2 + 0,00x3 + -0,13s1 + 0,20s2 + 0,00s3 + 0,00s4 + 0,00s5 + 1,00s6 = 0,93 -0,73x1 + 0,00x2 + 0,00x3 + 1,13s1 + 0,80s2 + 0,00s3 + 0,00s4 + 0,00s5 + 0,00s6 = 17,07     | 17,07 | Row 3, Column 1 |
| **4**         | 0,00x1 + 1,00x2 + 0,00x3 + 0,37s1 + 0,20s2 + -0,24s3 + 0,00s4 + 0,00s5 + 0,00s6 = 1,22 0,00x1 + 0,00x2 + 1,00x3 + -0,15s1 + 0,12s2 + 0,10s3 + 0,00s4 + 0,00s5 + 0,00s6 = 1,51 1,00x1 + 0,00x2 + 0,00x3 + -0,05s1 + -0,29s2 + 0,37s3 + 0,00s4 + 0,00s5 + 0,00s6 = 2,17 0,00x1 + 0,00x2 + 0,00x3 + -0,05s1 + -0,29s2 + 0,37s3 + 1,00s4 + 0,00s5 + 0,00s6 = 2,17 0,00x1 + 0,00x2 + 0,00x3 + 0,37s1 + 0,20s2 + -0,24s3 + 0,00s4 + 1,00s5 + 0,00s6 = 1,22 0,00x1 + 0,00x2 + 0,00x3 + -0,15s1 + 0,12s2 + 0,10s3 + 0,00s4 + 0,00s5 + 1,00s6 = 1,51 0,00x1 + 0,00x2 + 0,00x3 + 1,10s1 + 0,59s2 + 0,27s3 + 0,00s4 + 0,00s5 + 0,00*s6 = 18,66 | — | — |
| **Solution** | **x₁ = 2,17073, x₂ = 1,21951, x₃ = 1,51220** |  | Objective function value: 18,65854 |

---

#### **Test Case 4**

**Optimization problem:**

```
max z = 3.00x₁ + 2.00x₂
```

**Subject to constraints:**

```
2.00x₁ + 3.00x₂ ≤ 18.00  
2.00x₁ + 3.00x₂ ≤ 42.00  
2.00x₁ + 3.00x₂ ≤ 24.00  
-1.00x₁ + 0.00x₂ ≤ 0.00
0.00x₁ - 1.00x₂ ≤ 0.00
```

| **Iteration** | **Simplex Tableau** | **Pivot Element** | **Selected Row and Column** |
|---------------|---------------------|-------------------|-----------------------------|
| **1**         | 2,00x1 + 1,00x2 + 1,00s1 + 0,00s2 + 0,00s3 + 0,00s4 + 0,00s5 = 18,00 2,00x1 + 3,00x2 + 0,00s1 + 1,00s2 + 0,00s3 + 0,00s4 + 0,00s5 = 42,00 3,00x1 + 1,00x2 + 0,00s1 + 0,00s2 + 1,00s3 + 0,00s4 + 0,00s5 = 24,00 -1,00x1 + 0,00x2 + 0,00s1 + 0,00s2 + 0,00s3 + 1,00s4 + 0,00s5 = 0,00 0,00x1 + -1,00x2 + 0,00s1 + 0,00s2 + 0,00s3 + 0,00s4 + 1,00s5 = 0,00 -3,00x1 + -2,00x2 + 0,00s1 + 0,00s2 + 0,00s3 + 0,00s4 + 0,00s5 = 0,00 | 0,00 | Row 3, Column 1 |
| **2**         | 0,00x1 + 0,33x2 + 1,00s1 + 0,00s2 + -0,67s3 + 0,00s4 + 0,00s5 = 2,00 0,00x1 + 2,33x2 + 0,00s1 + 1,00s2 + -0,67s3 + 0,00s4 + 0,00s5 = 26,00 1,00x1 + 0,33x2 + 0,00s1 + 0,00s2 + 0,33s3 + 0,00s4 + 0,00s5 = 8,00 0,00x1 + 0,33x2 + 0,00s1 + 0,00s2 + 0,33s3 + 1,00s4 + 0,00s5 = 8,00 0,00x1 + -1,00x2 + 0,00s1 + 0,00s2 + 0,00s3 + 0,00s4 + 1,00s5 = 0,00 0,00x1 + -1,00x2 + 0,00s1 + 0,00s2 + 1,00s3 + 0,00s4 + 0,00s5 = 24,00 | 24,00 | Row 1, Column 2 |
| **3**         | 0,00x1 + 1,00x2 + 3,00s1 + 0,00s2 + -2,00s3 + 0,00s4 + 0,00s5 = 6,00 0,00x1 + 0,00x2 + -7,00s1 + 1,00s2 + 4,00s3 + 0,00s4 + 0,00s5 = 12,00 1,00x1 + 0,00x2 + -1,00s1 + 0,00s2 + 1,00s3 + 0,00s4 + 0,00s5 = 6,00 0,00x1 + 0,00x2 + -1,00s1 + 0,00s2 + 1,00s3 + 1,00s4 + 0,00s5 = 6,00 0,00x1 + 0,00x2 + 3,00s1 + 0,00s2 + -2,00s3 + 0,00s4 + 1,00s5 = 6,00 0,00x1 + 0,00x2 + 3,00s1 + 0,00s2 + -1,00s3 + 0,00s4 + 0,00s5 = 30,00 | 30,00 | Row 2, Column 5 |
| **4**         | 0,00x1 + 1,00x2 + -0,50s1 + 0,50s2 + 0,00s3 + 0,00s4 + 0,00s5 = 12,00 0,00x1 + 0,00x2 + -1,75s1 + 0,25s2 + 1,00s3 + 0,00s4 + 0,00s5 = 3,00 1,00x1 + 0,00x2 + 0,75s1 + -0,25s2 + 0,00s3 + 0,00s4 + 0,00s5 = 3,00 0,00x1 + 0,00x2 + 0,75s1 + -0,25s2 + 0,00s3 + 1,00s4 + 0,00s5 = 3,00 0,00x1 + 0,00x2 + -0,50s1 + 0,50s2 + 0,00s3 + 0,00s4 + 1,00s5 = 12,00 0,00x1 + 0,00x2 + 1,25s1 + 0,25s2 + 0,00s3 + 0,00s4 + 0,00s5 = 33,00 | — | — |
| **Solution**  | **x₁ = 3,00000, x₂ = 12,00000** |  | Objective function value: 33,00000 |

---

#### **Test Case 5**

**Optimization problem:**

```
max z = 4.00x₁ + 1.00x₂
```

**Subject to constraints:**

```
1.00x₁ + 1.00x₂ ≤ 50.00  
3.00x₁ + 1.00x₂ ≤ 90.00  
-1.00x₁ + 0.00x₂ ≤ 0.00  
0.00x₁ + -1.00x₂ ≤ 0.00
```

| **Iteration** | **Simplex Tableau** | **Pivot Element** | **Selected Row and Column** |
|---------------|---------------------|-------------------|-----------------------------|
| **1**         | 1,00x1 + 1,00x2 + 1,00s1 + 0,00s2 + 0,00s3 + 0,00s4 = 50,00 3,00x1 + 1,00x2 + 0,00s1 + 1,00s2 + 0,00s3 + 0,00s4 = 90,00 -1,00x1 + 0,00x2 + 0,00s1 + 0,00s2 + 1,00s3 + 0,00s4 = 0,00 0,00x1 + -1,00x2 + 0,00s1 + 0,00s2 + 0,00s3 + 1,00s4 = 0,00 -4,00x1 + -1,00x2 + 0,00s1 + 0,00s2 + 0,00s3 + 0,00s4 = 0,00 | 0.00 | Row 2, Column 1 |
| **2**         | 0,00x1 + 0,67x2 + 1,00s1 + -0,33s2 + 0,00s3 + 0,00s4 = 20,00 1,00x1 + 0,33x2 + 0,00s1 + 0,33s2 + 0,00s3 + 0,00s4 = 30,00 0,00x1 + 0,33x2 + 0,00s1 + 0,33s2 + 1,00s3 + 0,00s4 = 30,00 0,00x1 + -1,00x2 + 0,00s1 + 0,00s2 + 0,00s3 + 1,00s4 = 0,00 0,00x1 + 0,33x2 + 0,00s1 + 1,33s2 + 0,00s3 + 0,00s4 = 120,00 | — | — |
| **Solution** | **x₁ = 30,00000, x₂ = 0,00000** |  | Objective function value: 120,00000 |
