
fun main() {
    // Zadanie 1

    val tab: IntArray = intArrayOf(0, 1, 2, 3, 4, 5, 6)
    println(missingNumber(tab))

    // Zadanie 2
    val tab2: List<Int> = listOf(0, 1, 1, 1, 4, 4, 4, 9, 3, 3, 3, 3, 3, 3)
    val duplicates = findDuplicates(tab2)
	println(duplicates)
    
    // Zadanie 3
    println(addToBoolean())

    // Zadanie 3 Alternatywnie
    println(addToBoolean_A())

    // Zadanie 3 Alternatywnie
    println(addToBoolean_B())

    // Zadanie 3 Alternatywnie
    println(addToBoolean_C())
}
// Zadanie 1

fun missingNumber(numbers: IntArray): Int {
    // Weryfikacja wejścia
    require(numbers.isNotEmpty()) { "Tablica nie może być pusta." }
    require(numbers.none { it < 0 }) { "Tablica nie może zawierać liczb ujemnych." }
    require(numbers.size > 1) { "Tablica powinna zawierać co najmniej dwa elementy." }

    // Sprawdzenie, czy wszystkie elementy są unikalne
    require(numbers.toSet().size == numbers.size) { "Tablica powinna zawierać tylko unikalne elementy." }

    // Posortuj tablicę w celu uporządkowania elementów
    val sortedNumbers = numbers.sorted()

    // Sprawdź, czy brakuje tylko jednego elementu
    if (sortedNumbers.last() != numbers.size) {
        return numbers.size
    }
    for (i in 0 until sortedNumbers.size - 1) {
        if (sortedNumbers[i + 1] - sortedNumbers[i] > 1) {
            return sortedNumbers[i] + 1
        }
    }

    // Jeśli brakujący element to pierwszy element tablicy, zwróć 0
    return if (sortedNumbers[0] == 1) 0 else sortedNumbers.last() + 1
}

// Zadanie 2

fun findDuplicates(list: List<Int>): Set<Int>{
    val seen: MutableSet<Int> = mutableSetOf()
    return list.filter { !seen.add(it) }.sorted().toSet()
}

// Zadanie 3 - Czas wykonania: 6.504021 ms
fun addToBoolean(): Map<Int, Boolean>{
    val arr = IntArray(21) { it * 1 }
    val map = buildMap<Int, Boolean>(arr.size) {
        for(i: Int in arr)
            if(i % 2 == 0) { put(i, true) }
            else { put(i, false) }
     }
     return map
}

// Zadanie 3 Alternatywnie - Czas wykonania: 20.816259 ms
fun addToBoolean_A(): Map<Int, Boolean> {
    return (0..20).associateWith { it % 2 == 0 }
}

// Zadanie 3 Alternatywnie - Czas wykonania: 10.478232 ms
fun addToBoolean_B(): Map<Int, Boolean> {
    val arr = IntArray(21) { it * 1 }
    val map = arr.map { i -> i to (i % 2 == 0) }.toMap()
    return map
}

// Zadanie 3 Alternatywnie - Czas wykonania: 0.091703 ms
fun addToBoolean_C(): Map<Int, Boolean>{
    val arr = IntArray(21) { it * 1 }
    val map = mutableMapOf<Int, Boolean>()
    for(i in arr) {
        map[i] = i % 2 == 0
    }
    return map
}



