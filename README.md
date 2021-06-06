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

<!---- Displaying text using println() and print()-----!>

Standard output is a receiver to which a program can send information (text). It is supported by all common operating systems. Java provides a special object System.out to work with the standard output. We will often use it to print something.

The println method displays the passed string followed by a new line on the screen (print-line). As an example, the following code fragment prints four lines.

System.out.println("I ");
System.out.println("know ");
System.out.println("Java ");
System.out.println("well.");
The output:

I
know
Java
well.
All strings were printed as is, without double quotes.

The method allows you to print an empty line when no string is given:

System.out.println("Java is a popular programming language.");
System.out.println(); // prints empty line
System.out.println("It is used all over the world!");
The output:

Java is a popular programming language.

It is used all over the world!
The print method displays the passed value and places the cursor (the position where we display a value) after it. As an example, the code below outputs all strings in a single line.

System.out.print("I ");
System.out.print("know ");
System.out.print("Java ");
System.out.print("well.");
The output:

I know Java well.
Pay attention to the spaces between words. We pass them to methods for printing.

Printing numbers and characters
Both methods println and print allow a program to print not only strings and characters, but also numbers.

Let's print two secret codes.

System.out.print(108);   // printing a number
System.out.print('c');   // printing a character that represents a letter
System.out.print("Q");   // printing a string
System.out.println('3'); // printing a character that represents a digit

System.out.print(22);
System.out.print('E');
System.out.print(8);
System.out.println('1');
It outputs:

108cQ3
22E81
As is the case with strings, none of the characters contain quotes.
<!----- Declaring and initializing-----!>

A variable is a placeholder for storing a value of a particular type: a string, a number, or something else. Every variable has a name (also known as an identifier) to distinguish it from others. Before you start using a variable, you must declare it.

The general form of declaration is the following:

DataType variableName = initialization;
The left part of this statement describes the variable, and the right part describes something that is assigned to it.

The type (or data type) of a variable determines what possible operations can be performed on the variable and which values can be stored in it. Here we use a non-existing data type (DataType) to demonstrate the general form of declaration.
The name (or identifier) distinguishes the variable from others. The name of a variable cannot start with a digit; it usually starts with a letter. Always try to choose meaningful and readable names for variables to make your code easy to understand.
The assignment operator denoted as = is used to assign a single value or a result of an expression to a variable.
The initialization is a value or a result of an expression that is assigned to the variable.
According to this declaration, we can declare a variable of the type String and assign the word "java" to it:

String language = "java";
We can also declare a variable of the type int to store an integer number:

int numberOfApples = 5;

The case in the name of a variable makes a difference: language is not the same as Language.
Variables can store not only strings and numbers, but also characters and other data types which we will learn about later in the next topics.

Accessing the value of a variable
Once a variable has been declared, its value can be accessed and modified using the name. In the example below, we declare a variable and then print it:

String dayOfWeek = "Monday";
System.out.println(dayOfWeek); // Monday
It is also possible to assign a value of one variable to another one:

int one = 1;
int num = one;
System.out.println(num); // 1
One important feature of variables is that they can be changed. You don't need to declare a variable again to change its value; just assign a new value to it using the = operator.

Let's declare a variable named dayOfWeek and print its value before and after changing:

String dayOfWeek = "Monday";
System.out.println(dayOfWeek); // Monday

dayOfWeek = "Tuesday";
System.out.println(dayOfWeek); // Tuesday
There is one restriction for variables: you can only assign a value of the same type as the type of the initial variable. So, the following code is not correct:

int number = 10;
number = 11; // ok
number = "twelve"; // it does not work!
Alternative forms of declaration
There are several alternative forms of declaration which are less commonly used in practice. Here are several of them in particular examples.

Declaring several variables of the same type as a single statement:
String language = "java", version = "8 or newer";
Separating declaration and initialization into statements:
int age; // declaration
age = 35; // initialization 
However, as we have already noted, these forms are rarely used.

Type inference
Since Java 10, you can write var instead of a specific type to force automatic type inference based on the type of assigned value:

var variableName = initialization;
Here are two examples below:

var language = "Java"; // String
var version = 10; // int
This feature can be a bit controversial: on the one hand, it allows your code to be more concise. On the other hand, since it doesn't indicate the type explicitly, it may affect the code readability in a bad way. For now, it's enough to understand the basic idea. We will not use type inference in our theory so that our educational platform is suitable for people who use earlier versions of Java. But if you would like to practice it, you may use type inference in our exercises as they fully support Java 10.

