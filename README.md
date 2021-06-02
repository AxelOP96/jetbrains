# jetbrains
practicas de java
// Learn Java while building real functional applications. You'll get to choose a project that suits your level and will get all the necessary knowledge to complete it. Completing the full track will prepare you to deal with various tasks related to desktop application or web development in Java. While progressing through different projects of this track you can learn to:
// Understand the syntax of Java and write well readable and efficient code
// Work with professional development tools and GitHub
// Apply the principles of object-oriented programming widely used in commercial development
// Simplify your application design with functional programming
// Use collections to effectively process data in your application
// Use multicore processing to optimize the speed of your app
// Use the Swing library for desktop development
// Build an efficient web application with SpringBoot
// Work with data formats like JSON and XML
// Work with databases


// Project: Simple Tic-Tac-Toe
// About
// Everybody remembers this paper-and-pencil game from childhood: Tic-Tac-Toe, also known as Noughts and crosses or Xs and Os. A single mistake usually costs you the game, but thankfully it is simple enough that most players discover the best strategy quickly. Let’s program Tic-Tac-Toe and get playing!

// primer desafio:
// You have a guest list of the people who registered their stay at the hotel. There are 4 rooms in the hotel: 1 single room, 2 double rooms and 1 family room for three guests. The guest list consists of 4 lines. Each line contains the name or the names of the guests registered together in one room.

// Read the names of the registered guests from the list and output each name in a separate line and in reverse order starting with the last registered guest. Note that the order of the guests registered in each room is undefined.

// Sample Input 1:

// Jane Kate
// John
// Mary Susan Paul
// Boris Ann
// Sample Output 1:

// Ann
// Boris
// Paul
// Susan
// Mary
// John
// Kate
// Jane
// 3desafio
// IntelliJ IDEA can do something with context near the cursor.

// How to ask for it?

//  Select one option from the list

// Using Alt+Enter keystroke

// Using the Change to action

// Going to File | Settings

// Creating a new file

// Creating a new project
// 4desafio
// Modify this program to output

// Cats are robots!
// desafio
// Remember the conventions for naming variables? Make the variable CACTUS@HEIGHT not only syntactically correct, but also compliant with those recommendations. Enter the result.

// What you'll do in this stage 1/5: Welcome to the battlefield!
// Description
// Tic-tac-toe is known all over the world. Each country may have its own version of the name, sometimes the rules are different, but the essence of the game remains the same. Below are the main rules that may be familiar to you since childhood.

// Tic-tac-toe is a game played by two players on a 3x3 grid. One of the players is 'X', and the other player is 'O'. X plays first, then O takes the next turn, and so on.

// The players write 'X' and 'O' on a 3x3 field.

// The first player that puts 3 X's or 3 O's in a straight line (including diagonals) wins the game.

// Objectives
// Your first task in this project is to print the game grid in the console output. Use what you’ve learned about the print() function to print three lines, each containing three characters (X’s and O’s) to represent a game of tic-tac-toe where all fields of the grid have been filled in.

 Example
 The example below shows how your output might look:

 X O X
 O X O
 X X O 
What is Java?
Java is a general-purpose modern programming language initially developed by Sun Microsystems, and currently owned by Oracle Corporation. The key feature of the language is platform independence: it means that the same Java program can be run on multiple platforms without any changes! This principle is also known as "write once, run anywhere" (or WORA).

Java has been one of the most popular programming languages for many years. It has earned the top position in the TIOBE index (a programming language popularity index). This language is used by a huge community of developers around the world! If you have a problem, you can always ask other developers or find a suitable answer online.

Java is used in our Android smartphones, the financial services industry, telecommunications, embedded systems, and in many other areas. Medical applications use it to store patient data, computer games, such as Minecraft, are created using Java; development tools like IntelliJ IDEA and Eclipse wouldn't exist without it.

A short history of Java
The Java language project was initiated in 1991 by James Gosling and his colleagues. In the beginning, the language was called "Oak." Later the project was renamed "Java" as a reference to Java coffee. For this reason, the language’s logo is a cup of coffee.

Sun Microsystems released Java 1.0 in 1996. After that, new versions were released every 1 to 3 years. Since Java 9, released in 2017, new versions have been released every 6 months. You can read more about its history and find the most recent version here.

Some important features of Java
As we've mentioned before, the most important feature of Java is platform independence.

Another important feature is a simple and clear syntax. Many elements of the language are easy to read and are widely used in other programming languages such as C/C++, C#, JavaScript, and Go.

If you have ever written programs in C/C++, you know that manual memory cleaning can lead to bugs in the code. Fortunately, Java has a garbage collector that automatically cleans memory from unused objects during runtime.

It is also important to note that Java supports multiple programming paradigms; you will get to know more about them in these topics. Java is primarily an imperative language based on the object-oriented concept: almost every part of a program is an object. Therefore, a program itself can be considered as a set of interacting objects. Also, it partially supports modern programming paradigms such as generic programming, concurrent programming, functional programming, and some others.

If you are a beginner in programming, it may be difficult to comprehend all the features of Java right now. This is not a bad thing. Throughout this set of topics, you will learn about all of these concepts.
In conclusion, Java is a modern and popular programming language that can be successfully used in almost all domains.
Literals
Regardless of its complexity, a program always performs operations on numbers, strings, and other values. These values are called literals. There are many different sorts of literals in Java, but in this topic we will focus only on a few of them: the ones that surround us all the time in everyday life.

