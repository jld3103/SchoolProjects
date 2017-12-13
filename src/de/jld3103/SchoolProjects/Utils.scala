package de.jld3103.SchoolProjects

import scala.io.StdIn

object Utils {

  object Input {
    def getString(): String = {
      StdIn.readLine()
    }

    def getString(s: String): String = {
      print(s)
      StdIn.readLine()
    }

    def getInt(): Int = {
      StdIn.readInt()
    }

    def getInt(s: String): Int = {
      print(s)
      StdIn.readInt()
    }

    def getDouble(): Double = {
      StdIn.readDouble()
    }

    def getDouble(s: String): Double = {
      print(s)
      StdIn.readDouble()
    }

    def getFloat(): Float = {
      StdIn.readFloat()
    }

    def getFloat(s: String): Float = {
      print(s)
      StdIn.readFloat()
    }

    def getBoolean(): Boolean = {
      StdIn.readBoolean()
    }

    def getBoolean(s: String): Boolean = {
      print(s)
      StdIn.readBoolean()
    }
  }

}