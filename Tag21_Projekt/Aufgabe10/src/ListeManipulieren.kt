//todo: In dieser Aufgabe ist fast dieselbe Liste wie in der letzten Aufgabe gegeben, nur ist sie jetzt eine MutableList.
// Mit Hilfe einer while-Schleife sollst du jetzt jedes Element um 3 erhöhen und dann wieder mit println ausgeben.

fun main () {
    var list : MutableList<Int> = mutableListOf(0,1,2,3,4,5)
    //Implementiere unter diesem Kommentar die in der Aufgabe beschriebene while-Schleife

    var i: Int = 0

    println(list)

    while(i < list.size){
        list.set(i, (list[i]+3))
        i++
    }
    println(list)
}