def Simpson_Com(fun : Double => Double, a : Double, b : Double, n : Int,  j :Int) : Double = {
  //val sum = (nro: Int) => (1 to n-1).forall(nro % _ != 2)

  val sum = (1 to n).filter(j => j*j > 2*n).size >= 3
  (((b - a) / n) / 3 ) * fun(a * (b - a) / 3 )
}

