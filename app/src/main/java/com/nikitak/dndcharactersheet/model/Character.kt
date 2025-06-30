package com.nikitak.dndcharactersheet.model

class Character(
    var id: Int,
    var name: String,
    var dndClass: String?,
    var characterLvl: Int = 1,
    var species: String?,
    var background: String?,
    var alignment: String?,
    var exp: Int = 0,
    var player: String,
    var baseCharacteristics: Characteristics?,
) {
}