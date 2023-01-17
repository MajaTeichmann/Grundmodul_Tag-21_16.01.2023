// todo: In dieser Aufgabe sollst du nun selber deine erste while-Schleife in main() implementieren.
//  Diesmal wollen wir von 10 bis 1 rückwärts runterzählen. Befolge einfach die folgenden Schritte:
//  Initialisiere dazu zuerst den Integer “backwardCounter” mit dem Wert “10”.
//  Solange “backwardCounter” größer ist als 0 soll die Schleife weiterlaufen.
//  Bei jedem Schleifendurchlauf soll zunächst der aktuelle Wert von “backwardCounter” mithilfe von “println()”
//  ausgegeben werden und danach der Wert von “backwardCounter” um 1 verringert werden.

fun main () {
//Implementiere hier die while-Schleife wie in der Aufgabe beschrieben
    var backwardsCount: Int = 10

    while(backwardsCount > 0){
    println(backwardsCount)
        backwardsCount--
    }
}