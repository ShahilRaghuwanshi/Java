# Java Scientific Notation Guide

This project demonstrates how floating-point numbers can be represented using ***Scientific Notation (Exponent Representation)*** in Java.

---

## 📖 Theory & Fundamentals

In Java, floating-point literals can be represented in scientific notation using ***`e`*** or ***`E`***, which represents powers of $10$ ($\times 10^N$).

### Formula & Syntax

$$\text{Value} = \text{Mantissa} \times 10^{\text{Exponent}}$$

- ***`e+N` / `E+N`*** : Multiplies the base number by $10^N$ (Shifts decimal $N$ places ***right***).
- ***`e-N` / `E-N`*** : Divides the base number by $10^N$ (Shifts decimal $N$ places ***left***).

---

## ⚙️ Equivalent Values Table

| Notation Type | Code Example | Math Equivalent | Output |
| :--- | :--- | :--- | :--- |
| ***Standard Decimal*** | `3147.456f` | $3147.456$ | `3147.456` |
| ***Scientific (lowercase)*** | `3.147456e+3f` | $3.147456 \times 10^3$ | `3147.456` |
| ***Scientific (uppercase)*** | `3.147456E+3f` | $3.147456 \times 10^3$ | `3147.456` |
| ***Negative Exponent*** | `3147456e-3f` | $3147456 \times 10^{-3}$ | `3147.456` |

---

## 📌 Important Notes

1. ***Default Type:*** Scientific literals without any suffix default to `double`. You must add an `f` or `F` suffix to specify a `float`.
2. ***Case Sensitivity:*** `e` and `E` are functionally identical in Java.
