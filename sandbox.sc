class User(name: String) {

  override def toString = name

}

val jacek = new User(name = "Jacek")
println("wita cie " + jacek.toString)