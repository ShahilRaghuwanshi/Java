# 📌 Wrapper Class in Java

## 📖 Overview & Core Concepts

Java is not a pure object-oriented programming language. Even though Java is not a pure object-oriented programming language, software developed in Java can be made pure object-oriented by making use of Wrapper classes instead of primitive data types.

> ⚠️️ **Key Concept:**  
> (If any language has to be called as a pure object-oriented programming language, then everything present in the language should be an object — because of primitive data types, Java is not pure OOP).

---

## 🔹 1. Primitive Data Types Representation

When using primitive data types, values are stored directly inside the primitive data type variables.

### Code Example:
```java
char a = 'x';
byte b = 10;
short c = 20;
int d = 30;
long e = 40;
float f = 3.147f;
double g = 33.3384;
boolean h = true;
+---+-----------+
| a |    'x'    |
+---+-----------+
| b |    10     |
+---+-----------+
| c |    20     |
+---+-----------+
| d |    30     |
+---+-----------+
| e |    40     |
+---+-----------+
| f |   3.147   |
+---+-----------+
| g |  33.3384  |
+---+-----------+
| h |   true    |
+---+-----------+

Character a = new Character('x');
Byte b = new Byte((byte) 10);
Short c = new Short((short) 20);
Integer d = new Integer(30);
Long e = new Long(40L);
Float f = new Float(3.147f);
Double g = new Double(33.3384);
Boolean h = new Boolean(true);

a --------> ( 'x' )
b --------> ( 10 )
c --------> ( 20 )
d --------> ( 30 )
e --------> ( 40 )
f --------> ( 3.147 )
g --------> ( 33.3384 )
h --------> ( true )
