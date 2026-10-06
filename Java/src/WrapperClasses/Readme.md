# 📌 Wrapper Class in Java

## 📖 Overview & Core Concepts

Java is not a pure object-oriented programming language. Even though Java is not a pure object-oriented programming language, software developed in Java can be made pure object-oriented by making use of Wrapper classes instead of primitive data types.

> ⚠️ **Key Rule:**
> For any language to be called a pure object-oriented programming language, everything present in the language must be an object. Because of primitive data types, Java is not pure OOP.

---

## 🔹 Primitive Data Types Representation

When using primitive data types, values are stored directly inside the data type variables.

### Examples & Memory Layout:
- `char a = 'x';`        Memory: `a | x`
- `byte b = 10;`        Memory: `b | 10`
- `short c = 20;`       Memory: `c | 20`
- `int d = 30;`         Memory: `d | 30`
- `long e = 40;`        Memory: `e | 40`
- `float f = 3.147f;`   Memory: `f | 3.147`
- `double g = 33.3384;` Memory: `g | 33.3384`
- `boolean h = true;`   Memory: `h | true`

> 📝 **Note:** Values are stored directly inside the primitive data type variables.

---

## 📦 Wrapper Class Representation

When using Wrapper classes, primitive values are wrapped inside objects created on the heap memory.

### Code Syntax:
```java
Character a = new Character('x');
Byte b      = new Byte((byte) 10);
Short c     = new Short((short) 20);
Integer d   = new Integer(30);
Long e      = new Long(40L);
Float f     = new Float(3.147f);
Double g    = new Double(33.3384);
Boolean h   = new Boolean(true);
