package com.example.middleexam


data class Commodity(
    val name:String,
    val rank:Int,
    val num:Int,
    val weight:Int,
    val role:String,
)
data class Equipment(
    val name:String,
    val rank: Int,
    val num:Int,
    val weight:Int,
    val role:String,
)
object user{
        val Commodity:List<Commodity> = listOf(
            Commodity(
                "苹果",
                1,
                1,
                1,
                "好吃",
            ),
            Commodity(
                "梨子",
                2,
                2,
                2,
                "好吃"
            )
        )
        val Equipment:List<Equipment> = listOf(
            Equipment(
                "电饭锅",
                2,
                2,
                2,
                "煮饭",
            )
        )
}



