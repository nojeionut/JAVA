
Sure, here are one-line explanations and examples for each of the functional interfaces you mentioned:

1. **Consumer:** Accepts a single input and performs an operation without returning a result.
```java
Consumer<String> print = s -> System.out.println(s);
print.accept("Hello, World!");
```

2. **BiConsumer:** Accepts two inputs and performs an operation without returning a result.
```java
BiConsumer<String, String> printConcat = (s1, s2) -> System.out.println(s1 + s2);
printConcat.accept("Hello, ", "World!");
```

3. **Function:** Accepts one input and produces a result.
```java
Function<String, Integer> stringLength = s -> s.length();
System.out.println(stringLength.apply("Hello, World!"));  // Outputs 13
```

4. **BiFunction:** Accepts two inputs and produces a result.
```java
BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;
System.out.println(concat.apply("Hello, ", "World!"));  // Outputs "Hello, World!"
```

5. **Predicate:** Accepts one input and returns a boolean value.
```java
Predicate<String> isNotEmpty = s -> !s.isEmpty();
System.out.println(isNotEmpty.test("Hello, World!"));  // Outputs true
```

6. **BiPredicate:** Accepts two inputs and returns a boolean value.
```java
BiPredicate<String, String> areEqual = String::equals;
System.out.println(areEqual.test("Hello", "Hello"));  // Outputs true
```

7. **Supplier:** Produces a result of a given generic type.
```java
Supplier<String> stringSupplier = () -> "Hello, World!";
System.out.println(stringSupplier.get());  // Outputs "Hello, World!"
```

These are basic examples and the real power of these functional interfaces is realized when they are used in the context of higher-order functions, such as those provided by the Stream API.