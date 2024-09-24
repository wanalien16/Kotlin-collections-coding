package org.example

fun main(){
    val playerList = listOf<Player>(
        Player(1, 200, 35000, "Goutham", "ABC"),
        Player(2,250,42000,"nagu","DC"),
        Player(3,100,30000,"umesh","fgh")
    )

    val teamToReplace = "DC"
    val newTeam = "SRH"

    val updatedList = replaceNewTeam(playerList, teamToReplace, newTeam)
    updatedList.forEach { println(it) }

}

fun replaceNewTeam(players: List<Player>, oldTeam: String, newTeam: String) : List<Player> {
    return players.map { player-> if (player.team == oldTeam) {
        player.copy(team = newTeam)
    }else
        player
    }
}