package model

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: MutableList<Conteudo>) {
    private val inscritos = mutableListOf<Aluno>()
    val listaInscritos
        get() = inscritos.toList()

    fun matricular(aluno: Aluno) {
        inscritos.add(aluno)
    }
}