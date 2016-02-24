def sumInts(a: Int, b: Int): Int =
  if (a > b) 0 else a + sumInts(a+1, b)

println(sumInts(1,3))

def str = "abc"; println(str)

(x: Int) => x * x * x
(x: Int, y: Int) => x + y


def f(x: Int, y: Int) = 0

