
package uts

// Data class Club untuk menyimpan data klub dan perolehan trofi
data class Club(
    val name: String,
    val premierLeague: Int,
    val faCup: Int,
    val eflCup: Int,
    val championsLeague: Int,
    val europaLeague: Int
) {
    // Property dengan custom getter untuk menampilkan jumlah total trofi
    val totalTrophy: Int
        get() = premierLeague + faCup + eflCup + championsLeague + europaLeague
}

// Extension function recap untuk menampilkan rekap perolehan trofi klub
fun Club.recap(): String {
    return "$name berhasil meraih $premierLeague trofi Liga Primer Inggris, " +
            "$faCup trofi FA, $eflCup trofi EFL, " +
            "$championsLeague trofi Liga Champions, dan " +
            "$europaLeague trofi Liga Eropa UEFA"

}
fun main() {
    val liverpool = Club("Liverpool", 19, 8, 9, 6, 3)
    println(liverpool.recap())
}