int i = 0, j = 0, k = 0;
String s = "s", str = "str";

Enter the number of declared variables in the code fragment.

For example, if you think that eight variables are here, enter the number:
en este caso son 5 ya que reasignar una variable cuenta como asignarla

<!----- -----!>
Inside a Java program, you can write a special text that will be ignored by the java compiler — known as the comment. Comments allow you to exclude code from the compilation process (disable it) or clarify a piece of code to yourself or other developers. In our materials, we use comments in the theory and practice lessons to explain how and why our code works.

The Java programming language supports three kinds of comments.

End-of-line comments
The java compiler ignores any text from // to the end of the line.

class Program {
    public static void main(String[] args) {
        // The line below will be ignored
        // System.out.println("Hello, World");
        // It prints the string "Hello, Java"
        System.out.println("Hello, Java"); // Here can be any comment
    }
}
In the example above the text after // is ignored by the compiler.

Multi-line comments
The compiler ignores any text from /* and the nearest */. It can be used as multiple and single-line comments.

class Program {
    public static void main(String[] args) {
        /* This is a single-line comment */
        /*  This is an example of
            a multi-line comment */
  }
}
You can use comments inside other comments:

class Program {
    public static void main(String[] args) {
        /*
        System.out.println("Hello"); // print "Hello"
        System.out.println("Java");  // print "Java"
        */
    }
}
The part of the code above is ignored by the compiler because of /* ... */ comments.

Java documentation comments
The compiler ignores any text from /** to */ just like it ignores multi-line comments.

These kinds of comments can be used to automatically generate documentation about your source code by using the javadoc tool. Usually, these comments are placed above declarations of classes, interfaces, methods and so on. Some special labels such as @param or @return are often used for controlling the tool. However, they are optional and we will not deal with them for now. Just don't be surprised in case you see one.

See the example below.

class Program {
    /**
     * The main method accepts an array of string arguments
     *
     * @param args from the command line
     */
    public static void main(String[] args) {
        // do nothing
    }
}
Do not be afraid if you have not understood the documentation comments completely. This will be considered in other topics.

<!---------- ----------!>
There's a question that you bump into when moving from simple single-line programs to more complicated ones: how to write code that is clean and easy to read? This is trickier than it may seem at the beginning, and this is quite important: in real life, programming is a process that involves a lot of people that work together. In fact, you often spend more time reading code than writing it. Even when you're working alone and writing a program "for yourself", after a while, it may become difficult for you to understand your own program if it's badly written.

That is why you need to follow common best practices concerning programming style. This way, other programmers and yourself could read your code easily. Writing good code may help you get your first job and make a good impression on your colleagues.

Good coding style is like correct punctuation: you can manage without it, butitsuremakesthingseasiertoread. – The Tidyverse Style Guide by Hadley Wickham
Java Conventions
A list of recommendations on how to write code for some particular language is usually called coding style guide or style conventions. The conventions help developers standardize and support well-readable code. They are more like recommendations than strict rules, but by following them a programmer creates code that is clean and consistent so that other developers will be happy to work with it.

In most cases, companies and individual developers do not create their own style conventions. There are two generally accepted Java conventions that are used all over the world:

Oracle Code Conventions
Google Style Guide
Sometimes they could be modified or extended by a particular company to meet their needs.

In all our code examples and exercises, we will follow the Oracle Code Conventions and we urge you to do the same while learning here. After completing the course, you can follow any conventions you want. Actually, it doesn't really matter which one to follow, the main challenge is to be consistent across your code.
There is no need to learn all the conventions at once: just remember to open them from time to time after learning some new syntactic concepts. We will provide the information throughout the course when needed.

Now let's look at some of the most basic Java conventions according to Oracle Code Conventions.

The number of spaces
The first convention is to use 4 spaces as the unit of indentation in the whole program code. You have already seen our code examples before and you might note that we used this value there.

Good:

public class NumberOfSpacesExample {

    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("I'm a Java program.");
    }
}
Very bad:

public class NumberOfSpacesExample {

  public static void main(String[] args) {
     System.out.println("Hi!");
   System.out.println("I'm a Java program.");
 }
}
As you can see, the second code example looks ugly and requires some effort to be read.

Sometimes tabulation is used to create an indentation. However, tab may correspond to 8 spaces instead of 4 in some IDEs, that is why we recommend you stick to spaces in this course.
The location of curly braces
Some time ago, developers were arguing a lot about where to put opening and closing curly braces in C-like programming languages. The next convention describes what to do in Java:

