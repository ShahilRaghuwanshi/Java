# 📌 Wrapper Class in Java

## 📖 Overview & Core Concepts

Java is not a pure object-oriented programming language[cite: 5]. Even though Java is not a pure object-oriented programming language, software developed in Java can be made pure object-oriented by making use of Wrapper classes instead of primitive data types[cite: 5].

> ⚠️ **Key Concept:**  
> (If any language has to be called as a pure object-oriented programming language, then everything present in the language should be an object — because of primitive data types, Java is not pure OOP)[cite: 5].

---

## 🔹 1. Primitive Data Types Representation

When using primitive data types, values are stored directly inside the primitive data type variables[cite: 5].

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

*(Value stored in primitive data types)*[cite: 5]

---

## 📦 2. Wrapper Class Representation

When using Wrapper classes, primitive values are wrapped inside Objects created on the Heap Memory[cite: 6]. The reference variable points to the created Object[cite: 6].

### Code Example:
`Character a = new Character('x');`[cite: 6]  
`Byte b = new Byte((byte) 10);`[cite: 6]  
`Short c = new Short((short) 20);`[cite: 6]  
`Integer d = new Integer(30);`[cite: 6]  
`Long e = new Long(40L);`[cite: 6]  
`Float f = new Float(3.147f);`[cite: 6]  
`Double g = new Double(33.3384);`[cite: 6]  
`Boolean h = new Boolean(true);`[cite: 6]  

### ☁️ Memory Layout (Object References):
a --------> ( 'x' )[cite: 6]  
b --------> ( 10 )[cite: 6]  
c --------> ( 20 )[cite: 6]  
d --------> ( 30 )[cite: 6]  
e --------> ( 40 )[cite: 6]  
f --------> ( 3.147 )[cite: 6]  
g --------> ( 33.3384 )[cite: 6]  
h --------> ( true )[cite: 6]  

*(Value stored in Object, not in data types)*[cite: 6]

---

## 📊 Summary Mapping Table

| Variable | Primitive Declaration | Wrapper Class Declaration | Primitive Storage | Object Storage Concept |
| :--- | :--- | :--- | :--- | :--- |
| **a** | `char a = 'x';`[cite: 5] | `Character a = new Character('x');`[cite: 6] | Value directly in `a`[cite: 5] | Points to Heap Object `('x')`[cite: 6] |
| **b** | `byte b = 10;`[cite: 5] | `Byte b = new Byte(10);`[cite: 6] | Value directly in `b`[cite: 5] | Points to Heap Object `(10)`[cite: 6] |
| **c** | `short c = 20;`[cite: 5] | `Short c = new Short(20);`[cite: 6] | Value directly in `c`[cite: 5] | Points to Heap Object `(20)`[cite: 6] |
| **d** | `int d = 30;`[cite: 5] | `Integer d = new Integer(30);`[cite: 6] | Value directly in `d`[cite: 5] | Points to Heap Object `(30)`[cite: 6] |
| **e** | `long e = 40;`[cite: 5] | `Long e = new Long(40);`[cite: 6] | Value directly in `e`[cite: 5] | Points to Heap Object `(40)`[cite: 6] |
| **f** | `float f = 3.147f;`[cite: 5] | `Float f = new Float(3.147f);`[cite: 6] | Value directly in `f`[cite: 5] | Points to Heap Object `(3.147)`[cite: 6] |
| **g** | `double g = 33.3
