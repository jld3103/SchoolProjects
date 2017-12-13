package de.jld3103.SchoolProjects.Projects.ElectroNegativity

import de.jld3103.SchoolProjects.Subjects.Chemistry.{Atom, Atoms}
import de.jld3103.SchoolProjects.Utils.Input

object ElectroNegativity {

  def start(): Unit = {
    while (true) {
      val in = Input.getString("Enter molecule: ")
      if (in.split("-").length == 2) {
        val a = in.split("-")(0)
        val b = in.split("-")(1)

        var atomA = new Atom
        var atomB = new Atom

        Atoms.addAtoms()

        Atoms.atoms.foreach(f => {
          if (f.getSymbol.equals(a)) atomA = f
          if (f.getSymbol.equals(b)) atomB = f
        })

        if (!atomA.getSymbol.eq("") && !atomB.getSymbol.eq("")) {
          val en = Atoms.calulateElectroNegativity(atomA, atomB)
          print(s"Bond of molecule ${atomA.getName}-${atomB.getName} is ")
          if (Atoms.isIonicBond(en)) print("ionic")
          else if (Atoms.isPolarBond(en)) print("polar")
          else print("non polar")
          println(s" and electronegativity is $en")
        } else println(s"Molecule $in not found!")
      } else println(s"Molecule $in has not the right length!")
    }
  }
}