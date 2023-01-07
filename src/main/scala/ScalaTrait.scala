package org.example

// Trait
trait ScalaTrait {
  def pet(): Unit

  def pet_color(): Unit
}

// MyClass inherits ScalaTrait
class MyClass extends ScalaTrait {
  // Implementation of methods of ScalaTrait
  def pet(): Unit = {
    println("Pet: Dog")
  }

  def pet_color(): Unit = {
    println("Pet_color: White")
  }

  // Class method
  def pet_name(): Unit = {
    println("Pet_name: Dollar")
  }
}

object Main {
  // Main method
  def main(args: Array[String]): Unit = {
    val obj = new MyClass()
    obj.pet()
    obj.pet_color()
    obj.pet_name()
  }
}