Let's consider integer numbers, strings, and characters in the format in which they are written in Java.

Integer numbers
These numbers are used to count things in the real world. Also, we will often use them in Java.

Here are several examples of valid integer number literals separated by commas: 0, 1, 2, 10, 11, 100.

If an integer value contains a lot of digits, we can add underscores to divide the digit into blocks for increased readability: 1_000_000. It's more readable than the same value written as 1000000.

Characters
A single character can represent a digit, a letter or another symbol. To write a character we use single quotes as follows: 'A', 'B', 'C', 'x', 'y', 'z', '0', '1', '2', '9'. Character literals can represent symbols of an alphabet, digits from '0' to '9', whitespaces (' '), or other characters or symbols ('$').

Do not confuse characters that represent numbers (e.g. '9'), with numbers themselves (e.g. 9).

A character can't include two and more digits or letters because it represents only a single symbol. The following two examples are incorrect: 'abc', '543'. These literals contain too many characters.

Strings
A string is a sequence of any individual characters. Strings represent text information such as a text of advertising, an address of a web page or a login on a site.

To write a string we use double quotes instead of single ones. Here are some valid examples: "text", "I want to know Java", "123456", "e-mail@gmail.com". A string consisting of a single character like "A" is also a valid string, but do not confuse it with the 'A' character.

As you can see, strings can include letters, digits, whitespaces, and other characters.

Remember
Do not confuse these literals:

123 is an integer number, "123" is a string;
'A' is a character, "A" is a string;
'1' is a character, 1 is an integer number.

In this topic, we will build our very first Java program. Our program will simply print "Hello, World!" on the screen (a tradition by most programmers when learning new languages). Our code may not seem too exciting at first, however, we will learn about the basic template that all Java programs need to follow.
The Hello World program
Here is the Java code of this program:

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
} 
You can type this code in the Your Code section here and then press the execute button. In the result section, you will see:

Hello, World!
If you have already installed Java, you can run the program on your computer. If not, there is no need to install it right now. We will do that later.
The basic terminology
Now that you have seen the result, let's learn some basic terminology and then try to understand this program.

Program – a sequence of instructions (called statements), which are executed one after another in a predictable manner. Sequential flow is the most common and straightforward sequence of statements, in which statements are executed in the order that they are written – from top to bottom in a sequential manner;
Statement – a single action (like print a text) terminated by semi-colon (;);
Block – a group of zero, one or more statements enclosed by a pair of braces {...}; There are two such blocks in the program above.
Method – a sequence of statements that represents a high-level operation (also known as subprogram or procedure).
Syntax – a set of rules that define how a program needs to be written in order to be valid; Java has its own specific syntax that we will learn;
Keyword – a word that has a special meaning in the programming language (public, class, and many others). These words cannot be used as variable names for your own program;
Identifier or name – a word that refers to something in a program (such as a variable or a function name);
Comment – a textual explanation of what the code does. Java comments start with //.
Whitespace – all characters that are not visible (space, tab, newline, etc.).
The Hello World program under a microscope
The Hello World program illustrates the basic elements of Java programs. For now, we will discuss only the most important elements.

1. The public class. It is the basic unit of a program. Every Java program must have at least one class. The definition of a class consists of the class keyword followed by the class name. A class can have any name, such as App, Main, or Program, but it must not start with a digit. A set of braces {...} encloses the body of a class.

public class Main {
    // ...
}
The text after // is just a comment, not a part of the program. We will learn about comments in detail in later topics.

2. The main method. To make the program runnable, we put a method named main inside a class. It is the entry point for a Java program. Again, the braces {...} enclose the body of the method, which contains programming statements.

public static void main(String[] args) {
    // statements go here
}
The keywords public, static, and void will be discussed later, so just remember them for now. The name of this method (main) is predefined and should always be the same. Capitalization matters; if you name your first method like Main, MAIN or something else, the program cannot start.

The element String[] args represents a sequence of arguments passed to the program from the outside world. Don't worry about them right now.

3. Printing "Hello, world!". The body of the method consists of programming statements that determine what the program should do after starting. Our program prints the string "Hello, World!" using the following statement:

System.out.println("Hello, World!"); //  each statement has to end with ;
This is one of the most important things to understand from the Hello World program. We invoke a special method println to display a string followed by a new line on the screen. We will often use this approach to print something of interest to the screen. The text is printed without double quotes.

Important, that "Hello, World!" is not a keyword or an identifier; it is just a text to be printed.
Keywords
As you can see, even a simple Java program consists of many elements, including keywords that are parts of the language. In total, Java provides more than 50 keywords which you will gradually learn on this platform. The full list is here, but do not try to remember them at this moment.

Note, main is outside the given list because it is not a keyword
Conclusion
We have discussed the simplest program you can write in Java. It has a single class with a single main method. Every Java program must have a main method as it is the first to be executed when the program runs. Don't worry about memorizing every single term used in the topic (syntax, statement, block). These terms will reappear in further materials. Do not forget to use the provided Hello World program as a template for your own programs.

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
