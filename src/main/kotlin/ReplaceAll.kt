package org.example



fun main(){
  val playerList = listOf<Player>(
      Player(1, 200, 35000, "Goutham", "ABC"),
      Player(2,250,42000,"nagu","DC"),
      Player(3,100,30000,"umesh","fgh")
  )

    val updatedPlayers = replaceTeam(playerList, "SRH")
    updatedPlayers.forEach { player-> println(player)}
}
fun replaceTeam(list: List<Player>, newTeam: String) : List<Player> {
     return list.map { player -> player.copy(team = newTeam)}
}