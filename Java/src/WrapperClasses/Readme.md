# 📌 Wrapper Class in Java

## 📖 Overview & Core Concepts

Java is not a pure object-oriented programming language. Even though Java is not a pure object-oriented programming language, software developed in Java can be made pure object-oriented by making use of Wrapper classes instead of primitive data types.

> ⚠️ **Key Concept:**  
> (If any language has to be called as a pure object-oriented programming language, then everything present in the language should be an object — because of primitive data types, Java is not pure OOP).

---

## 🔹 1. Primitive Data Types Representation

When using primitive data types, values are stored directly inside the primitive data type variables.

### Code Example:
`char a = 'x';`  
`byte b = 10;`  
`short c = 20;`  
`int d = 30;`  
`long e = 40;`  
`float f = 3.147f;`  
`double g = 33.3384;`  
`boolean h = true;`  

### 🔲 Memory Layout (Primitive Storage):
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

*(Value stored in primitive data types)*

---

## 📦 2. Wrapper Class Representation

When using Wrapper classes, primitive values are wrapped inside Objects created on the Heap Memory. The reference variable points to the created Object.

### Code Example:
`Character a = new Character('x');`  
`Byte b = new Byte((byte) 10);`
`Short c = new Short((short) 20);`
`Integer d = new Integer(30);`
`Long e = new Long(40L);`
`Float f = new Float(3.147f);` 
`Double g = new Double(33.3384);`
`Boolean h = new Boolean(true);`

### ☁️ Memory Layout (Object References):
a --------> ( 'x' ) 
b --------> ( 10 )
c --------> ( 20 ) 
d --------> ( 30 )
e --------> ( 40 )
f --------> ( 3.147 )
g --------> ( 33.3384 )
h --------> ( true ) 

*(Value stored in Object, not in data types)*

---

## 📊 Summary Mapping Table

| Variable | Primitive Declaration | Wrapper Class Declaration | Primitive Storage | Object Storage Concept |
| :--- | :--- | :--- | :--- | :--- |
| **a** | `char a = 'x';` | `Character a = new Character('x');` | Value directly in `a` | Points to Heap Object `('x')` |
| **b** | `byte b = 10;` | `Byte b = new Byte(10);` | Value directly in `b` | Points to Heap Object `(10)` |
| **c** | `short c = 20;` | `Short c = new Short(20);` | Value directly in `c` | Points to Heap Object `(20)` |
| **d** | `int d = 30;` | `Integer d = new Integer(30);` | Value directly in `d` | Points to Heap Object `(30)` |
| **e** | `long e = 40;` | `Long e = new Long(40);` | Value directly in `e` | Points to Heap Object `(40)` |
| **f** | `float f = 3.147f;` | `Float f = new Float(3.147f);` | Value directly in `f` | Points to Heap Object `(3.147)` |
| **g** | `double g = 33.3
