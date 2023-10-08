package com.example.headshands

class Hero(attack: Int, defend: Int, hp: Int): Creature(attack, defend, hp){

    val maxHealth = this.hp
    var healPotion = 4

    fun heal() {

        if (this.healPotion > 0 && this.hp != maxHealth ){
            this.hp += this.hp * 30 / 100
            if(this.hp > maxHealth) this.hp = maxHealth
            this.healPotion--
        } else if (this.healPotion > 0 && this.hp == maxHealth) {
            println("Достигнут максимум здоровья!")
            this.healPotion--
        } else {
            println("Исцелиться больше нельзя!")
        }
    }
}