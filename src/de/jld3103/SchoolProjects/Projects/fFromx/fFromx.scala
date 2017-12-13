package de.jld3103.SchoolProjects.Projects.fFromx

import de.jld3103.SchoolProjects.Subjects.Math.Evaluator
import de.jld3103.SchoolProjects.Utils.Input

object fFromx {
  def start(): Unit = {
    val fFromx = Input.getString("Enter function f(x): ")
    val y = Input.getDouble("Enter y-axis: ")
    val incrementer = Input.getDouble("Enter incrementer: ")
    for {i <- (-y) to y by incrementer} {
      val evaluator = new Evaluator()
      println(s"x: ${trim(i)} f(x): ${evaluator.evaluate(fFromx.replace("x", String.valueOf(i)))}")
    }
  }

  def trim(i: Double): String = if (i >= 0) " " + i else String.valueOf(i)
}
