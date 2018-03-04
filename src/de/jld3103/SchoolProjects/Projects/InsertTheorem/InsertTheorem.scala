package de.jld3103.SchoolProjects.Projects.InsertTheorem

import de.jld3103.SchoolProjects.Utils.Input

object InsertTheorem {
  def start(): Unit = {
    println("The vertex form is a(x-d)^2+e")
    println("The insertion is (-d|e) and -d±√-e/a")
    println()
    var a = 1.0
    var d = 0.0
    var e = 0.0
    try {
      a = Input.getDouble("Enter a: ")
    } catch {
      case _: Throwable =>
    }
    try {
      d = Input.getDouble("Enter d: ")
    } catch {
      case _: Throwable =>
    }
    try {
      e = Input.getDouble("Enter e: ")
    } catch {
      case _: Throwable =>
    }
    println(s"The vertex is ($d|$e)")
    println(s"The pq-formula is x = $d±√${-e / a}")
    println(s"The nulls are x⁰ = ${d + math.sqrt(-e / a)}, x¹ = ${d - math.sqrt(-e / a)}")
  }
}