def sum(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 0
  else f(a) + sum(f, a + 1, b)

def sumInts(a: Int, b: Int) = sum(id, a, b)
def sumCubes(a: Int, b: Int) = sum(cube, a, b)
def sumFactorials(a: Int, b: Int) = sum(fact, a, b)

def id(x: Int): Int = x
def cube(x: Int): Int = x * x * x
def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)

(x: Int, y: Int) => x + y

//Exercise
def product(f: Int => Int)(a: Int, b: Int): Int =
  if (a>b) 1
  else f(a) * product(f)(a+1,b)

  product(x => x * x)(3,4)

def factorial(n: Int) = product(x => x)(1, n)

factorial(5)


