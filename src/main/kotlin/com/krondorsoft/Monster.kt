package com.krondorsoft

sealed class Monster (val name : String) {
    data class MyMonster(val monsterName : String) : Monster(monsterName)
}