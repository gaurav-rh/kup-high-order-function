package com.knoldus.assignment

class SquareList {
  def squareListMatch(list: List[Int]): List[Int] =
    list match {
      case List() => List()
      case listHead :: listTail => listHead * listHead :: squareListMatch(listTail)
    }


  def squareListMap(list: List[Int]): List[Int] =
    list map (listElement => listElement * listElement)
}
