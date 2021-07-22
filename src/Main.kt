fun main() {
    print(firstDigit("var_1__Int"))
}

fun firstDigit(inputString: String): Char {
    var m:Char='f'
    for(i in 0 until inputString.length)
        if(inputString[i].isDigit()){
            m=inputString[i]
            break}
    return m
}
