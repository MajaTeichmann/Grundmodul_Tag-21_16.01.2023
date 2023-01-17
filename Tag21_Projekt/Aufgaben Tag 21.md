
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Schleifen</h3>
<br>

<p align="center">
  <img src="img/img.png" />
</p>

#### Beschreibung:

Willkommen zurück zu den Übungen an Tag 21. Heute geht es rund um die While-Schleife. Wir wünschen euch viel Spaß bei den Aufgaben.




#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Schleifen → Verstehen → Programmfluss und Laufvariablen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.khc665cedvja)
  - [Handbuch: Schleifen → Implementieren → Laufvariablen implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.4b4isj8cze29)
  - [Handbuch: Schleifen → Implementieren → while-Schleife implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.hf34b5wgif84)
  - [Handbuch: Listen → Implementieren → Größe einer Liste lesen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.bvtmwoufzcex)
  - [Handbuch: Listen → Implementieren:MutableList → Wert in MutableList an Index ändern](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.x824jd5wl02t)

---

<details>
<summary> <b> Aufgabe 1 - Der Sinn der Schleife: Code verstehen </b> </summary>

Wir wollen ein Programm benutzen, das für uns in der Konsole von 1 bis 10 hochzählt.
Dazu haben wir zwei Funktionen in 1_SinnDerSchleife implementiert.

Schau dir beide Funktionen an und rufe sie nacheinander in main() auf und beantworte die Fragen unter main() im Code!


**Datei für die Aufgabe:** *ModulA -> 1_SinnDerSchleife.kt*

</details>

---

<details>
<summary> <b> Aufgabe 2 - While-Schleife implementieren </b> </summary>

In dieser Aufgabe sollst du nun selber deine erste while-Schleife in main() implementieren.
Diesmal wollen wir von 10 bis 1 rückwärts runterzählen. 
Befolge einfach die folgenden Schritte:

1. Initialisiere dazu zuerst den Integer “backwardCounter” mit dem Wert “10”.
2. Solange “backwardCounter” größer ist als 0 soll die Schleife weiterlaufen.
3. Bei jedem Schleifendurchlauf soll zunächst der aktuelle Wert von “backwardCounter” mithilfe von “println()” ausgegeben werden und danach der Wert von “backwardCounter” um 1 verringert werden.

**Datei für die Aufgabe:** *ModulA -> 2_WhileSchleife.kt*

</details>

---

<details>
<summary> <b> Aufgabe 3 - Vorhersagen, wohin Programmfluss als nächstes springen wird </b> </summary>

Für die nächsten Aufgaben sollst du vorhersagen, wie sich das vorgegebene Programm im nächsten Schritt verhalten wird.
Dabei ist die Stelle, an der sich das Programm gerade befindet mit einem Pfeil (“->”) markiert.
Gib als Antwort die nächste Anweisung an, die das Programm ausführen wird.

Danach sollt ihr einfach in euren eigenen Worten schreiben, was die Schleife als nächstes macht.
Welchen Wert hat i am Ende?

```
fun main () {
-> var i ㅤ: Int = 0
   while (i < 5)ㅤ {
       i++ㅤ
   }
}
```

**Datei für die Aufgabe:** *ModulA -> 3_AbgabeText*

</details>

---

<details>
<summary> <b> Aufgabe 4a - Vorhersagen, wohin Programmfluss als nächstes springen wird </b> </summary>

Für die nächsten Aufgaben sollst du vorhersagen, wie sich das vorgegebene Programm im nächsten Schritt verhalten wird.
Dabei ist die Stelle, an der sich das Programm gerade befindet mit einem Pfeil (“->”) markiert.
Gib als Antwort die nächste Anweisung an, die das Programm ausführen wird.

Auch hier sollt ihr einfach in euren eigenen Worten schreiben, was die Schleife als nächstes macht.

```
fun mainㅤ () {
-> var i : Int = 2ㅤ
   while (i < 2) {
       i++ㅤ
   }
   println(i)
}
```

**Datei für die Aufgabe:** *ModulA -> 4_AbgabeText*

</details>

---

<details>
<summary> <b> Aufgabe 4b - Code verstehen: Ergebnisse ausgeben </b> </summary>

Betrachtet den Code in 401_SchleifenErgebnisDrucken und führt ihn aus.

Hier geht es darum, zu verstehen, dass Zwischenergebnisse innerhalb der Schleife sowie das Endergebnis außerhalb der Schleife weiterverwendet werden können.

Setzt einen Breakpoint in Zeile 6 und geht mit dem Debugger beide Schleifen Schritt für Schritt durch, um nachzuvollziehen, was genau beim Schleifendurchlauf geschieht.

Beantwortet danach die Fragen im Code.

**Datei für die Aufgabe:** *ModulA -> 4b_SchleifenErgebnisDrucken*

</details>

---

<details>
<summary> <b> Aufgabe 5 - Vorhersagen, wohin Programmfluss als nächstes springen wird </b> </summary>