Put the opening curly brace at the end of the line where the block begins.
Put the closing curly brace at the beginning of the next line.
There are two examples below which illustrate these rules.

Good:

public class NumberOfSpacesExample {

    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("I'm a Java program.");
    }
}
Not that bad, but not Java-way:

public class NumberOfSpacesExample 
{
    public static void main(String[] args) 
    {
        System.out.println("Hi!");
        System.out.println("I'm a Java program.");
    }
}
Here, the second code example doesn't look ugly, but it is just not a Java way. Most of the common conventions follow the first example.

Avoid extra spaces
Sometimes you may add some spaces even if you don't really need them. This will reduce the readability of your code.

Avoid extra spaces within parentheses.
Good:

System.out.println("Hello!");
Bad:

System.out.println( "Hello!" );
Avoid an extra space before an open parenthesis.
Good:

System.out.println("OK");
Bad:

System.out.println ("Shifted braces");
Avoid extra spaces before a semicolon:
Good:

System.out.println("No extra spaces");
Bad:

System.out.println("It has an extra space") ;
The length of a line
The last recommendation concerns the maximum length of a line. Oracle Code Conventions propose avoiding lines longer than 80 characters. Plenty of developers consider this restriction as outdated since modern monitors can easily display longer lines, whereas others would go on following this rule, which is handy, for example, if laptops are used.

Keeping ourselves off this dispute, we will use 80 characters in the course to avoid scrollbars in our examples and web code editor. We recommend that you do the same while learning here, but keep in mind that you can violate this limitation after you start working on a real project or learning elsewhere.

Other popular limit values are 100, 120, and sometimes even 140 characters.

Conclusion
Style guides provide the conventions to help create well-readable and consistent code. For Java, the two most popular ones are Oracle Code Conventions and Google style guide. One of their main objectives is to provide an effective way for developers to work on the code together. Because of that, it is not as important to strictly follow one of the existing style guides as to stay consistent within the project. Later on, you will learn a lot of things about Java and become a skillful programmer, but maintaining the code style will always remain important. Do not worry, though: you do not need to learn all the conventions at once. In all the following topics, we will follow the Oracle Code Conventions and encourage you to do it with us!
<!---------- Why is naming important?---------!>

As you may know, every variable has a name that uniquely identifies it among other variables. Giving a good name to a variable may not be as simple as it seems. Experienced programmers put a lot of care into naming to make their programs easy to understand. It is important because programmers spend a lot of their time getting through the code written by other programmers. If variables have bad names, even your own code will seem unclear to you in a few months.

Always try to give descriptive and concise names to all variables. As a result, any programmer will enjoy your code for a long time.

In addition, there are two sets of rules that restrict the possible names for variables.

Rules for naming variables
Java has some rules for naming variables:

names are case-sensitive;
a name can include Unicode letters, digits, and two special characters ($, _);
a name cannot start with a digit;
a name must not be a keyword (class, static, int are illegal names).
Based on these rules, you may conclude that whitespaces are not allowed in the name of a variable.

It is important not to break these rules; otherwise, the program will not work.
Here are some valid names of variables:

number, $ident, bigValue, _val, abc, k, var
Note that to keep backward compatibility the word var can be used as a variable name even after Java 10 was released.
And here are some invalid ones:

@ab, 1c, !ab, class
Since Java 9 the single character _ is an invalid name for a variable, but _a and __ (double _ ) are legal names.

Naming conventions for variables
Also, there are the following conventions for naming variables:

if a variable name is a single word it should be in lowercase (for instance: number, price);
if a variable name includes multiple words it should be in lowerCamelCase, i.e. the first word should be in lowercase and each word after the first should have its first letter written in uppercase (for instance: numberOfCoins);
variable names should not start with _ and $ characters, although they are allowed;
choose a name that makes sense, e.g. score makes more sense than s, although they are both valid.
These conventions are optional, but it is strongly recommended to follow them. As we mentioned at the beginning of this lesson, they make your code more readable for you and other Java programmers.

<!----------Theory: Scanning the input-----------!>
The standard input is a stream of data going into a program. It is supported by the operating system. By default, the standard input obtains data from the keyboard input but it's possible to redirect it from a file.

Actually, not all programs need to use the standard input. But we will often use it here to help you master your programming skills! The typical way to solve programming problems is the following:

