//todo: In dieser Aufgabe ist eine MutableList gegeben. Schreibe eine Funktion namens "addiereFuenf", die eine
// MutableList als Parameter übergeben bekommt, mit Hilfe einer Schleife jedes Element um 5 erhöht und die modifizierte
// Liste am Ende zurückgibt.

fun main(){
    var list: MutableList<Int> = mutableListOf(10,20,30,40,50)
    addiereFuenf(list)
}

fun addiereFuenf(liste: MutableList<Int>){
    var i: Int = 0

    println(liste)

    while(i < liste.size){
        liste.set(i, (liste[i]+5))
        i++
    }
    println(liste)
}