package org

import scala.language.implicitConversions

//noinspection ScalaUnusedSymbol
package object example {
  // package wide constants:
  def BarVersionString = "1.0"

  // or type aliases
  type StringMap[+T] = Map[String, T]

  // can be used to emulate a package wide import
  // especially useful when wrapping a Java API
  // type DateTime = org.joda.time.DateTime

  type JList[T] = java.util.List[T]

  // Define implicits needed to effectively use your API:
  // implicit def a2b(a: A): B // ...
}
