package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var resultString = a
        resultString = resultString.toUpperCase()
        resultString = resultString.filter  { c -> b.contains(c) }
        print(resultString)
        return if(resultString == b) return "YES"
        else "NO"

    }
}
