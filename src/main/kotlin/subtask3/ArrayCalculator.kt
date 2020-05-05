package subtask3

import kotlin.math.abs

class ArrayCalculator {

    // TODO: Complete the following function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        val intArray: MutableList<Int> = arrayListOf()
        val rezArray: ArrayList<Int> = arrayListOf()
        var maxElement: Int


        val rez: Int
        for (item in itemsFromArray) {
            if (item is Int) intArray.add(item)
        }

        if (intArray.isEmpty()) {            // if empty return "0"
            return 0
        }
        if (numberOfItems > intArray.size) {
            rez = product(intArray)
            return rez
        }

        for (item in intArray) println(item) // print start array
        println()

        for (i in 0 until numberOfItems) {
            maxElement = abs(intArray[0])
            for (j in 0 until intArray.size) {
                if (abs(intArray[j]) >= abs(maxElement)) maxElement = intArray[j]
            }
            rezArray.add(maxElement)
            intArray.remove(maxElement)
        }

        var countNegative = 0     // count number of negative
        for (item in rezArray) {
            if (item < 0) countNegative += 1
        }

        if (countNegative % 2 == 0) {
            rez = product(rezArray)
           // return rez
        }  else {
            val minElement: Int = rezArray.min()!!
            rezArray.remove(minElement)
            rezArray.add(intArray.max()!!)
            rez = product(rezArray)
        }





        for (item in rezArray) println(item)
        println()
        for (item in intArray) println(item)



        return rez
        //throw NotImplementedError("Not implemented")
    }

    private fun product(rezArray: MutableList<Int>): Int {
        var product = 1
        for (item in rezArray)
            product *= item
        return product
    }

}
