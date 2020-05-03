package subtask1

import kotlin.math.abs

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        val finalString: StringBuilder = java.lang.StringBuilder()

        if (numbers.isEmpty()) return null
        for (i in numbers.indices){
            println("${numbers[i]}  i==$i")

            if (numbers[i] == 0) continue

            if (numbers[i] > 0 && i!=0) {
                finalString.append(" +")
            } else if (numbers[i] < 0 && i!=0) finalString.append(" -")

            when {
                i == numbers.size-1 -> finalString.append(" ${numbers[i]}")

                abs(numbers[i]) !=1 -> {
                    finalString.append(" ${abs(numbers[i])}")

                    if (i == numbers.size - 2)  finalString.append("x")
                    else finalString.append("x^${numbers.size-1-i}")}

                else -> finalString.append(" x")
            }
        }
        finalString.deleteCharAt(0)
        println(finalString)
        return finalString.toString()
    }
}
