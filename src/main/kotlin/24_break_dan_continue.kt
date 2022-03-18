fun main() {
    var x:Int
    println("Example of Break and Continue in Foor-loop")
    for(x in 1..10){
        //Break
        if(x == 7) break

        //Continue
        if(x == 3) continue
        print("$x ")
    }
    print('\n')
}