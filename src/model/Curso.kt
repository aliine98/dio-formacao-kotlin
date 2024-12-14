package model

data class Curso(
    var cargaHorariaEmMinutos: Int = 60,
    override var nome: String,
    override var descricao: String
) : Conteudo
