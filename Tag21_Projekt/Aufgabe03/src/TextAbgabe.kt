//todo: Für die nächsten Aufgaben sollst du vorhersagen, wie sich das vorgegebene Programm im nächsten Schritt verhalten wird.
// Dabei ist die Stelle, an der sich das Programm gerade befindet mit einem Pfeil (“->”) markiert.
// Gib als Antwort die nächste Anweisung an, die das Programm ausführen wird.
// Danach sollt ihr einfach in euren eigenen Worten schreiben, was die Schleife als nächstes macht.
// Welchen Wert hat i am Ende?

/*
fun main () {
-> var i ㅤ: Int = 0
   while (i < 5)ㅤ {
       i++ㅤ
   }
}
*/

// zum testen
fun main () {
    var i : Int = 0
    while (i < 5){
        println(i)
        i++
    }
}

/*
    Schreibe hier deine Antwort auf:

    Was macht die Schleife als nächstes?
    Antwort:
    -> Die Schleife prüft den aktuellen Wert von i (0)
    -> i wird um 1 erhöht (von 0 auf 1)

    -> Die Schleife prüft den aktuellen Wert von i (1)
    -> i wird um 1 erhöht (von 1 auf 2)

    -> Die Schleife prüft den aktuellen Wert von i (2)
    -> i wird um 1 erhöht (von 2 auf 3)

    -> Die Schleife prüft den aktuellen Wert von i (3)
    -> i wird um 1 erhöht (von 3 auf 4)

    -> Die Schleife prüft den aktuellen Wert von i (4)
    -> i wird um 1 erhöht (von 4 auf 5)

    -> Die Schleife prüft den aktuellen Wert von i (5)
    -> Schleife wird abgebrochen, weil i nun nicht mehr < 5 ist! (5 < 5)

    Welche Bedingung muss erfüllt sein, damit die Schleife terminiert (= abbricht und beendet ist)?
    Antwort:
    -> i muss den Wert 5 erreichen

    Welchen Wert hat i also am Ende, wenn die Schleife terminiert?
    Antwort:
    -> i = 5
 */