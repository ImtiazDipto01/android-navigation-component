package com.imtiaz.mynavigationcomponent.data

import com.imtiaz.mynavigationcomponent.R

const val FORWARD = "forward"
const val DEFENDER = "defender"
const val MIDFIELDER = "mid-fielder"

val playerList = listOf<Player>(
    Player(1, "Messi", "Argentina", "Barcelona", "RW, CF", "messi", FORWARD),
    Player(2, "Cristiano Ronaldo", "Portugal", "Juventus", "LW", "ronaldo", FORWARD),
    Player(3, "Lewandowski", "Poland", "Bayern Munchen", "ST", "lewandowski", FORWARD),
    Player(4, "Neymar", "Brazil", "PSG", "LW", "neymar", FORWARD),
    Player(5, "Aguero", "Argentina", "Man City", "ST", "aguero", FORWARD),
    Player(6, "Suarez", "Uruguay", "Atletico Madrid", "ST", "suarez", FORWARD),
    Player(7, "Salah", "Egypt", "Liverpool", "RW", "salah", FORWARD),
    Player(8, "Mane", "Senegalese", "Liverpool", "LW", "mane", FORWARD),
    Player(9, "Mbappe", "France", "PSG", "RW, CF", "mabapee", FORWARD),
    Player(10, "Lautaro", "Argentina", "Inter Milan", "ST", "laurato", FORWARD),
    Player(11, "Ramos", "Spain", "Real Madrid", "CB", "ramos", DEFENDER),
    Player(12, "Koulibaly", "Senegalese", "Napoli", "CB", "koulibali", DEFENDER),
    Player(13, "Laporte", "France", "Man City", "CB", "laporte", DEFENDER),
    Player(14, "Van dijk", "Netherland", "Liverpool", "CB", "van", DEFENDER),
    Player(15, "Alaba", "Austria", "Bayern Munchen", "RB", "alaba", DEFENDER),
    Player(16, "Alba", "Spain", "Barcelona", "LB", "alba", DEFENDER),
    Player(17, "Kimmich", "Germany", "Bayern Munchen", "RB", "kimmich", DEFENDER),
    Player(18, "Kevin De Bruyne", "Belgium", "Man City", "CAM", "kevin", MIDFIELDER),
    Player(19, "Kroos", "Germany", "Real Madrid", "CM", "kroos", MIDFIELDER),
    Player(20, "Ozil", "Germany", "Arsenal", "CAM", "ozil", MIDFIELDER),
    Player(21, "Pogba", "France", "Man utd", "CM", "pogba", MIDFIELDER),
    Player(22, "Casemiro", "Brazil", "Real Madrid", "CDM", "casemiro", MIDFIELDER),
    Player(23, "Eriksen", "Denmark", "Inter Milan", "CAM", "eriksen", MIDFIELDER),
)

fun getPlayerListByPositionKey(positionKey: String) : List<Player> = playerList.filter { it.positionKey == positionKey }