Read data from the standard input (System.in);
Process data to obtain a result;
Output the result to the standard output (System.out).
This type of code challenge can be easily tested by different formats of input data, and for this reason, we will use them a lot.

Reading data with a scanner
The simplest way to obtain data from the standard input is to use the standard class Scanner. It allows a program to read values of different types (string, numbers, etc) from the standard input. In this topic, we will consider reading data from the input.

To use this class you should add the following import statement to the top of your file with the source code.

import java.util.Scanner;
Then you add the following construction after the import:

Scanner scanner = new Scanner(System.in);
With this line, we create an object of Scanner class, that enables us to use its methods. We will learn more about creating objects in other topics. System.in indicates that the program will read text that you type in the standard input. For now, you will always require this line exactly.

There are two ways to read strings with a Scanner class. If your input is an integer number or a single word, you can read the data using next() method. As an example, the following code fragment reads the user’s name and prints hello message:

String name = scanner.next();

System.out.println("Hello, " + name + "!");
For instance, the user's name is James. The output of the program will be the following:

Hello, James!
If the user's input is an integer number like 123, the program will output this number. Note that the next() method will store 123 or another integer number as a string, even if we know that this string consists of a number.

Hello, 123!
There are more specialized methods for reading other types of input values. In this topic, we only consider reading strings.
But, if the user prints a compound name like Erich Maria, the program will output only the first word:

Hello, Erich!
In this case, you'll need another method, a nextLine() method, which reads and outputs the whole line:

Hello, Erich Maria!
As you may notice, the next() method reads one word only and doesn't include any whitespace. By contrast, the nextLine() method includes all space characters it encounters.

Note that in Java whitespace includes not only the space character, but mostly everything that looks empty when printed: a tab, the newline character, and other non-printing characters.
In this article, we are dealing with space and newline characters: technically, we produce a corresponding character when pressing Enter and starting a new line. The term "whitespace" is used to refer to either of them. The more correct term to refer to what we’ve called “word” is token: it is a piece of text surrounded by whitespace. We can say now that the next() method finds and returns the next token, while the nextLine() reads all data till the end of the current line.

Now you can read a whole word and even a whole line invoking these two methods. To invoke both of them correctly, it is important to know the difference between them.

Reading a multiline input
Reading multiline input may still be a bit tricky: you should take into account the position of the cursor and the reading methods behavior.

Let’s investigate this process with an example:

|This is a simple

multiline input,

that is being read
| is a position of the cursor before reading the input.

If we invoke the next() method, the program will read the input till the whitespace, as indicated by the color blue:

This| is a simple

multiline input,

that is being read
After invoking the nextLine() method the program reads the whole line starting from the whitespace. This data is indicated by a green color. The nextLine() places the cursor at the beginning of a new line (if there is such a line in your input):

This is a simple

|multiline input,

that is being read
Then, let's invoke the next() method two times. The first input is indicated by an orange color. You may see that the position of the cursor is right after the word and before the whitespace:

This is a simple

multiline| input,

that is being read
Now we invoke the next() method again. The program outputs the second word in the line without whitespace. It doesn't even matter how many space characters are there, because the next() method will skip the whitespace until it finds the next token.

The second input is indicated by light blue color. As you may see, the position of the cursor is still at the current line right before the new line and after the comma:

This is a simple

multiline input,|

that is being read
Here is a tricky thing about the nextLine() method that also shows a major difference between the next() and the nextLine() methods. As you already know, the program will read input from the position of the cursor till the new line (again, if there is such a line in your input). In this example the cursor is located before the new line: thus, the nextLine() method will return an empty line ("") and place the cursor at the beginning of a new line.

This is a simple

multiline input,

|that is being read
To sum up, let's look at the code as a whole and consider the variables we have just read:

import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        String word1 = scanner.next(); // "This"
        String line1 = scanner.nextLine(); // " is a simple" 
        String word2 = scanner.next(); // "multiline"
        String word3 = scanner.next(); // "input,"
        String line2 = scanner.nextLine(); // "" 
        
    }
}
This example may seem artificial, but it should help you to catch the difference between these two methods. Remember that usually the variables are named in a more expressive way.

Conclusion
We can read data from the standard input with a special Scanner class. The next() and the nextLine() methods will help you to read strings. Both of them are used for getting input, but they act differently. The next() method can read the input only till the whitespace while the nextLine() method reads the input till the end of the whole line.

