//todo: In dieser Aufgabe ist eine List mit Elementen des Datentyps String gegeben.
// Vervollständige die Funktion namens "satzAusgabe", die eine List als Parameter übergeben bekommt und folgende
// Anweisungen ausführt:
// folgendes in die Konsole printen: "Ursprünglicher Satz: $umgedrehterSatz"
// mit Hilfe einer Schleife jedes Element von hinten nach vorne in einer neuen Liste(!) namens "lesbarerSatz" speichern
// in die Konsole printen: "Korrekter Satz: $lesbarerSatz"

fun main(){
    var umgedrehterSatz = listOf(".", "rückwärts ", "mehr", "nicht", "ist ", "Satz ", "Dieser ")
    satzAusgabe(umgedrehterSatz)
}

fun satzAusgabe(list: List<String>){
    // hier dein code
    println("Ursprünglicher Satz: $list")
    var lesbarerSatz = list.asReversed()
    while(lesbarerSatz == list.asReversed())
        break
    println("Korrekter Satz: $lesbarerSatz")
}