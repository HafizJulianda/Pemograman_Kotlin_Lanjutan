fun main(args: Array<String>) {
    //Array
    var arrA = arrayOf<Int>()
    arrA += 34
    println(arrA[0])

    var arrB = arrayOf<Int>()
    for (i in 1..10) {
        arrB += i
    }

    for (i in arrB) {
        print("$i ")
    }
    val asc = Array(5) {
            i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}