fun main() {
    //Masukkan nilai a = 5 dan b= 3
    var (x, y) = bigSmall(5,3)
    println("Nilai x = $x")
    println("Nilai x = $y")
}

fun bigSmall(a: Int, b:Int) : Pair<Int, Int> {
    if(a > b) return Pair(a,b)
    else {
        return Pair(b,a)
    }
}