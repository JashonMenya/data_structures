# Data Structures

# ☕ Java Collections Overview

The **Java Collections Framework** is a set of classes and interfaces that implement commonly reusable collection data structures. It provides a unified architecture to store, manipulate, and retrieve groups of objects efficiently.

---

## 🔗 Core Collection Interfaces

| Interface  | Description                             |
|------------|-----------------------------------------|
| `Collection` | Root interface for most collection classes |
| `List`       | Ordered collection, allows duplicates    |
| `Set`        | Unordered, no duplicates                |
| `Queue`      | Ordered for processing (FIFO/LIFO)     |
| `Deque`      | Double-ended queue (insert/remove from both ends) |
| `Map`        | Key-value pairs (not a subtype of Collection) |

---

## 🗂️ Common Implementations

### 📋 List Implementations
| Class         | Description                        |
|---------------|------------------------------------|
| `ArrayList`   | Resizable array implementation     |
| `LinkedList`  | Doubly-linked list implementation  |
| `Vector`      | Synchronized, legacy               |
| `Stack`       | Subclass of Vector (LIFO)          |

### 📦 Set Implementations
| Class           | Description                      |
|-----------------|----------------------------------|
| `HashSet`       | Unordered, backed by `HashMap`   |
| `LinkedHashSet` | Maintains insertion order        |
| `TreeSet`       | Sorted set, backed by `TreeMap`  |

### 📬 Queue & Deque Implementations
| Class          | Description                               |
|----------------|-------------------------------------------|
| `PriorityQueue`| Elements ordered by natural/comparator    |
| `ArrayDeque`   | Resizable-array implementation of `Deque` |
| `LinkedList`   | Implements both `Queue` and `Deque`       |

---

## 🗺️ Map Implementations
| Class            | Description                            |
|------------------|----------------------------------------|
| `HashMap`        | Unordered key-value map                |
| `LinkedHashMap`  | Maintains insertion order              |
| `TreeMap`        | Sorted map (by key)                    |
| `Hashtable`      | Thread-safe legacy map                 |
| `Properties`     | Legacy subclass for config key-values  |

---

## 📌 Summary

- **Core Interfaces**: `Collection`, `List`, `Set`, `Queue`, `Deque`, `Map`
- **Common Implementations**: ~10–15 widely used classes
- **Legacy Classes**: `Vector`, `Stack`, `Hashtable`, `Properties`

---

## 📚 Resources

- [Official Java Docs](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/package-summary.html)
- [Java Collections Tutorial (Oracle)](https://docs.oracle.com/javase/tutorial/collections/)

---

