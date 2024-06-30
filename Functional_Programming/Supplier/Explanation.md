# Supplier in Java

A `Supplier` is a functional interface provided by Java in the `java.util.function` package. It represents a supplier of results, meaning it takes no arguments and returns a result.

## Definition

A `Supplier` takes no arguments and returns a result of a given generic type. The functional method of the `Supplier` interface is `get()`.

```java
Supplier<T> supplier = () -> { return result; };
```

## Usage

`Suppliers` are often used when you want to generate or supply values without taking any input. They are commonly used in factory methods, or methods that construct objects.

## Examples

Here are some examples of using `Supplier`:

1. **Supply a random number:**

```java
Supplier<Double> randomSupplier = () -> Math.random();
System.out.println(randomSupplier.get());  // Outputs a random number
```

2. **Supply a new date:**

```java
Supplier<LocalDate> dateSupplier = () -> LocalDate.now();
System.out.println(dateSupplier.get());  // Outputs the current date
```

3. **Supply a new list:**

```java
Supplier<List<String>> listSupplier = () -> new ArrayList<>();
System.out.println(listSupplier.get());  // Outputs an empty list
```

These are basic examples and the real power of `Suppliers` is realized when they are used in the context of higher-order functions, such as those provided by the Stream API.