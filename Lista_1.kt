fun main(){
    //Zadanie 1
    for(i in 0..100){
        println(dzielniki_1(i))
    }

    //Zadanie 2
    for(i in 0..200){
        println(dzielniki_2(i))
    }

    //Zadanie 3
    for(i in 0..1000){
        println(dzielniki_3(i))
    }
}

//Zadanie 1

fun dzielniki_1(arg: Int) = when {
    arg == 0 -> "$arg"
    arg % 3 == 0 -> "trzy"
    arg % 5 == 0 -> "piec"
    arg % 3 == 0 && arg % 5 == 0 -> "trzypiec"
    else -> "$arg"
}

//Zadanie 2

fun dzielniki_2(arg: Int) = when {
    arg == 0 -> "$arg"
    arg % 3 == 0 -> "trzy"
    arg % 5 == 0 -> "piec"
    arg % 7 == 0 -> "siedem"
    arg % 3 == 0 && arg % 5 == 0 -> "trzypiec"
    arg % 3 == 0 && arg % 7 == 0 -> "trzysiedem"
    arg % 5 == 0 && arg % 7 == 0 -> "piecsiedem"
    else -> "$arg"
}

//Zadanie 3

fun dzielniki_3(arg: Int) = when {
    arg == 0 -> "$arg"
    arg % 3 == 0 -> "trzy"
    arg % 5 == 0 -> "piec"
    arg % 7 == 0 -> "siedem"
    arg % 11 == 0 -> "jedenascie"
    arg % 13 == 0 -> "trzynascie"
    arg % 3 == 0 && arg % 5 == 0 -> "trzypiec"
    arg % 3 == 0 && arg % 7 == 0 -> "trzysiedem"
    arg % 5 == 0 && arg % 7 == 0 -> "piecsiedem"
    arg % 3 == 0 && arg % 5 == 0 && arg % 7 == 0 -> "trzypiecsiedem"
    arg % 3 == 0 && arg % 11 == 0 -> "trzyjedenascie"
    arg % 3 == 0 && arg % 13 == 0 -> "trzytrzynascie"
    arg % 5 == 0 && arg % 11 == 0 -> "piecjedenascie"
    arg % 5 == 0 && arg % 13 == 0 -> "piectrzynascie"
    arg % 7 == 0 && arg % 11 == 0 -> "siedemjedenascie"
    arg % 7 == 0 && arg % 13 == 0 -> "siedemtrzynascie"
    arg % 3 == 0 && arg % 5 == 0 && arg % 11 == 0 -> "trzypiecjedenascie"
    arg % 3 == 0 && arg % 5 == 0 && arg % 13 == 0 -> "trzypiectrzynascie"
    arg % 3 == 0 && arg % 7 == 0 && arg % 11 == 0 -> "trzysiedemjedenascie"
    arg % 3 == 0 && arg % 7 == 0 && arg % 13 == 0 -> "trzysiedemtrzynascie"
    arg % 5 == 0 && arg % 7 == 0 && arg % 11 == 0 -> "piecsiedemjedenascie"
    arg % 5 == 0 && arg % 7 == 0 && arg % 13 == 0 -> "piecsiedemtrzynascie"
    arg % 3 == 0 && arg % 5 == 0 && arg % 7 == 0 && arg % 11 == 0 -> "trzypiecsiedemjedenascie"
    arg % 3 == 0 && arg % 5 == 0 && arg % 7 == 0 && arg % 13 == 0 -> "trzypiecsiedemtrzynascie"
    else -> "$arg"
}