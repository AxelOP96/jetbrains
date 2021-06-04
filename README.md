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