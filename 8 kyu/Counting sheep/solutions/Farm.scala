object Farm {
  def countSheep(sheep: Array[Boolean]): Int = sheep.count(sheep => sheep)
}