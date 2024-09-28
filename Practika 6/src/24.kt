import kotlin.random.Random

fun main() {
    val Matrix = arrayOf(
        Array<Int>(5, { Random.nextInt(-100, 100) }),
        Array<Int>(5, { Random.nextInt(-100, 100) })
    )
    println("Начальная матрица: ")
    printMatrix(Matrix)

    val transposMatrix = transposeMatrix(Matrix)

    println("Транспонированная матрица:")
    printMatrix(transposMatrix)
}

fun transposeMatrix(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val numRows = matrix.size
    val numCols = matrix[0].size
    val transposed = Array(numCols) { Array(numRows) { 0 } } // создаём новую матрицу транспонированного размера

    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            transposed[j][i] = matrix[i][j]
        }
    }
    return transposed
}

fun printMatrix(matrix: Array<Array<Int>>) {
    for (row in matrix) {
        println(row.joinToString(", "))
    }
}