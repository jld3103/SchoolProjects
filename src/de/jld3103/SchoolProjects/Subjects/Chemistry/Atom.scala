package de.jld3103.SchoolProjects.Subjects.Chemistry

class Atom {
  private var atomicNumber = 0
  private var electrons = 0
  private var neutrons = 0
  private var protons = 0
  private var electroNegativity = 0.0
  private var symbol = ""
  private var name = ""
  private var mass = 0.0
  private var period = 0
  private var IUPACGroup = 0

  def getAtomicNumber: Int = atomicNumber

  def setAtomicNumber(i: Int): Unit = atomicNumber = i

  def getElectrons: Int = electrons

  def setElectrons(i: Int): Unit = electrons = i

  def getNeutrons: Int = neutrons

  def setNeutrons(i: Int): Unit = neutrons = i

  def getProtons: Int = protons

  def setProtons(i: Int): Unit = protons = i

  def getElectroNegativity: Double = electroNegativity

  def setElectroNegativity(i: Double): Unit = electroNegativity = i

  def getSymbol: String = symbol

  def setSymbol(s: String): Unit = symbol = s

  def getName: String = name

  def setName(s: String): Unit = name = s

  def getMass: Double = mass

  def setMass(i: Double): Unit = mass = i

  def getPeriod: Int = period

  def setPeriod(i: Int): Unit = period = i

  def getIUPACGroup: Int = IUPACGroup

  def setIUPACGroup(i: Int): Unit = IUPACGroup = i
}