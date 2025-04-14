class User(val name: String, ){


    public var postsNumber = 0


    var age: Int = 0
        get() = field
        set(value){field = value}
    fun sharePost(){
        println("$name shared post with age $age and $postsNumber posts")
    }
}