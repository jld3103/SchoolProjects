package de.jld3103.SchoolProjects

import java.lang.reflect.Method

object Main {
  def main(args: Array[String]): Unit = {
    val c: Class[_] = Class.forName("de.jld3103.SchoolProjects.Projects." + args(0) + "." + args(0))
    val method: Method = c.getDeclaredMethod("start")
    println("Running project '" + args(0) + "'\n")
    method.invoke(c)
  }
}