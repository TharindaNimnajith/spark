package org.example

case object ScalaCaseObject {
  // Main method
  def main(args: Array[String]): Unit = {
    val c = ScalaCaseClass("Nidhi", 23)

    // Display both Parameter
    println("Name of the employee is " + c.name)
    println("Age of the employee is " + c.age)
  }
}
