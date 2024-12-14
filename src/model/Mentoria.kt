package model

import java.time.LocalDateTime

data class Mentoria(
    var data: LocalDateTime,
    override var nome: String,
    override var descricao: String
) : Conteudo
