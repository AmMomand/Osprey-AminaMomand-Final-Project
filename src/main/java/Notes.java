public class Notes {
/*
1. When using REGEX(regular expression) for step definitions:
   There is a difference between using (.*) and (.+) in regex:
   (.*) matches any character (including none) zero or more times. It's a greedy match, meaning it will match as many
   characters as possible.

   (.+) matches any character (excluding none) one or more times. It's also a greedy match, meaning it will match as
   many characters as possible.

   The key difference is that (.*) will match an empty string, while (.+) will not.
   For example:

- (.*) would match the empty string in the input "user enters valid username  and valid password "
- (.+) would not match the empty string in the same input

In general, if you want to match something that might be empty, use (.*) . If you want to match something that must have
at least one character, use (.+) .

------------------------------------------------------------------------------------------------------------------------
2. Assertion Statements:
   An assertion statement is a programming construct that allows you to test a condition in your code and throw an error
   if the condition is not met. Assertions are used to ensure that the code is working correctly and to catch errors
   early in the development process.

There are several types of assertion statements, including:

1. assertEquals: Checks if two values are equal.
Example: assert expectedValue == actualValue : "Values are not equal";

2. assertNotEquals: Checks if two values are not equal.
Example: assert expectedValue != actualValue : "Values are equal";

3. assertTrue: Checks if a condition is true.
Example: assert isValid : "Value is not valid";

4. assertFalse: Checks if a condition is false.
Example: assert !isValid : "Value is valid";

5. assertNotNull: Checks if a value is not null.
Example: assert value != null : "Value is null";

6. assertNull: Checks if a value is null.
Example: assert value == null : "Value is not null";

7. assertSame: Checks if two objects are the same.
Example: assert expectedObject == actualObject : "Objects are not the same";

8. assertNotSame: Checks if two objects are not the same.
Example: assert expectedObject != actualObject : "Objects are the same";

Here are some simple examples:

// Example 1: assertEquals
int expected = 5;
int actual = 5;
assert expected == actual : "Values are not equal";

// Example 2: assertTrue
boolean isValid = true;
assert isValid : "Value is not valid";

// Example 3: assertNotNull
Object value = new Object();
assert value != null : "Value is null";

assertions are typically used for debugging purposes and are often disabled in production code to improve performance.
In Java, assertions are disabled by default and need to be enabled explicitly using the -ea or -enableassertions flag
when running the application.

------------------------------------------------------------------------------------------------------------------------



 */
}
