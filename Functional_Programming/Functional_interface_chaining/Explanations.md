# JAVA
# Function Chaining in Java

Function chaining is a powerful concept in functional programming where we create a chain of functions, where the output of one function serves as the input to the next.

In Java, we can chain functions using the `andThen` and `compose` methods provided by the `Function` interface.

A simple example of Function in java:
    
```java
    Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    int result = incrementByOneFunction.apply(5);  // Output: 6
```


## `andThen` Method

The `andThen` method allows us to create a new function by chaining another function after the current function. The output of the current function serves as the input to the next function.

Here is a basic example:

```java
Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

Function<Integer, Integer> incrementAndMultiply = incrementByOneFunction.andThen(multiplyBy10Function);

int result = incrementAndMultiply.apply(5);  // Output: 60

```

Apply the composed function to a list of numbers, and save the results in a new list:

```java
List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

//  get the list of results after incrementing by 1 and multiplying by 10
List<Integer> result = numbers.stream()
        .map(Functions.incrementByOneFunction
                .andThen(Functions.multiplyBy10Function))
        .collect(Collectors.toList());
// we can do it like this or we can use the already created composed funtion
        result.forEach(System.out::println);
```


In this example, we have two functions `incrementByOneFunction` and `multiplyBy10Function`. We chain these functions using the `andThen` method to create a new function `incrementAndMultiply`. When we apply this function to the input `5`, the output will be `60`.

## `compose` Method

The `compose` method is similar to the `andThen` method, but it chains the functions in the reverse order. The output of the next function serves as the input to the current function.

Here is an example:

```java
Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

Function<Integer, Integer> multiplyAndIncrement = incrementByOneFunction.compose(multiplyBy10Function);

int result = multiplyAndIncrement.apply(5);  // Output: 51

```
The steps for this example are as follows:
1. The input `5` is multiplied by `10` to get `50`.
2. The result `50` is incremented by `1` to get `51`.
3. The final output is `51`.
