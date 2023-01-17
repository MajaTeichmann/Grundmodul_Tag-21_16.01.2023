//todo: In dieser Aufgabe wird die Schleife benutzt, um jedes Element in einer Liste zu betrachten.
// Schaut euch den Code genau an und versteht, was passiert.
// Ihr findet zudem eine Anleitung, wie man Schleifen implementiert.
// Guckt euch den Code genau an und geht nochmal mit dem Debugger drüber, um jeden Schritt nachzuvollziehen und
// beantwortet die Verständnisfragen am Ende des Codes!

fun main(){

    val wochenTage: List<String> = listOf("Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag")

    // ---- Vorgehen beim Schleifen implementieren ----
    // 1. Laufvariable erstellen: heißt meistens einfach "i", das steht für für Iterator

    var i: Int = 0

    // 2. Schleifenbedingung überlegen: Die Schleife soll nicht unendlich weiterlaufen.
    // Wir wollen die Liste wochenTage durchgehen. Das heißt, die Schleife soll so lange laufen, wie die Liste lang ist. Deshalb:

    while (i <= wochenTage.size){

        // 3. Anweisung, was ausgeführt werden soll. Wir wollen jedes Element der Liste, also jeden Wochentag, ausprinten.
        // Dafür können wir jetzt praktischerweise einfach i an die Stelle des ListenIndex schreiben:
        println(wochenTage[i])

        // 4. wichtig, damit die Schleife nicht unendlich weiterläuft und damit nicht immer derselbe Wochentag ausgegeben wird: i erhöhen!
        i++
    }
}
/* Fertig ist die Schleife! Noch eine Verständnisfrage:
    Warum verwenden wir
    (i < wochenTage.size) und nicht etwa
    (i <= wochenTage.size)?

    -> i ist der index in unserer liste, daher haben wir keinen index von 7 (0-6)

    Probiert aus, was passiert, wenn ihr den < Operator durch <= ersetzt und beantwortet, welcher Fehler auftritt und weshalb!

    -> bei 7<=7 bekommen wir eine IndexOutOfBoundException
    (Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7)

*/