We recommend you to use the class Scanner when solving programming problems. It is one of the simplest ways to get values from the standard input. More complex ways to read data will be discussed in further topics.

<!--------  Theory: Arithmetic operations ----------!>
In real life, we often perform arithmetic operations. They help us to determine the change from a purchase, calculate the area of a room, count the number of people in a queue, and so on. The same operations are used in programs.

Binary arithmetic operators
The Java programming language provides operators to perform arithmetic operations:

addition +
subtraction -
multiplication *
integer division /
remainder %
The operators are called binary because they take two values as operands.

The following example prints results of addition, subtraction, and multiplication.

System.out.println(13 + 25); // prints 38
System.out.println(20 + 70); // prints 90

System.out.println(70 - 30); // prints 40
System.out.println(30 - 70); // prints -40

System.out.println(21 * 3);  // prints 63
System.out.println(20 * 10); // prints 200
The / operator returns the integer part of the division of two integer numbers, and any fractional part is discarded.

System.out.println(8 / 3); // prints 2
System.out.println(41 / 5); // prints 8
The % in Java is the modulus or remainder operator. It returns the remainder of the division of two numbers. Note, that when the dividend is less than the divisor, the quotient is zero and the remainder equals the dividend. If you still feel uneasy about modulo operation, check out the wiki.

System.out.println(10 % 3) // prints 1, because 10 divided by 3 leaves a remainder of 1
System.out.println(12 % 4) // prints 0, because 12 divided by 4 leaves no remainder
System.out.println(5 % 9) // prints 5, because 5 divided by 9 leaves a remainder of 5
Writing complex expressions
The operations can be combined to write more complex expressions:

System.out.println(1 + 3 * 4 - 2); // prints 11
The calculation order coincides with arithmetic rules. Multiplication has a higher priority level than addition and subtraction, so the operation 3 * 4 is calculated first.

To specify the order of execution we can use parentheses as in the following:

System.out.println((1 + 3) * (4 - 2)); // prints 8
As in arithmetic, parentheses can be nested. You can also use them for clarity.

Unary operators
A unary operator takes a single value as the operand.

The unary plus operator indicates a positive value. It's an optional operator.
System.out.println(+5); // prints 5
The unary minus operator negates a value or an expression.
System.out.println(-8);  // prints -8
System.out.println(-(100 + 4)); // prints -104
They both have a higher level of precedence than the multiplication and division operators.

The precedence order
There is a precedence order of all arithmetic operators, including parentheses. The list below is sorted from the highest to the lowest precedence level.

parentheses
unary plus/minus
multiplication, division
addition, subtraction
<!----------- Theory: Integer types and operations-----------!>
Basic information about integer types
Java provides several types which represent integer numbers including positive, negative and zero. In practice, the most used types are int and long. The first type can store numbers from a smaller range than the second one, but it is often enough (especially, in this topic). You can perform all arithmetic operations (+, -, *, /, %) with variables of integer types.

Let's look at some examples below.

int two = 2;
int ten = 10;

int twelve = two + ten; // 12
int eight = ten - two;  // 8
int twenty = two * ten; // 20
int five = ten / two;   // 5
int zero = ten % two;   // 0, no remainder

int minusTwo = -two; // -2
This code demonstrates how to assign values to int variables as well as how to perform arithmetic operations with them. We hope that you already understand all operations well.

To improve the readability of your code, the special underscore character _ can be used to separate groups of digits within a number.

int million = 1_000_000;
You may also print a value of an int variable:

int number = 100;
System.out.println(number); // 100
All arithmetic operations work with the long type as well.

long one = 1L;
long twentyTwo = 22L; // L or l is a literal for longs
long bigNumber = 100_000_000_000L;

long result = bigNumber + twentyTwo - one; 
System.out.println(result); // 100000000021
If a number ends with the letter L or l it is considered as long, otherwise, it is int. We recommended you to use the uppercase letter L because the lower case letter l is very similar to the digit 1.

Note, use long's numbers only if it is really necessary (to process big values)
The forms of the assignment operator
Suppose, you want to add some value to a variable. You may write something like this:

int n = 10;
n = n + 4; // 14
The assignment operator = has several forms which combine it with an operation to avoid repeating the variable twice:

int n = 10;
n += 4; // 14
As you may see, this form looks more concise. There are a few other possible forms *=, /=, %= and some others.

Reading numbers from the standard input
As a rule, to solve a problem you need to read some data from the outside world, process it, and output the result. The following program reads two numbers from the standard input, adds them, and prints the sum.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println(sum);
    }
}
This simple code uses Scanner to read data.

