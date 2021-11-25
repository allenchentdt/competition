  import scala.io.Source;
  import java.io.File
  import java.io.PrintWriter
  import scala.collection.mutable.ListBuffer

  object Calculate{
    def cd_number(product: Int, N: Int): Int = {
      def find_cd(product: Int, c: Int): List[Int] = {
        var d = product / c
        var r = product % c
        if (c > N) Nil else (d <= N, r == 0) match {
          case (true, true) => d :: find_cd(product, c + 1)
          case (true, false) => find_cd(product, c + 1)
          case (false, _) => find_cd(product, c + 1)
        }
      }

      find_cd(product, 1).length
    }

    def main(args: Array[String]) {
      var output = new ListBuffer[Int]()
      val input = Source.fromFile("input.txt").getLines.toArray.map(_.toInt)
      val T = input(0)
      for (t <- 1 to T) {
        val N = input(t)
        var abcd_number: Int = 0;
        for (a <- 1 to N) {
          for (b <- 1 to N) {
            abcd_number += cd_number(a * b, N)
          }
        }
        output += abcd_number
      }
      val writer = new PrintWriter(new File("output.txt"))
      writer.write(output.mkString("\n"))
      writer.close()
      Source.fromFile("output.txt").foreach { x => print(x) }
    }
  }

