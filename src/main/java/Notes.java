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
2.



 */
}