If we know that the input numbers can be quite large, we can read long's instead of int's:

long a = scanner.nextLong();
long b = scanner.nextLong();

long sum = a + b;
No more lines need to be changed in this code.

Now you have enough knowledge to write useful programs that process data. You may use the template above for solving code challenges in this lesson. Try to give meaningful names to variables when solving problems.

Para obtener el siguiente numero par al numero ingresado por teclado
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        a += 2 - (a % 2);
        System.out.println(a);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        System.out.println(input1 + 2 - input1 % 2);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int given = scanner.nextInt();
        if (0 == given % 2) {
            System.out.println(given + 2);
        } else {
            System.out.println(given + 1);
        }
    }
}

<!--------- Theory: Units of information ----------!>
Throughout life, we always find something to measure: the amount of food we need to cook for the family, the length and width of that couch you want to put in the room, our weight and height. The latter is especially exciting: it's really cool to learn that in just one year you grew by a full 2 inches!

Each measurement requires an instrument and its own unit of measurement. For example, bodyweight is measured with scales in kilograms (or pounds), time is measured with clocks in seconds, etc. But how does one measure information?

Bit: the smallest unit of information
The information entered into the computer should be specific and unambiguous. For a long time, people have used ciphers. The simplest and most convenient of them were digital. Any information from the names of flowers to the days of the week can be presented in the form of numbers. When processed with a conventional computer, the data is encoded by numbers. They are represented by the electrical signals that the computer works with. For the convenience of distinguishing, signals of two levels are used in classical electronic computers. One of them corresponds to the number 1, and the other to 0. Any letter, sound, or image on a computer is represented by a set of numbers. The numbers 1 and 0 are called binary. These are the symbols that make up the language understood and used by the computer. Any information on the computer is represented by binary digits: 1, meaning "there is a signal" and 0, meaning "no signal".

The smallest unit of information is the bit (b).
Each digit of the machine binary code carries the amount of information equal to one bit. It can take only one of two values: either 1 or 0. It is very inconvenient to measure information in bits because the numbers come out too big.

Byte: a sequence of eight bits
Since people do not consider the mass of ships in grams, larger and hence more convenient units were invented for measuring information as well.

The processing of information takes place in the processor. This is a device that can work with several bits at once (8, 16, 32, 64, ...). The more bits of information are processed simultaneously, the faster the computer operation is. The first computers processed 8 bits of information simultaneously, so we needed a new unit of measurement which was called a byte (B) that means 8 bits.

Bit marks are easily confused with byte marks. Note that the abbreviations for bit numbers uses the lowercase letter "b", while bytes are denoted using the capital "B".
Large units of information
There are larger units of information since modern computers process huge amounts of information significantly exceeding bytes.

The computer industry has historically used the units kilobyte, megabyte, and gigabyte in at least two slightly different measurement systems which are slightly contradictory to each other.

The first one is a decimal-based system, which uses bytes in the powers of ten: kilobyte (10^3 bytes), megabyte (10^6 bytes), and gigabyte (10^9 bytes) and so on. These units are used by the International System of Units (SI).
The second one is a binary-based system which uses bytes in the powers of two: kilobyte (2^10 bytes), megabyte (2^20 bytes), gigabyte (2^30 bytes) and so on. This system was actively used to describe computer memory.
To resolve this confusion, the International Electrotechnical Commission (IEC) suggested to use prefixes kilo, mega and giga only for the decimal-based system and to use new prefixes kibi, mebi, gibi for the binary-based system. Here bi means binary: kibibyte is kilo binary byte.

Here is a table with commonly used units of information according to the modern international standards.

SI metric	Symbol	Powers of ten	IEC metric	Symbol	Powers of two
Kilobyte	kB	10^3 B (1000 B)	Kibibyte	KiB	2^10 B (or 1024 B)
Megabyte	MB	10^6 B (1000 kB)	Mebibyte	MiB	2^20 B (or 1024 KiB)
Gigabyte	GB	10^9 B (1000 MB)	Gibibyte	GiB	2^30 B (or 1024 MiB)
Terabyte	TB	10^12 B (1000 GB)	Tebibyte	TiB	2^40 B (or 1024 GiB)
Petabyte	PB	10^15 B (1000 TB)	Pebibyte	PiB	2^50 B (or 1024 TiB)
Of course, not all units of measurement are listed here. We hope, this classification will not cause you any difficulties. It is good that a byte is always 8 bit :) But even this did not come immediately.

