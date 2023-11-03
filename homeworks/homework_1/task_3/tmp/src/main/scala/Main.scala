object Main extends App{
  val intro = "Scala!This is Evgeniy"
  val lst = List("Hello", "Hola", "Guten Tag")

  for (i <- lst) {
    println(s"$i $intro")
  }

  for (i <- lst) {
    println(s"$i $intro".reverse)
  }

}