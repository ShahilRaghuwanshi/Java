# 📌 Datatypes in Java

## Definition
Datatypes are the mechanisms to convert the real world data into binary and store it in computer's memory, in a particular format.

Different real world data and its associated data types in java is as show below -

> **Core Concept:**
> (Every data has to be converted to Binary in a specific format if it is not in a specific format then identifying that data would be difficult to differentiate the data you have format)

---

## 📊 Datatypes Mapping Table

| Types of data (Real world data) | Datatypes in Java | Format | Memory Size & Range (Added Context) |
| :--- | :--- | :--- | :--- |
| **Character** | `char` | **UTF - 16** | 2 Bytes (16-bit), `\u0000` to `\uffff` |
| **Integer** | `byte`, `short`, `int`, `long` | **Base 2** | `byte`: 1 Byte, `short`: 2 Bytes, `int`: 4 Bytes, `long`: 8 Bytes |
| **Real Numbers** | `float`, `double` | **IEEE single precesion**, **IEEE double precesion** | `float`: 4 Bytes (32-bit), `double`: 8 Bytes (64-bit) |
| **True / false** | `boolean` | **OS dependent / JVM dependent** | ~1 Bit logically (JVM implementation dependent) |
| **Picture** | *Objects / Reference Types* | *Binary Streams / Byte Arrays* | Handled via classes like `BufferedImage`, `byte[]` |
| **Audio** | *Objects / Reference Types* | *Binary Streams / Byte Arrays* | Handled via Audio API / `byte[]` |
| **Video** | *Objects / Reference Types* | *Binary Streams / Byte Arrays* | Handled via Media Frameworks / `byte[]` |

---

## 💡 Technical Deep Dive (Extended Context)

### 1. Primitive vs Non-Primitive Types
* **Primitive Data Types:** Built-in data types (`byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`) that directly hold values in binary format.
* **Non-Primitive Data Types:** Reference types (Classes, Arrays, Interfaces) used to handle complex real-world data like **Picture**, **Audio**, and **Video**.

### 2. Encoding Details
* **UTF-16:** Allows Java to support international characters (Unicode standard).
* **IEEE 754 Standard:** Ensures standardized floating-point representation across different hardware architectures.