Note that some people and organizations still prefer kilo, mega, and giga to describe powers of two. In this course, we follow the recommendations of the IEC and use modern prefixes kibi, mebi, and gibi.
Measurement units conversion
To strengthen your newly obtained knowledge, let's look at the solution of a rather typical problem where you need to convert 1 GiB to KiB. When we convert bigger units into smaller ones, we need to resort to an arithmetic operation called multiplication:

1 GiB = 1 * 1024 * 1024 = 1048576 KiB
Accordingly, when you need to convert small units into big ones, you use division. Let's try to convert 16384 bits to KiB:

16384 bits = (16384 / 8) / 1024 = 2 KiB
If you want to convert 1 GB to kB, you should multiply the number by a thousand twice:

1 GB = 1 * 1000 * 1000 = 1000000 kB
Congratulations, now you have studied one of the basic topics of computer science and are ready to storm new dizzying heights of knowledge.

<!----------- Theory: Sizes and ranges-------------!>
In this lesson, we will discuss the classification and properties of primitive types provided by Java. Maybe you already know a few of them. The basic types can be separated into several groups according to meaning. Types from the same group can be operated in the same way, but have different sizes and, as consequence, represent different ranges of values.

You do not need to know all this information by heart, because it is easy to find it in the documentation or simply Google it. But a common understanding of these concepts is important in job interviews and practice.

Numbers
Java provides several types for integers and fractional numbers. These types are often used in arithmetic expressions.

Integer numbers (0, 1, 2, ...) are represented by the following four types: long,int,short,byte(from the largest to the smallest). These types have different sizes and may represent different ranges of values. The range of an integer type is calculated as −(2n−1) to (2n−1)−1, where n is the number of bits. The range includes 0, which is the reason for subtracting 1 from the upper bound.

byte: size 8 bits (1 byte), range from -128 to 127
short: size 16 bits (2 bytes), range from -32768 to 32767
int: size 32 bits (4 bytes), range from −(231) to (231)−1
long: size 64 bits (8 bytes), range from −(263) to (263)−1
The sizes of types are always the same. They do not depend on the operating system or hardware and cannot be changed.

The most commonly used integer types are int and long. Try to use int if it is enough for your purposes. Otherwise, use long.

int one = 1;
long million = 1_000_000L;
Floating-point types represent numbers with fractional parts. Java has two such types: double (64 bits) and float (32 bits). These types can store only a limited number of significant decimal digits (~6-7 for float and ~14-16 for double). Usually, you will use the double type in practice.

double pi = 3.1415;
float e = 2.71828f;
Note, that when we declare and initialize a float variable, we should mark the assigned value with the special letter f. It is often a good practice to mark a long value with L as well. We will learn more about numeric literals later.
Characters
Java has a type named char to represent letters (uppercase and lowercase), digits, and other symbols. Each character is just a single letter enclosed in single quotes. This type has the same size as the short type (2 bytes = 16 bits).

char lowerCaseLetter = 'a';
char upperCaseLetter = 'Q';
char dollar = '$';
Characters represent symbols from many alphabets including hieroglyphs, as well as some special symbols which will be studied in the following lessons.

Booleans
Java provides a type called boolean, which can store only two values: true and false. It represents only one bit of information, but its size is not precisely defined.

boolean enabled = true;
boolean bugFound = false;
We will often use this type in conditionals and as a result of comparing two numbers.

As a recap, we note that the types used most often are int, long, boolean, char, and double. Also, remember that long is the widest integer type. Knowledge of sizes and ranges of data types may help you with interviews.
Choose the correct formula for calculating the upper (max) possible value of an int variable.

a) 2^(n−1) − 1, where n is the number of bytes
b) 2^(n−1) + 1, where n is the number of bytes
c) 2^n + 1, where n is the number of bytes
d) 2^(n−1) − 1, where n is the number of bits//correcta
e) 2^(n−1) + 1, where n is the number of bits
f) 2^n + 1, where n is the number of bits

<!-------- Theory: Type casting   --------!>
Suppose, you need to assign a value of one type to a variable of another type. To do that, your program needs to cast the source type to the target type. Java provides two kinds of casting for primitive types: implicit and explicit. The first one is performed automatically by the java compiler when it is possible, and the second one – only by a programmer.

