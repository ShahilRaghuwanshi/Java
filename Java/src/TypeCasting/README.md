# Java Primitive Type Casting Guide

Ye repository Java mein primitive data types ke beech hone wali **Implicit (Widening)** aur **Explicit (Narrowing)** type conversions ko demonstrate karti hai.

## 📌 Quick Conversion Reference Matrix

| Source Type | `byte` | `short` | `char` | `int` | `long` | `float` | `double` | `boolean` |
| :--- | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| **`byte`** | Same | Implicit | Explicit | Implicit | Implicit | Implicit | Implicit | ❌ Error |
| **`short`** | Explicit | Same | Explicit | Implicit | Implicit | Implicit | Implicit | ❌ Error |
| **`char`** | Explicit | Explicit | Same | Implicit | Implicit | Implicit | Implicit | ❌ Error |
| **`int`** | Explicit | Explicit | Explicit | Same | Implicit | Implicit | Implicit | ❌ Error |
| **`long`** | Explicit | Explicit | Explicit | Explicit | Same | Implicit | Implicit | ❌ Error |
| **`float`** | Explicit | Explicit | Explicit | Explicit | Explicit | Same | Implicit | ❌ Error |
| **`double`** | Explicit | Explicit | Explicit | Explicit | Explicit | Explicit | Same | ❌ Error |
| **`boolean`**| ❌ Error | ❌ Error | ❌ Error | ❌ Error | ❌ Error | ❌ Error | ❌ Error | Same |

---

## 🚀 Key Rules

1. **Widening (Implicit):** Chhote data type se bade data type mein conversion automatically ho jata hai (jaise `int` se `long`). Isme data loss ka koi risk nahi hota.
2. **Narrowing (Explicit):** Bade data type ko chhote data type mein convert karne ke liye explicit casting operator `(target_type)` lagana padta hai, kyunki isme data loss ho sakta hai.
3. **Boolean Incompatibility:** Java mein `boolean` type kisi bhi numeric type ke sath cast nahi kiya ja sakta, ye compile-time error deta hai.