Für die nächsten Aufgaben sollst du vorhersagen, wie sich das vorgegebene Programm im nächsten Schritt verhalten wird.
Dabei ist die Stelle, an der sich das Programm gerade befindet mit einem Pfeil (“->”) markiert.
Gib als Antwort die nächste Anweisung an, die das Programm ausführen wird.

Auch hier sollt ihr einfach in euren eigenen Worten schreiben, was die Schleife als nächstes macht.

```
fun main ㅤㅤ() {
   var i : Int = 1
   while (i < 2) {
 ->    i++ㅤ
   }
   println(i)
}
```

**Datei für die Aufgabe:** *ModulA -> 5_AbgabeText*

</details>

---

<details>
<summary> <b> Aufgabe 6 - Vorhersagen, was die Schleife ausgeben wird </b> </summary>

In dieser Aufgabe sollst du wieder Vorhersagen über das Programmverhalten treffen.
Schau dir den Code unten an und gib als Antwort an, welchen Wert die Variable “i” am Ende angenommen hat.


```
fun main ㅤ() {
   var i : Int = 0
   while (i < ㅤ1) {
       i++
   }
```

**Datei für die Aufgabe:** *ModulA -> 6_AbgabeText*

</details>

---

<details>
<summary> <b> Aufgabe 7 - Vorhersagen, was die Schleife ausgeben wird </b> </summary>

In dieser Aufgabe sollst du wieder Vorhersagen über das Programmverhalten treffen.
Schau dir den Code unten an und gib als Antwort an, welchen Wert die Variable “i” am Ende angenommen hat.

```
fun ㅤㅤmain () {
   var i : Int = 0
   while ㅤ(i > 1) {
     ㅤㅤ  i++
   }
}
```

**Datei für die Aufgabe:** *ModulA -> 7_AbgabeText*

</details>

---

<details>
<summary> <b> Aufgabe 8a - Vorhersagen, was die Schleife ausgeben wird </b> </summary>

In dieser Aufgabe sollst du wieder Vorhersagen über das Programmverhalten treffen.
Schau dir den Code unten an und gib als Antwort an, welchen Wert die Variable “i” am Ende angenommen hat.

```
fun mainㅤㅤㅤㅤ() {
   var i : ㅤInt = 0
   while ㅤ(i <= 4) ㅤ{
       i += ㅤ2
   }
}
```

**Datei für die Aufgabe:** *ModulA -> 8_AbgabeText*

</details>

---

<details>
<summary> <b> Aufgabe 8b - Code verstehen: Liste durchlaufen </b> </summary>

In dieser Aufgabe wird die Schleife benutzt, um jedes Element in einer Liste zu betrachten. Schaut euch den Code genau an und versteht, was passiert.

Ihr findet zudem eine Anleitung, wie man Schleifen implementiert.

Guckt euch den Code genau an und geht nochmal mit dem Debugger drüber, um jeden Schritt nachzuvollziehen und beantwortet die Verständnisfragen am Ende des Codes!

**Datei für die Aufgabe:** *ModulA -> 8b_ListeDurchlaufen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 9 - Schleife “Liste lesen” entwerfen </b> </summary>

In dieser Aufgabe ist nur eine Liste vorgegeben. Du sollst jetzt eine while-Schleife implementieren, die jedes einzelne Element der Liste mithilfe von println ausgibt.

**Datei für die Aufgabe:** *ModulA -> 9_ListeLesen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 10 - Schleife “Liste manipulieren” entwerfen </b> </summary>

In dieser Aufgabe ist fast dieselbe Liste wie in der letzten Aufgabe gegeben, nur ist sie jetzt eine MutableList. Mit Hilfe einer while-Schleife sollst du jetzt jedes Element um 3 erhöhen und dann wieder mit println ausgeben.

**Datei für die Aufgabe:** *ModulA -> 10_ListeManipulieren*

</details>

---

<details>
<summary> <b> Aufgabe 11 - Elemente der Liste um 5 erhöhen entwerfen </b> </summary>

In dieser Aufgabe ist eine MutableList gegeben. Schreibe eine Funktion namens "addiereFuenf", die eine MutableList als Parameter übergeben bekommt, mit Hilfe einer Schleife jedes Element um 5 erhöht und die modifizierte Liste am Ende zurückgibt.

**Datei für die Aufgabe:** *ModulA -> 11_ElementeErhöhen*

</details>

---

<details>
<summary> <b> Aufgabe 12 - Liste rückwärts ausgeben </b> </summary>

In dieser Aufgabe ist eine List mit Elementen des Datentyps String gegeben. Vervollständige die Funktion namens "satzAusgabe", die eine List als Parameter übergeben bekommt und folgende Anweisungen ausführt:

1. folgendes in die Konsole printen: "Ursprünglicher Satz: $umgedrehterSatz"
2. mit Hilfe einer Schleife jedes Element von hinten nach vorne in einer neuen Liste(!) namens "lesbarerSatz" speichern
3. in die Konsole printen: "Korrekter Satz: $lesbarerSatz"

**Datei für die Aufgabe:** *ModulA -> 12_SatzKorrektAusgeben*

</details>

---