Implicit casting
The compiler automatically performs implicit casting when the target type is wider than the source type. The picture below illustrates the direction of this casting. Any value of a given type can be assigned to the one on the right implicitly.

                    char
//byte ---> short ---> int --->long --->float --->double
Boolean -> Char -> Byte -> Short -> Int -> Long -> Float -> Double

*/The direction of implicit primitive type castings

Normally, there is no loss of information when the target type is wider than the source type, for example when we cast int to long. But it is not possible to automatically cast in the backward order (e.g. from long to int or from double to float).

Note, there is no boolean type on the picture above, because it is impossible to cast this type to any other and vice versa.
Here are several examples of implicit castings:

from int to long:
int num = 100;
long bigNum = num; // 100L
from long to double:
long bigNum = 100_000_000L;
double bigFraction = bigNum; // 100000000.0
from short to int:
short shortNum = 100;
int num = shortNum; // 100
from char to int:
char ch = '?';
int code = ch; // 63
In some cases, implicit type casting may be a bit lossy. When we convert an int to float, or a long to float or to double, we may lose some less significant bits of the value, which will result in a loss of precision. However, the result of this conversion will be a correctly rounded version of the integer value, which will be in the overall range of the target type. To understand that, check out the example:

long bigLong =  1_200_000_002L;
float bigFloat = bigLong; // 1.2E9 (= 1_200_000_000)
When we convert a char to an int in Java we actually get the ASCII value for a given character. ASCII value is an integer representation of English alphabet letters (both uppercase and lowercase), digits, and other symbols. Here you can find some of the standard symbols in ASCII.

char character = 'a';
char upperCase = 'A';

int ascii1 = character; // this is 97
int ascii2 = upperCase; // this is 65
Strictly speaking, Java uses Unicode Character Representations (UTF-16), which is a superset of ASCII and includes a by far larger set of symbols. However, the numbers 0–127 have the same values in ASCII and Unicode.
As you can see, implicit casting works absolutely transparently.

Explicit casting
The considered implicit casting does not work when the target type is narrower than the source type. But programmers can apply explicit casting to a source type to get another type they want. It may lose information about the overall magnitude of a numeric value and may also lose precision.

To perform explicit casting, a programmer must write the target type in parentheses before the source.

(targetType) source
Any possible casting not presented in the picture above needs such an approach, for example double to int, and long to char.

Examples:

double d = 2.00003;

// it loses the fractional part
long l =  (long) d; // 2

// requires explicit casting because long is wider than int
int i = (int) l; // 2 

// requires explicit casting because the result is long (indicated by L)
int val = (int) (3 + 2L); // 5

// casting from a long literal to char
char ch = (char) 55L; // '7'
However, the explicit casting may truncate the value, because long and double can store a much larger number than int.

long bigNum = 100_000_000_000_000L;
int n = (int) bigNum; // 276447232
Oops! The value has been truncated. This problem is known as type overflow. The same problem may occur when casting int to short or byte. Let's see what happens exactly.

As you remember, in Java long is a 64-bit number, while int is 32-bit. When converting long to int the program just takes the last 32 bits to represent the new number. If the long contains a number less than or equal to Integer.MAX_VALUE you can convert it by casting without losing information. Otherwise, the result will be quite meaningless, although determined. That is why you shouldn't perform casting from a larger type to a smaller type unless you are absolutely sure that it is necessary, and that truncation will not interfere with your program.

Explicit casting also works when implicit casting is enough.

int num = 10;
long bigNum = (long) num; // redundant casting
But this is redundant and should not be used to avoid unnecessary constructs in your code.

Note, that despite the power of explicit casting, it is still impossible to cast something to and from the boolean type.
Conclusion
If you want to cast a narrower type to a wider type, you do not need to write anything, the Java compiler will do it automatically for you. But if you want the opposite, specify the required type in parentheses following the assignment operator. Keep in mind, the boolean type cannot be cast to another type and vice versa.
float f = 20d + 20.02f; // 1 CAST AS FLOAT
long n = 10 + 2L;       // 2
byte b = n + 5;         // 3 CAST AS BYTE

long lo = Integer.MAX_VALUE; // (1)
int i = lo; // (2)   CASTEAR
char ch = i; // (3)  CASTEAR
double d = ch; // (4)
float f = d; // (5)  CASTEAR
CASTEO EXPLICITO REQUERIDO
int q = 'q';  // 1
char ch2 = q; // 2  SI
short s = 1;  // 3
char ch3 = s; // 4  SI