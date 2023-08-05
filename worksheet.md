# Task 0

Clone this repository (well done!)

# Task 1

Take a look at the two repositories:

  * (A) https://bitbucket.org/altmattr/personalised-correlation/src/master/
  * (B) https://github.com/Whiley/WhileyCompiler

And answer the following questions about them:

  * These repositories are at two different websites - github and bitbucket - what are these sites?  What service do they provide? Which is better?

  Git provides a Distributerd system , this is better because its faster , if you make changes to a file , that file will be on your computer and the change is made.
  -fast
  -open source and free
  -offline access etc.

  But with BitBucket , since its a centralized system . everytime you make a change on a file you have to access a server


  * Who made the last commit to repository A? Matthew Roberts made the last commit on 2022-08-18

  * Who made the first commit to repository A? The first commit was made by Jon Mountjoy on  2014-08-11

  * Who made the first and last commits to repository B? DavePearce made both the first and last commit.

  * Are either/both of these projects active at the moment? 🤔 If not, what do you think happened?
  * 🤔 Which file in each project has had the most activity?

  For file *(B) the most file with most activity is the modules file. how ?
  using this command git rev-list --objects --all | awk '$2' 
| sort -k2 | uniq -cf1 | sort -rn | head

i was able to sort from the most commited file to the least. module had the most commits of 3123.


for the File *(A) the file with the most activity is templates with 34 commits.

# Task 2

The repository you just cloned is a VSCode project, so lets work with it.  It currently will print "Hello World" message to the console when run.

You will find "Run" and "Debug" commands over the `main` method.  Try them out.  You can also trigger them with `F5` for "Debug" and `Ctrl-F5` for "Run"

Modify the application so that instead it prints

~~~~~
Red vs. Blue
~~~~~

# Task 3

Draw a 20 by 20 grid on a 720x720 window.  Each cell in the grid should be 35 pixels high and wide and the grid should be drawn 10 pixels off the top and left borders of the screen.  To do this, you should use the `Graphics` class from the Java libraries.  Be sure to consult the tips video for this task (it is a link in iLearn).  Without it, you will be very confused.

# Task 4

The "grid" has no identity - it is just drawn.  Later on we will need to do lots of things "with" this grid.  We will modify it and adjust it and ask it questions.  Our task here is to refactor the program to give this grid an identity.  We will create an object to represent the grid and will give that object its own `paint` method for drawing the grid.

We will also need to give an identity to each "cell" of the grid and make each cell responsible for it's own painting to the screen.

Modify the program to make these things happen.  Make a `Grid` class and a `Cell` class and organise them in a sensible way.  What fields and methods should each class have?

# Task 5

Anything that is a `JFrame` or `JPanel` can find out the position of the mouse using `getMousePosition`.  Modify your program so that mousing over a cell will "highlight" it.  Highlighted cells should be drawn in grey.  You may have to think about how you will get the mouse position from the place you can read it, to the place it is needed (the `paint` method of a `Cell` object).
