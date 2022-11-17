/*val fw = (x: Double) => -Math.pow(x, 2) + 8 * x - 12
fw(12)*/


def Simpson_1T( f:Double => Double, a : Double, b : Double) : Double = {
  (b-a)*((f(a)+4*f((a+b)/2)+f(b))/6)
}

val f1 = Simpson_1T(x => - math.pow(x , 2) + 8 * x  - 12, 3, 5)
val f2 = Simpson_1T(x => 3 * math.pow(x , 2), 0, 2)
val f3 = Simpson_1T(x => x + 2 * math.pow(x,2) - math.pow(x,3) + 5 * math.pow(x,4),-1,1)
val f4 = Simpson_1T(x => ( 2 * x + 1 ) / ( math.pow(x,2) + x) ,1,2)
val f5 = Simpson_1T(x => math.pow(math.E,x) ,0, 1)
val f6 = Simpson_1T(x => 1 / math.sqrt(x-1),2,3)
val f7 = Simpson_1T(x => 1 / 1 + math.pow(x,2),0,1)