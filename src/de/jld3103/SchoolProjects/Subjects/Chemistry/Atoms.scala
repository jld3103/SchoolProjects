package de.jld3103.SchoolProjects.Subjects.Chemistry


import scala.collection.mutable

object Atoms {

  var atoms: mutable.MutableList[Atom] = mutable.MutableList[Atom]()

  def addAtoms(): Unit = {
    atoms = mutable.MutableList[Atom]()

    var a = new Atom
    a.setAtomicNumber(1)
    a.setSymbol("H")
    a.setName("Hydrogen")
    a.setIUPACGroup(1)
    a.setPeriod(1)
    a.setMass(1.0079)
    a.setElectroNegativity(2.2)
    atoms += a

    a = new Atom
    a.setAtomicNumber(2)
    a.setSymbol("He")
    a.setName("Helium")
    a.setIUPACGroup(18)
    a.setPeriod(1)
    a.setMass(4.0026)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(3)
    a.setSymbol("Li")
    a.setName("Lithium")
    a.setIUPACGroup(1)
    a.setPeriod(2)
    a.setMass(6.941)
    a.setElectroNegativity(0.98)
    atoms += a

    a = new Atom
    a.setAtomicNumber(4)
    a.setSymbol("Be")
    a.setName("Beryllium")
    a.setIUPACGroup(2)
    a.setPeriod(2)
    a.setMass(9.0122)
    a.setElectroNegativity(1.57)
    atoms += a

    a = new Atom
    a.setAtomicNumber(5)
    a.setSymbol("B")
    a.setName("Boron")
    a.setIUPACGroup(13)
    a.setPeriod(2)
    a.setMass(10.811)
    a.setElectroNegativity(2.04)
    atoms += a

    a = new Atom
    a.setAtomicNumber(6)
    a.setSymbol("C")
    a.setName("Carbon")
    a.setIUPACGroup(14)
    a.setPeriod(2)
    a.setMass(12.011)
    a.setElectroNegativity(2.55)
    atoms += a

    a = new Atom
    a.setAtomicNumber(7)
    a.setSymbol("N")
    a.setName("Nitrogen")
    a.setIUPACGroup(15)
    a.setPeriod(2)
    a.setMass(14.007)
    a.setElectroNegativity(3.04)
    atoms += a

    a = new Atom
    a.setAtomicNumber(8)
    a.setSymbol("O")
    a.setName("Oxygen")
    a.setIUPACGroup(16)
    a.setPeriod(2)
    a.setMass(15.999)
    a.setElectroNegativity(3.44)
    atoms += a

    a = new Atom
    a.setAtomicNumber(9)
    a.setSymbol("F")
    a.setName("Fluorine")
    a.setIUPACGroup(17)
    a.setPeriod(2)
    a.setMass(18.998)
    a.setElectroNegativity(3.98)
    atoms += a

    a = new Atom
    a.setAtomicNumber(10)
    a.setSymbol("Ne")
    a.setName("Neon")
    a.setIUPACGroup(18)
    a.setPeriod(2)
    a.setMass(20.18)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(11)
    a.setSymbol("Na")
    a.setName("Sodium")
    a.setIUPACGroup(1)
    a.setPeriod(3)
    a.setMass(22.99)
    a.setElectroNegativity(0.93)
    atoms += a

    a = new Atom
    a.setAtomicNumber(12)
    a.setSymbol("Mg")
    a.setName("Magnesium")
    a.setIUPACGroup(2)
    a.setPeriod(3)
    a.setMass(24.305)
    a.setElectroNegativity(1.31)
    atoms += a

    a = new Atom
    a.setAtomicNumber(13)
    a.setSymbol("Al")
    a.setName("Aluminium")
    a.setIUPACGroup(13)
    a.setPeriod(3)
    a.setMass(26.982)
    a.setElectroNegativity(1.61)
    atoms += a

    a = new Atom
    a.setAtomicNumber(14)
    a.setSymbol("Si")
    a.setName("Silicon")
    a.setIUPACGroup(14)
    a.setPeriod(3)
    a.setMass(28.086)
    a.setElectroNegativity(1.9)
    atoms += a

    a = new Atom
    a.setAtomicNumber(15)
    a.setSymbol("P")
    a.setName("Phosphorus")
    a.setIUPACGroup(15)
    a.setPeriod(3)
    a.setMass(30.974)
    a.setElectroNegativity(2.19)
    atoms += a

    a = new Atom
    a.setAtomicNumber(16)
    a.setSymbol("S")
    a.setName("Sulfur")
    a.setIUPACGroup(16)
    a.setPeriod(3)
    a.setMass(32.065)
    a.setElectroNegativity(2.58)
    atoms += a

    a = new Atom
    a.setAtomicNumber(17)
    a.setSymbol("Cl")
    a.setName("Chlorine")
    a.setIUPACGroup(17)
    a.setPeriod(3)
    a.setMass(35.453)
    a.setElectroNegativity(3.16)
    atoms += a

    a = new Atom
    a.setAtomicNumber(18)
    a.setSymbol("Ar")
    a.setName("Argon")
    a.setIUPACGroup(18)
    a.setPeriod(3)
    a.setMass(39.948)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(19)
    a.setSymbol("K")
    a.setName("Potassium")
    a.setIUPACGroup(1)
    a.setPeriod(4)
    a.setMass(39.098)
    a.setElectroNegativity(0.82)
    atoms += a

    a = new Atom
    a.setAtomicNumber(20)
    a.setSymbol("Ca")
    a.setName("Calcium")
    a.setIUPACGroup(2)
    a.setPeriod(4)
    a.setMass(40.078)
    a.setElectroNegativity(1)
    atoms += a

    a = new Atom
    a.setAtomicNumber(21)
    a.setSymbol("Sc")
    a.setName("Scandium")
    a.setIUPACGroup(3)
    a.setPeriod(4)
    a.setMass(44.956)
    a.setElectroNegativity(1.36)
    atoms += a

    a = new Atom
    a.setAtomicNumber(22)
    a.setSymbol("Ti")
    a.setName("Titanium")
    a.setIUPACGroup(4)
    a.setPeriod(4)
    a.setMass(47.867)
    a.setElectroNegativity(1.54)
    atoms += a

    a = new Atom
    a.setAtomicNumber(23)
    a.setSymbol("V")
    a.setName("Vanadium")
    a.setIUPACGroup(5)
    a.setPeriod(4)
    a.setMass(50.942)
    a.setElectroNegativity(1.63)
    atoms += a

    a = new Atom
    a.setAtomicNumber(24)
    a.setSymbol("Cr")
    a.setName("Chromium")
    a.setIUPACGroup(6)
    a.setPeriod(4)
    a.setMass(51.996)
    a.setElectroNegativity(1.66)
    atoms += a

    a = new Atom
    a.setAtomicNumber(25)
    a.setSymbol("Mn")
    a.setName("Manganese")
    a.setIUPACGroup(7)
    a.setPeriod(4)
    a.setMass(54.938)
    a.setElectroNegativity(1.55)
    atoms += a

    a = new Atom
    a.setAtomicNumber(26)
    a.setSymbol("Fe")
    a.setName("Iron")
    a.setIUPACGroup(8)
    a.setPeriod(4)
    a.setMass(55.845)
    a.setElectroNegativity(1.83)
    atoms += a

    a = new Atom
    a.setAtomicNumber(27)
    a.setSymbol("Co")
    a.setName("Cobalt")
    a.setIUPACGroup(9)
    a.setPeriod(4)
    a.setMass(58.933)
    a.setElectroNegativity(1.88)
    atoms += a

    a = new Atom
    a.setAtomicNumber(28)
    a.setSymbol("Ni")
    a.setName("Nickel")
    a.setIUPACGroup(10)
    a.setPeriod(4)
    a.setMass(58.693)
    a.setElectroNegativity(1.91)
    atoms += a

    a = new Atom
    a.setAtomicNumber(29)
    a.setSymbol("Cu")
    a.setName("Copper")
    a.setIUPACGroup(11)
    a.setPeriod(4)
    a.setMass(63.546)
    a.setElectroNegativity(1.9)
    atoms += a

    a = new Atom
    a.setAtomicNumber(30)
    a.setSymbol("Zn")
    a.setName("Zinc")
    a.setIUPACGroup(12)
    a.setPeriod(4)
    a.setMass(65.38)
    a.setElectroNegativity(1.65)
    atoms += a

    a = new Atom
    a.setAtomicNumber(31)
    a.setSymbol("Ga")
    a.setName("Gallium")
    a.setIUPACGroup(13)
    a.setPeriod(4)
    a.setMass(69.723)
    a.setElectroNegativity(1.81)
    atoms += a

    a = new Atom
    a.setAtomicNumber(32)
    a.setSymbol("Ge")
    a.setName("Germanium")
    a.setIUPACGroup(14)
    a.setPeriod(4)
    a.setMass(72.64)
    a.setElectroNegativity(2.01)
    atoms += a

    a = new Atom
    a.setAtomicNumber(33)
    a.setSymbol("As")
    a.setName("Arsenic")
    a.setIUPACGroup(15)
    a.setPeriod(4)
    a.setMass(74.922)
    a.setElectroNegativity(2.18)
    atoms += a

    a = new Atom
    a.setAtomicNumber(34)
    a.setSymbol("Se")
    a.setName("Selenium")
    a.setIUPACGroup(16)
    a.setPeriod(4)
    a.setMass(78.96)
    a.setElectroNegativity(2.55)
    atoms += a

    a = new Atom
    a.setAtomicNumber(35)
    a.setSymbol("Br")
    a.setName("Bromine")
    a.setIUPACGroup(17)
    a.setPeriod(4)
    a.setMass(79.904)
    a.setElectroNegativity(2.96)
    atoms += a

    a = new Atom
    a.setAtomicNumber(36)
    a.setSymbol("Kr")
    a.setName("Krypton")
    a.setIUPACGroup(18)
    a.setPeriod(4)
    a.setMass(83.798)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(37)
    a.setSymbol("Rb")
    a.setName("Rubidium")
    a.setIUPACGroup(1)
    a.setPeriod(5)
    a.setMass(85.468)
    a.setElectroNegativity(0.82)
    atoms += a

    a = new Atom
    a.setAtomicNumber(38)
    a.setSymbol("Sr")
    a.setName("Strontium")
    a.setIUPACGroup(2)
    a.setPeriod(5)
    a.setMass(87.62)
    a.setElectroNegativity(0.95)
    atoms += a

    a = new Atom
    a.setAtomicNumber(39)
    a.setSymbol("Y")
    a.setName("Yttrium")
    a.setIUPACGroup(3)
    a.setPeriod(5)
    a.setMass(88.906)
    a.setElectroNegativity(1.22)
    atoms += a

    a = new Atom
    a.setAtomicNumber(40)
    a.setSymbol("Zr")
    a.setName("Zirconium")
    a.setIUPACGroup(4)
    a.setPeriod(5)
    a.setMass(91.224)
    a.setElectroNegativity(1.33)
    atoms += a

    a = new Atom
    a.setAtomicNumber(41)
    a.setSymbol("Nb")
    a.setName("Niobium")
    a.setIUPACGroup(5)
    a.setPeriod(5)
    a.setMass(92.906)
    a.setElectroNegativity(1.6)
    atoms += a

    a = new Atom
    a.setAtomicNumber(42)
    a.setSymbol("Mo")
    a.setName("Molybdenum")
    a.setIUPACGroup(6)
    a.setPeriod(5)
    a.setMass(95.96)
    a.setElectroNegativity(2.16)
    atoms += a

    a = new Atom
    a.setAtomicNumber(43)
    a.setSymbol("Tc")
    a.setName("Technetium")
    a.setIUPACGroup(7)
    a.setPeriod(5)
    a.setMass(97.907)
    a.setElectroNegativity(1.9)
    atoms += a

    a = new Atom
    a.setAtomicNumber(44)
    a.setSymbol("Ru")
    a.setName("Ruthenium")
    a.setIUPACGroup(8)
    a.setPeriod(5)
    a.setMass(101.07)
    a.setElectroNegativity(2.2)
    atoms += a

    a = new Atom
    a.setAtomicNumber(45)
    a.setSymbol("Rh")
    a.setName("Rhodium")
    a.setIUPACGroup(9)
    a.setPeriod(5)
    a.setMass(102.91)
    a.setElectroNegativity(2.28)
    atoms += a

    a = new Atom
    a.setAtomicNumber(46)
    a.setSymbol("Pd")
    a.setName("Palladium")
    a.setIUPACGroup(10)
    a.setPeriod(5)
    a.setMass(106.42)
    a.setElectroNegativity(2.2)
    atoms += a

    a = new Atom
    a.setAtomicNumber(47)
    a.setSymbol("Ag")
    a.setName("Silver")
    a.setIUPACGroup(11)
    a.setPeriod(5)
    a.setMass(107.87)
    a.setElectroNegativity(1.93)
    atoms += a

    a = new Atom
    a.setAtomicNumber(48)
    a.setSymbol("Cd")
    a.setName("Cadmium")
    a.setIUPACGroup(12)
    a.setPeriod(5)
    a.setMass(112.41)
    a.setElectroNegativity(1.69)
    atoms += a

    a = new Atom
    a.setAtomicNumber(49)
    a.setSymbol("In")
    a.setName("Indium")
    a.setIUPACGroup(13)
    a.setPeriod(5)
    a.setMass(114.82)
    a.setElectroNegativity(1.78)
    atoms += a

    a = new Atom
    a.setAtomicNumber(50)
    a.setSymbol("Sn")
    a.setName("Tin")
    a.setIUPACGroup(14)
    a.setPeriod(5)
    a.setMass(118.71)
    a.setElectroNegativity(1.96)
    atoms += a

    a = new Atom
    a.setAtomicNumber(51)
    a.setSymbol("Sb")
    a.setName("Antimony")
    a.setIUPACGroup(15)
    a.setPeriod(5)
    a.setMass(121.76)
    a.setElectroNegativity(2.05)
    atoms += a

    a = new Atom
    a.setAtomicNumber(52)
    a.setSymbol("Te")
    a.setName("Tellurium")
    a.setIUPACGroup(16)
    a.setPeriod(5)
    a.setMass(127.6)
    a.setElectroNegativity(2.1)
    atoms += a

    a = new Atom
    a.setAtomicNumber(53)
    a.setSymbol("I")
    a.setName("Iodine")
    a.setIUPACGroup(17)
    a.setPeriod(5)
    a.setMass(126.9)
    a.setElectroNegativity(2.66)
    atoms += a

    a = new Atom
    a.setAtomicNumber(54)
    a.setSymbol("Xe")
    a.setName("Xenon")
    a.setIUPACGroup(18)
    a.setPeriod(5)
    a.setMass(131.29)
    a.setElectroNegativity(2.6)
    atoms += a

    a = new Atom
    a.setAtomicNumber(55)
    a.setSymbol("Cs")
    a.setName("Caesium")
    a.setIUPACGroup(1)
    a.setPeriod(6)
    a.setMass(132.91)
    a.setElectroNegativity(0.79)
    atoms += a

    a = new Atom
    a.setAtomicNumber(56)
    a.setSymbol("Ba")
    a.setName("Barium")
    a.setIUPACGroup(2)
    a.setPeriod(6)
    a.setMass(137.33)
    a.setElectroNegativity(0.89)
    atoms += a

    a = new Atom
    a.setAtomicNumber(57)
    a.setSymbol("La")
    a.setName("Lanthanum")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(138.91)
    a.setElectroNegativity(1.1)
    atoms += a

    a = new Atom
    a.setAtomicNumber(58)
    a.setSymbol("Ce")
    a.setName("Cerium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(140.12)
    a.setElectroNegativity(1.12)
    atoms += a

    a = new Atom
    a.setAtomicNumber(59)
    a.setSymbol("Pr")
    a.setName("Praseodymium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(140.91)
    a.setElectroNegativity(1.13)
    atoms += a

    a = new Atom
    a.setAtomicNumber(60)
    a.setSymbol("Nd")
    a.setName("Neodymium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(144.24)
    a.setElectroNegativity(1.14)
    atoms += a

    a = new Atom
    a.setAtomicNumber(61)
    a.setSymbol("Pm")
    a.setName("Promethium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(144.913)
    a.setElectroNegativity(1.13)
    atoms += a

    a = new Atom
    a.setAtomicNumber(62)
    a.setSymbol("Sm")
    a.setName("Samarium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(150.36)
    a.setElectroNegativity(1.17)
    atoms += a

    a = new Atom
    a.setAtomicNumber(63)
    a.setSymbol("Eu")
    a.setName("Europium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(151.96)
    a.setElectroNegativity(1.2)
    atoms += a

    a = new Atom
    a.setAtomicNumber(64)
    a.setSymbol("Gd")
    a.setName("Gadolinium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(157.25)
    a.setElectroNegativity(1.2)
    atoms += a

    a = new Atom
    a.setAtomicNumber(65)
    a.setSymbol("Tb")
    a.setName("Terbium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(158.93)
    a.setElectroNegativity(1.1)
    atoms += a

    a = new Atom
    a.setAtomicNumber(66)
    a.setSymbol("Dy")
    a.setName("Dysprosium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(162.5)
    a.setElectroNegativity(1.22)
    atoms += a

    a = new Atom
    a.setAtomicNumber(67)
    a.setSymbol("Ho")
    a.setName("Holmium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(164.93)
    a.setElectroNegativity(1.23)
    atoms += a

    a = new Atom
    a.setAtomicNumber(68)
    a.setSymbol("Er")
    a.setName("Erbium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(167.26)
    a.setElectroNegativity(1.24)
    atoms += a

    a = new Atom
    a.setAtomicNumber(69)
    a.setSymbol("Tm")
    a.setName("Thulium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(168.93)
    a.setElectroNegativity(1.25)
    atoms += a

    a = new Atom
    a.setAtomicNumber(70)
    a.setSymbol("Yb")
    a.setName("Ytterbium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(173.05)
    a.setElectroNegativity(1.1)
    atoms += a

    a = new Atom
    a.setAtomicNumber(71)
    a.setSymbol("Lu")
    a.setName("Lutetium")
    a.setIUPACGroup(0)
    a.setPeriod(6)
    a.setMass(174.97)
    a.setElectroNegativity(1.27)
    atoms += a

    a = new Atom
    a.setAtomicNumber(72)
    a.setSymbol("Hf")
    a.setName("Hafnium")
    a.setIUPACGroup(4)
    a.setPeriod(6)
    a.setMass(178.49)
    a.setElectroNegativity(1.3)
    atoms += a

    a = new Atom
    a.setAtomicNumber(73)
    a.setSymbol("Ta")
    a.setName("Tantalum")
    a.setIUPACGroup(5)
    a.setPeriod(6)
    a.setMass(180.95)
    a.setElectroNegativity(1.5)
    atoms += a

    a = new Atom
    a.setAtomicNumber(74)
    a.setSymbol("W")
    a.setName("Wolfram")
    a.setIUPACGroup(6)
    a.setPeriod(6)
    a.setMass(183.84)
    a.setElectroNegativity(2.36)
    atoms += a

    a = new Atom
    a.setAtomicNumber(75)
    a.setSymbol("Re")
    a.setName("Rhenium")
    a.setIUPACGroup(7)
    a.setPeriod(6)
    a.setMass(186.21)
    a.setElectroNegativity(1.9)
    atoms += a

    a = new Atom
    a.setAtomicNumber(76)
    a.setSymbol("Os")
    a.setName("Osmium")
    a.setIUPACGroup(8)
    a.setPeriod(6)
    a.setMass(190.23)
    a.setElectroNegativity(2.2)
    atoms += a

    a = new Atom
    a.setAtomicNumber(77)
    a.setSymbol("Ir")
    a.setName("Iridium")
    a.setIUPACGroup(9)
    a.setPeriod(6)
    a.setMass(192.22)
    a.setElectroNegativity(2.2)
    atoms += a

    a = new Atom
    a.setAtomicNumber(78)
    a.setSymbol("Pt")
    a.setName("Platinum")
    a.setIUPACGroup(10)
    a.setPeriod(6)
    a.setMass(195.08)
    a.setElectroNegativity(2.28)
    atoms += a

    a = new Atom
    a.setAtomicNumber(79)
    a.setSymbol("Au")
    a.setName("Gold")
    a.setIUPACGroup(11)
    a.setPeriod(6)
    a.setMass(196.97)
    a.setElectroNegativity(2.54)
    atoms += a

    a = new Atom
    a.setAtomicNumber(80)
    a.setSymbol("Hg")
    a.setName("Mercury")
    a.setIUPACGroup(12)
    a.setPeriod(6)
    a.setMass(200.59)
    a.setElectroNegativity(2)
    atoms += a

    a = new Atom
    a.setAtomicNumber(81)
    a.setSymbol("Tl")
    a.setName("Thallium")
    a.setIUPACGroup(13)
    a.setPeriod(6)
    a.setMass(204.38)
    a.setElectroNegativity(2.04)
    atoms += a

    a = new Atom
    a.setAtomicNumber(82)
    a.setSymbol("Pb")
    a.setName("Lead")
    a.setIUPACGroup(14)
    a.setPeriod(6)
    a.setMass(207.2)
    a.setElectroNegativity(2.33)
    atoms += a

    a = new Atom
    a.setAtomicNumber(83)
    a.setSymbol("Bi")
    a.setName("Bismuth")
    a.setIUPACGroup(15)
    a.setPeriod(6)
    a.setMass(208.98)
    a.setElectroNegativity(2.02)
    atoms += a

    a = new Atom
    a.setAtomicNumber(84)
    a.setSymbol("Po")
    a.setName("Polonium")
    a.setIUPACGroup(16)
    a.setPeriod(6)
    a.setMass(208.982)
    a.setElectroNegativity(2.2)
    atoms += a

    a = new Atom
    a.setAtomicNumber(85)
    a.setSymbol("At")
    a.setName("Astatine")
    a.setIUPACGroup(17)
    a.setPeriod(6)
    a.setMass(209.987)
    a.setElectroNegativity(2.2)
    atoms += a

    a = new Atom
    a.setAtomicNumber(86)
    a.setSymbol("Rn")
    a.setName("Radon")
    a.setIUPACGroup(18)
    a.setPeriod(6)
    a.setMass(222.018)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(87)
    a.setSymbol("Fr")
    a.setName("Francium")
    a.setIUPACGroup(1)
    a.setPeriod(7)
    a.setMass(223.011)
    a.setElectroNegativity(0.7)
    atoms += a

    a = new Atom
    a.setAtomicNumber(88)
    a.setSymbol("Ra")
    a.setName("Radium")
    a.setIUPACGroup(2)
    a.setPeriod(7)
    a.setMass(226.025)
    a.setElectroNegativity(0.89)
    atoms += a

    a = new Atom
    a.setAtomicNumber(89)
    a.setSymbol("Ac")
    a.setName("Actinium")
    a.setIUPACGroup(3)
    a.setPeriod(7)
    a.setMass(227.028)
    a.setElectroNegativity(1.1)
    atoms += a

    a = new Atom
    a.setAtomicNumber(90)
    a.setSymbol("Th")
    a.setName("Thorium")
    a.setIUPACGroup(0)
    a.setPeriod(7)
    a.setMass(232.04)
    a.setElectroNegativity(1.3)
    atoms += a

    a = new Atom
    a.setAtomicNumber(91)
    a.setSymbol("Pa")
    a.setName("Protactinium")
    a.setIUPACGroup(0)
    a.setPeriod(7)
    a.setMass(231.04)
    a.setElectroNegativity(1.5)
    atoms += a

    a = new Atom
    a.setAtomicNumber(92)
    a.setSymbol("U")
    a.setName("Uranium")
    a.setIUPACGroup(0)
    a.setPeriod(7)
    a.setMass(238.03)
    a.setElectroNegativity(1.38)
    atoms += a

    a = new Atom
    a.setAtomicNumber(93)
    a.setSymbol("Np")
    a.setName("Neptunium")
    a.setIUPACGroup(0)
    a.setPeriod(7)
    a.setMass(237.048)
    a.setElectroNegativity(1.36)
    atoms += a

    a = new Atom
    a.setAtomicNumber(94)
    a.setSymbol("Pu")
    a.setName("Plutonium")
    a.setIUPACGroup(0)
    a.setPeriod(7)
    a.setMass(244.064)
    a.setElectroNegativity(1.28)
    atoms += a

    a = new Atom
    a.setAtomicNumber(95)
    a.setSymbol("Am")
    a.setName("Americium")
    a.setIUPACGroup(0)
    a.setPeriod(7)
    a.setMass(243.061)
    a.setElectroNegativity(1.3)
    atoms += a

    a = new Atom
    a.setAtomicNumber(97)
    a.setSymbol("Bk")
    a.setName("Berkelium")
    a.setIUPACGroup(0)
    a.setPeriod(7)
    a.setMass(247.07)
    a.setElectroNegativity(1.3)
    atoms += a

    a = new Atom
    a.setAtomicNumber(98)
    a.setSymbol("Cf")
    a.setName("Californium")
    a.setIUPACGroup(0)
    a.setPeriod(7)
    a.setMass(251.08)
    a.setElectroNegativity(1.3)
    atoms += a

    a = new Atom
    a.setAtomicNumber(99)
    a.setSymbol("Es")
    a.setName("Einsteinium")
    a.setIUPACGroup(0)
    a.setPeriod(7)
    a.setMass(252.083)
    a.setElectroNegativity(1.3)
    atoms += a

    a = new Atom
    a.setAtomicNumber(100)
    a.setSymbol("Fm")
    a.setName("Fermium")
    a.setIUPACGroup(0)
    a.setPeriod(7)
    a.setMass(257.095)
    a.setElectroNegativity(1.3)
    atoms += a

    a = new Atom
    a.setAtomicNumber(101)
    a.setSymbol("Md")
    a.setName("Mendelevium")
    a.setIUPACGroup(0)
    a.setPeriod(7)
    a.setMass(258.098)
    a.setElectroNegativity(1.3)
    atoms += a

    a = new Atom
    a.setAtomicNumber(102)
    a.setSymbol("No")
    a.setName("Nobelium")
    a.setIUPACGroup(0)
    a.setPeriod(7)
    a.setMass(259.101)
    a.setElectroNegativity(1.3)
    atoms += a

    a = new Atom
    a.setAtomicNumber(103)
    a.setSymbol("Lr")
    a.setName("Lawcrenium")
    a.setIUPACGroup(0)
    a.setPeriod(7)
    a.setMass(262.11)
    a.setElectroNegativity(1.3)
    atoms += a

    a = new Atom
    a.setAtomicNumber(104)
    a.setSymbol("Rf")
    a.setName("Rutherfordium")
    a.setIUPACGroup(4)
    a.setPeriod(7)
    a.setMass(263.113)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(105)
    a.setSymbol("Db")
    a.setName("Dubnium")
    a.setIUPACGroup(5)
    a.setPeriod(7)
    a.setMass(262.114)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(106)
    a.setSymbol("Sg")
    a.setName("Seaborgium")
    a.setIUPACGroup(6)
    a.setPeriod(7)
    a.setMass(266.122)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(107)
    a.setSymbol("Bh")
    a.setName("Bohrium")
    a.setIUPACGroup(7)
    a.setPeriod(7)
    a.setMass(264.125)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(108)
    a.setSymbol("Hs")
    a.setName("Hassium")
    a.setIUPACGroup(8)
    a.setPeriod(7)
    a.setMass(269.134)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(109)
    a.setSymbol("Mt")
    a.setName("Meitnerium")
    a.setIUPACGroup(9)
    a.setPeriod(7)
    a.setMass(268.139)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(110)
    a.setSymbol("Ds")
    a.setName("Darmstadtium")
    a.setIUPACGroup(10)
    a.setPeriod(7)
    a.setMass(272.146)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(111)
    a.setSymbol("Rg")
    a.setName("Roentgenium")
    a.setIUPACGroup(11)
    a.setPeriod(7)
    a.setMass(272.154)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(112)
    a.setSymbol("Cn")
    a.setName("Copernicium")
    a.setIUPACGroup(12)
    a.setPeriod(7)
    a.setMass(277)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(113)
    a.setSymbol("Nh")
    a.setName("Nihonium")
    a.setIUPACGroup(13)
    a.setPeriod(7)
    a.setMass(284)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(114)
    a.setSymbol("Fl")
    a.setName("Flerovium")
    a.setIUPACGroup(14)
    a.setPeriod(7)
    a.setMass(289)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(115)
    a.setSymbol("Mc")
    a.setName("Moscovium")
    a.setIUPACGroup(15)
    a.setPeriod(7)
    a.setMass(288)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(116)
    a.setSymbol("Lv")
    a.setName("Livermorium")
    a.setIUPACGroup(16)
    a.setPeriod(7)
    a.setMass(292)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(117)
    a.setSymbol("Ts")
    a.setName("Tennessin")
    a.setIUPACGroup(17)
    a.setPeriod(7)
    a.setMass(292)
    a.setElectroNegativity(0)
    atoms += a

    a = new Atom
    a.setAtomicNumber(118)
    a.setSymbol("Og")
    a.setName("Oganesson")
    a.setIUPACGroup(18)
    a.setPeriod(7)
    a.setMass(294)
    a.setElectroNegativity(0)
    atoms += a
  }

  def calulateElectroNegativity(a: Atom, b: Atom): Double = {
    if (a.getElectroNegativity > b.getElectroNegativity) a.getElectroNegativity - b.getElectroNegativity
    else b.getElectroNegativity - a.getElectroNegativity
  }

  def isIonicBond(en: Double): Boolean = {
    en >= 1.7
  }

  def isPolarBond(en: Double): Boolean = {
    en > 0.5 && en < 1.7
  }
}