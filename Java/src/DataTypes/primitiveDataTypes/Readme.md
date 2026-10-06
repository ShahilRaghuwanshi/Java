# 📌 Data Types in Java

## What are Data Types?
Data types are the mechanisms to convert real-world data into binary and store it in computer memory in a particular format[cite: 2].

> **Core Concept:** Every data has to be converted to binary in a specific format[cite: 2]. If it is not in a specific format, then identifying that data would be difficult to differentiate the data you have[cite: 2].

---

## 📊 Real-World Data vs Java Data Types Mapping

| Types of Data (Real World) | Data Types in Java | Format / Encoding |
| :--- | :--- | :--- |
| **Character** | `char` | **UTF-16** |
| **Integer** | `byte`, `short`, `int`, `long` | **Base 2** |
| **Real Numbers** | `float`, `double` | **IEEE single precision**, **IEEE double precision** |
| **True / False** | `boolean` | **OS dependent / JVM dependent** |
| **Picture** | *Objects / Binary Streams* | *Byte Arrays* |
| **Audio** | *Objects / Binary Streams* | *Byte Arrays* |
| **Video** | *Objects / Binary Streams* | *Byte Arrays* |

---

## 💡 Notes Highlights
* **Character Encoding:** Java uses 16-bit **UTF-16** encoding for `char` representation[cite: 2].
* **Integer Storage:** Stored using standard binary notation (**Base 2**)[cite: 2].
* **Floating-Point Representation:** Real numbers follow **IEEE 754** single precision (`float`) and double precision (`double`) standards[cite: 2].
* **Boolean:** Representation depends internally on the **OS / JVM** architecture[cite: 2].
