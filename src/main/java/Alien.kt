fun main(args : Array<String>)
{
    println("This is Basic Kotlin, Hello World Program !")

    val name = "Chris"
    var age = 33

    var bigInt : Int = Int.MAX_VALUE
    var smallInt : Int = Int.MIN_VALUE

    println("The Big Integer Value is" + bigInt)
    println("The Small Integer Value is $smallInt")

    var bigDouble : Double = Double.MAX_VALUE
    var smallDouble : Double = Double.MIN_VALUE

    println("The Big Double Value is" + bigDouble)
    println("The Small Double Value is $smallDouble")

    var doubleNum1 : Double = 1.11111111111111111
    var doubleNum2 : Double = 2.22222222222222222

    println("The Sum of the operation is " + "\t" + (doubleNum1 + doubleNum2))

    if (true is Boolean)
    {
        println("The true is Boolean, and the Value is 1")
    }
    else
    {
        println("The False is also Boolean with Value of 0")
    }

    var letterAndWords : Char = 'A'
    println("This is the Char representation in Kotlin and its value is ${letterAndWords}")


}