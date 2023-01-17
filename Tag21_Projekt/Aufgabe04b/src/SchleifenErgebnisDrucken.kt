//todo: Betrachtet den Code in 401_SchleifenErgebnisDrucken und führt ihn aus.
// Hier geht es darum, zu verstehen, dass Zwischenergebnisse innerhalb der Schleife sowie das Endergebnis außerhalb der
// Schleife weiterverwendet werden können.
// Setzt einen Breakpoint in Zeile 6 (13) und geht mit dem Debugger beide Schleifen Schritt für Schritt durch, um
// nachzuvollziehen, was genau beim Schleifendurchlauf geschieht.
// Beantwortet danach die Fragen im Code.

fun main(){
    println("Hier drucken wir jede Erhöhung von i aus:")
    var wirdInSchleifeGedruckt = 1
    while (wirdInSchleifeGedruckt <= 3){
        println("i ist jetzt " + wirdInSchleifeGedruckt)
        wirdInSchleifeGedruckt++
    }

    println("Hier drucken wir nur das Endergebnis aus:")
    var wirdNachSchleifeGedruckt = 1
    while (wirdNachSchleifeGedruckt < 3){
        wirdNachSchleifeGedruckt++
    }
    println(wirdNachSchleifeGedruckt)


    /* FRAGEN:
    * 1. Schaut mit dem Debugger nach, welchen Wert hat wirdInSchleifeGedruckt am Ende der Schleife hat. Warum wird nicht dieser Wert geprinted?
    *
    * -> hat den Wert 4 und wird nicht ausgedruckt, weil in der Zeile 4 (in meinem Fall Zeile 11) geprüft wird, ob der Wert <=3 ist.
    * -> bei der Prüfung kommt raus, dass der wert 4 beträgt (4<=3) und somit wird die schleife bei 3 beendet (terminiert).
    *
    * 2. Warum wird in der 1. Schleife <= und in der 2. < verwendet, aber trotzdem enden beide bei 3? Nehmt den Debugger zur Hilfe, um nachzuvollziehen, was passiert.
    *
    * -> weil in der 1. schleife der wert bei der letzten prüfung 4<=3 beträgt und somit die letzte wahre (true) antwort
    * geprintet wird und bei der 2. schleife wird geprüft, ob der wert 3<3 ist. dies schlägt fehl und der letzte bekannte
    * wert wird ausgedruckt. also 3
    *
    * Probiert gerne ein bisschen mit den größer/kleiner Operatoren und der Reihenfolge von Zeile 7 und 8 herum.
    * */

}