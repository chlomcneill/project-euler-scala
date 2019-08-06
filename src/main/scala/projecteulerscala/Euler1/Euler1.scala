package projecteulerscala.Euler1

object Euler1 {

  def sum_of_multiples_of_3_and_5_below_x(x: Int) {
    val threes = (1 until x).filter(_% 3 == 0).toList
    val fives = (1 until x).filter(_% 5 == 0).toList
    val mults = threes ++ fives
    println(mults.distinct.sum)
  }

  def main(args: Array[String]): Unit = {
    sum_of_multiples_of_3_and_5_below_x(1000)
  }
}
