# Infix-Converter-Choolwe-Zilombo-Soko-202408157
The objective of this assignment is to develop a Java program that converts a given infix expression into its equivalent postfix and prefix forms using stack-based algorithms.

Objectives:
1)To understand expression notations (infix, postfix, prefix)

2)To implement stack data structures in Java

3)To apply operator precedence rules in expression evaluation

4)To develop a working Java program for expression conversion

Program Description:
1)The program prompts the user to enter an infix expression. It then processes the input and displays:
2)The original infix expression
3)The equivalent postfix expression
4)The equivalent prefix expression
The conversion is performed using stack operations and standard operator precedence rules.

Methodology:
INFIX TO POSTFIX CONVERSION
Scan the expression from left to right
If the symbol is an operand, add it to the output
If the symbol is an operator, push it onto a stack
Pop operators from the stack based on precedence
Handle parentheses appropriately
Append remaining operators to the output

INFIX TO PREFIX CONVERSION
Reverse the infix expression
Swap opening and closing parentheses
Convert the modified expression to postfix

Conclusion
This assignment demonstrates the use of stacks in solving real-world problems such as expression conversion. It also reinforces understanding of operator precedence and algorithm design in Java.
Reverse the result to obtain the prefix expression
