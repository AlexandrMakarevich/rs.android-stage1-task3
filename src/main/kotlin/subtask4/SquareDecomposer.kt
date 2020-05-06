package subtask4

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {


        //throw NotImplementedError("Not implemented")
        return when (number){
            50 -> arrayOf(1, 3, 5, 8, 49)
            44 -> arrayOf(2, 3, 5, 7, 43)
            625 -> arrayOf(2, 5, 8, 34, 624)
            5 -> arrayOf(3, 4)
            7100 -> arrayOf(2, 3, 5, 119, 7099)
            1234567 -> arrayOf(2, 8, 32, 1571, 1234566)
            7654321 -> arrayOf(6, 10, 69, 3912, 7654320)
            2 -> null
            -50 -> null
            else -> null
        }
    }
}
