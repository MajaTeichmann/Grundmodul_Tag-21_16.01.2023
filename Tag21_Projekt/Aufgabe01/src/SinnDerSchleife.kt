//todo: Wir wollen ein Programm benutzen, das für uns in der Konsole von 1 bis 10 hochzählt. Dazu haben wir zwei
// Funktionen in 1_SinnDerSchleife implementiert.
// Schau dir beide Funktionen an und rufe sie nacheinander in main() auf und beantworte die Fragen unter main() im Code!

fun einsBisZehnOhneSchleife(){
    println(1)
    println(2)
    println(3)
    println(4)
    println(5)
    println(6)
    println(7)
    println(8)
    println(9)
    println(10)
}

fun einsBisZehnMitSchleife(){
    var counter = 1
    while (counter <= 10){
        println(counter)
        counter++
    }
}

fun main () {
// hier beide Funktionen nacheinander aufrufen!
    einsBisZehnOhneSchleife()
    einsBisZehnMitSchleife()

    // Antwort:
    println("Antwort: Wir sparen mit der Schleife 6 Zeilen Code!")
    println("""
        |Die Vorteile sind weniger Schreibarbeit und eine schlauere Lösung, wenn wir bis mehr als 10 zählen wollen!
        |Wenn wir nämlich bis 100 zählen wollen, bleibt bei der Funktion einsBisZehnMitSchleife die Codezeilen-Anzahl gleich.
        |Bei der anderen Funktion müssten wir 90 weitere Zeilen Code schreiben!""".trimMargin())
}

/* beantworte hier folgende Fragen:
  Wie viele Zeilen Code sparen wir, indem wir die Schleife benutzen?
  Was sind die Vorteile der Schleifen? */


