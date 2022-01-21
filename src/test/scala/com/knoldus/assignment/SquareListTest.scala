package com.knoldus.assignment

import org.scalatest.flatspec.AnyFlatSpec

class SquareListTest extends AnyFlatSpec {
  val squareListObject = new SquareList
  val list = List(1, 4, 6, 9, 2)
  "condition" should "square the each element of list(2,3,4,5)" in {
    val localList = List(2, 3, 4, 5)
    val result = List(4, 9, 16, 25)
    assert(squareListObject.squareListMatch(localList) == result)
  }
  "condition" should "return the Empty list as our input list is empty" in {
    val localList = List()
    assert(squareListObject.squareListMatch(localList) == List())
  }
  "condition" should "check that both equivalent functions should return same result" in {
    assert(squareListObject.squareListMatch(list) == squareListObject.squareListMap(list))

  }

}
