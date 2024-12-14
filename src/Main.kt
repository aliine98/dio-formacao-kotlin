import model.*
import java.time.LocalDateTime

fun main() {
    val curso: Conteudo = Curso(30,"Curso 1", "Descrição do curso")
    val mentoria: Conteudo = Mentoria(LocalDateTime.of(2024,12,18,19,0),"Mentoria 1", "Descrição da mentoria")
    val formacao = Formacao("Kotlin inicial", Nivel.INICIANTE, mutableListOf(curso,mentoria))
    val aluno = Aluno("Aline")
    formacao.matricular(aluno)
    println(formacao.conteudos)
    println(formacao.listaInscritos)
}