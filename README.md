# JZZ
JZZ is an experimental object oriented programming language

It features a plethora of interesting features including
 - First Class Functions
 - Multiconditionals
 
# First Class Functions
In addition to the user defined functions, JZZ also treats if, elif, else, while and return as first class functions thus creating some interesting situations.

With if, the syntax is:
```
  if(bool, {
    ...
  }).elif(otherBool, {
    ...
  }).elif(thirdBool, { # you may chain more of these elif's
    ...
  }).else({
    ...
  });
```

While takes 2 functions, as it must call the first as a conditional:

```
  while(in.hasInt, {
    ...
  });
```

Return is also treated as a first class function, and will return from the most local function it is declared in. This creates some differences from other languages like Java or C. Observe the following code
```
// Java
System.out.println("1");
if (true) {
  System.out.println("2");
  return;
  System.out.println("unreachable");
}
System.out.println("unreachable");

# JZZ
println("1");
if(TRUE, {
  println("2");
  return(); # return will return from this anonymous function passed to the if function.
  println("unreachable");
});
print("3");
```

# Multi Conditionals
The language also supports multiconditionals, like the following for example:
`if (0 <= index < |arr|, {...});` is valid. You can mix any of the 5 comparsion operators in any order and repeat them. `!=` is ignored as `1 != 2 != 1` could be slightly confusing. `!=` may be used to compare 2 things however, just not combined with other comparsions in the multi-conditional.
Note `|arr|` represents the length of the array.
