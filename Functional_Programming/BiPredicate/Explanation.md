# BiPredicate in Java

A `BiPredicate` is a functional interface provided by Java in the `java.util.function` package. It is used to test a condition (a predicate) that returns a boolean value and accepts two arguments.

## Definition

A `BiPredicate` takes two arguments and returns a boolean value. The arguments can be of any type. The functional method of the `BiPredicate` interface is `test(T t, U u)`.

```java
BiPredicate<T, U> biPredicate = (t, u) -> { return true/false; };
```

## Usage

`BiPredicates` are often used in conditional statements and data filtering. They are commonly used to test conditions involving two inputs.

## Examples

Here are some examples of using `BiPredicate`:

1. **Check if a string starts and ends with certain characters:**

```java
BiPredicate<String, String> startsAndEndsWith = (str, charSeq) -> str.startsWith(charSeq) && str.endsWith(charSeq);
System.out.println(startsAndEndsWith.test("Apple", "e"));  // Outputs false
```

2. **Check if one number is divisible by another:**

```java
BiPredicate<Integer, Integer> isDivisible = (num, divisor) -> num % divisor == 0;
System.out.println(isDivisible.test(10, 5));  // Outputs true
```

3. **Check if a map contains a certain key-value pair:**

```java
Map<String, Integer> map = new HashMap<>();
map.put("Apple", 1);
map.put("Banana", 2);
BiPredicate<Map<String, Integer>, String> containsKeyWithValueOne = (m, key) -> m.containsKey(key) && m.get(key) == 1;
System.out.println(containsKeyWithValueOne.test(map, "Apple"));  // Outputs true
```

## Combining BiPredicates

`BiPredicates` can be combined using default methods in the `BiPredicate` interface such as `and()`, `or()`, and `negate()`.

```java
BiPredicate<String, String> startsWith = (str, prefix) -> str.startsWith(prefix);
BiPredicate<String, String> endsWith = (str, suffix) -> str.endsWith(suffix);

// Use and() to combine two BiPredicates
BiPredicate<String, String> startsAndEndsWith = startsWith.and(endsWith);
System.out.println(startsAndEndsWith.test("Apple", "e"));  // Outputs false
```

These are basic examples and the real power of `BiPredicates` is realized when they are used in the context of higher-order functions, such as those provided by the Stream API.