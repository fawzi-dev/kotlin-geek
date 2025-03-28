import java.util.*

fun main(){
    val names : MutableList<String> =  mutableListOf("Jon","Arya","Sansa")
    names.add ("Ned")
    names.removeAt(2) // Sansa will be removed
    names.sort() // Sorting in alphabetical order
    names.reverse()
    val fullName:String = names.joinToString(" ", prefix = "Names: ", postfix = ".")

    names[2] = "Daenerys"

    names.replaceAll { "- " + it}


    println( fullName)
    print(names)
}
