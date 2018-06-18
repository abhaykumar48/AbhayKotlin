class Human (n : String)
{
    var age : Int = 0
    var name : String = n

    constructor(age : Int, name : String) : this(name)
    {
        this.age =age
    }

    fun think()
    {
        println("Human Thinks Well $name and his age is $age")
    }
}

fun main(args : Array<String>)
{
    var man = Human(19,"Abhay Kumar")
    man.think()
}