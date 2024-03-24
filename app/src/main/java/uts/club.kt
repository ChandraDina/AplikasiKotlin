package club

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
