# 📌 Wrapper Class in Java

## 📖 Overview & Core Concepts

Java is not a pure object oriented programming language. Even though java is not a pure object oriented programming language, softwares developed in java can be made pure object oriented by making use of wrapper class instead of primitive data types.

> ⚠️ **Key Rule:**
> Any language has to be called as pure object oriented programming language then everything that is present in the language should be object — because of primitive data types java is not pure oop.

---

## 🔹 Primitive Data Types Representation

When using primitive data types, values are stored directly inside the data type variables.

### Examples & Memory Layout:
* `char a = 'x';` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Memory:** `a | x`
* `byte b = 10;` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Memory:** `b | 10`
* `short c = 20;` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Memory:** `c | 20`
* `int d = 30;` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Memory:** `d | 30`
* `long e = 40;` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Memory:** `e | 40`[cite: 4]
* `float f = 3.147f;` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Memory:** `f | 3.147`[cite: 4]
* `double g = 33.3384;` &nbsp; **Memory:** `g | 133.3384`[cite: 4]
* `boolean h = true;` &nbsp;&nbsp;&nbsp;&nbsp; **Memory:** `h | true`[cite: 4]

> 📝 **Note:** Value store in data type[cite: 4].

---

## 📦 Wrapper Class Representation

When using Wrapper classes, primitive values are wrapped inside objects created on the heap memory.

### Code Syntax:
```java
Character a = new Character('x');
Byte b = new Byte((byte) 10);
Short c = new Short((short) 20);
Integer d = new Integer(30);
Long e = new Long(40);
Float f = new Float(3.147f);
Double g = new Double(33.3384);
Boolean h = new Boolean(true);
