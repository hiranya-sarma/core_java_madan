## Reference Type vs. Actual Object Type in Java

In Java, when we write:

```java
Collection<Integer> list1 = new ArrayList<>();
```

Two important concepts come into play:

1. **Reference Type (`Collection`) – Compile Time**
    - Determines which methods are accessible through the reference.
    - Only methods declared in the `Collection` interface (and its parent interfaces) can be called directly.

2. **Actual Object Type (`ArrayList`) – Runtime**
    - Determines which overridden instance method implementation is executed through **dynamic method dispatch** (runtime polymorphism).

### Why Does `list1.ensureCapacity(20)` Cause a Compilation Error?

```java
list1.ensureCapacity(20); // Compilation error
```

Although the actual object is an `ArrayList`, the reference type is `Collection`.

Since `ensureCapacity()` is declared in the `ArrayList` class and not in the `Collection` interface, the compiler does not allow this method call through a `Collection` reference.

### How Can We Access Subclass-Specific Methods?

There are two approaches:

**1. Use an `ArrayList` reference directly**

```java
ArrayList<Integer> list1 = new ArrayList<>();
list1.ensureCapacity(20); // Valid
```

**2. Explicitly downcast the reference**

```java
Collection<Integer> list1 = new ArrayList<>();

((ArrayList<Integer>) list1).ensureCapacity(20); // Valid
```

**Important:** Downcasting is successful only when the actual object is compatible with the target type. Otherwise, Java throws a `ClassCastException` at runtime.

### Key Takeaway

| Concept | Responsibility |
|---|---|
| Reference Type | Controls method accessibility at compile time |
| Actual Object Type | Determines which overridden instance method executes at runtime |
| Downcasting | Allows access to subclass-specific functionality |

**Remember:**

- Reference type → What methods can I call?
- Actual object type → Which overridden implementation will execute?
- Downcasting → How can I access subclass-specific methods?
