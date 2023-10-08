package com.example.headshands

open class Creature(val attack: Int, val defend: Int, var hp: Int){


    fun attack(target: Any?) {
        if(target is Creature && target.hp > 0) {
            val dices: MutableList<Int> = mutableListOf()
            var luck = 0
            var damage = this.attack - target.defend + 1

            if (damage > 0){
                while (damage in 1..6){
                    dices.add((1..6).random())
                    damage--
                }
            } else {
                dices.add((1..6).random())
            }

            println(dices)
            dices.forEach {
                if (it > 4) luck++
            }

            if (luck > 0) {
                val hit = (1..6).random()
                target.hp -= hit
                if(target.hp < 0) target.hp = 0
            }
            print("Здоровье атакующего: ")
            println(this.hp)
            print("Здоровье защищавшегося: ")
            println(target.hp)
        } else {
            println("Цель неясна, либо мертва!")
        }
    }
}