//todo: In dieser Aufgabe ist nur eine Liste vorgegeben. Du sollst jetzt eine while-Schleife implementieren, die jedes
// einzelne Element der Liste mithilfe von println ausgibt.

fun main () {
    val list : List<Int> = listOf(0,1,2,3,4,5)
    //Implementiere unter diesem Kommentar eine Schleife, die die Liste oben auslesen kann

    var i: Int = 0

    while(i in list){
        println(list[i])
        i++
    }
}