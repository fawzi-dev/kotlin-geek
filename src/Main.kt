fun main(){


// In Kotlin, null safety is achieved through nullable and non-nullable types like any other language.

// Non-nullable type
var nonNullable: String = "Hello, World!"
// nonNullable = null // This will cause a compilation error

// Nullable type
var nullable: String? = "Hello, Fawzi!"
nullable = null // This is allowed

// Safe call operator (?.) - returns null if the object is null
val length: Int? = nullable?.length
println(length) // Output: in case of null it will print null

// Elvis operator (?:) - provides a default value if the object is null
val lengthOrZero: Int = nullable?.length ?: 0
println(lengthOrZero)


}