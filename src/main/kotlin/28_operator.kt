fun main() {
    //Null Safety
    //The !! operator
    var maybeNumber:Int? = 15
    println(maybeNumber!! * 2)

    maybeNumber = null
    //println dibawah diberi komentar, karena ketika di running program akan error karena println dilakukan 2 kali
  //  println(maybeNumber!! * 2)
}

