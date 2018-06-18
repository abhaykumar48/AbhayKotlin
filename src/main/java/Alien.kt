fun main(args : Array<String>)
{
    println("This is Basic Kotlin, Hello World Program !")

    val name = "Chris Gayle"
    var age = 36

    println("The Name and Age of Player is" + (name + age))

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


    var numberA : Int = 65
    println("The Integer Value of doubleNum1 is" + doubleNum1.toInt())
    println("The Integer Value of the Char A is" + letterAndWords.toInt())
    println("The Character Value of the Integer A is" + numberA.toChar())


    var coolString = "Abhay"
    var hotString = "Ullas"

    println("The length of hotString is ${hotString.length}")

    coolString = "Surya"


    var finalString : String = coolString + "" + hotString
    println("The String Result is" + finalString)

    println("The String Comparison is as follows" + coolString.equals(hotString))

    println("To get the element in any Index is as follows" + coolString.get(2))
    println("Top get the index of a String in another method is as follows" + hotString[4])

    var newString = "This is Cool Right !"
    var oldString = "This is also Cool Right !"

    println("To find the sub sequence in any string" + newString.subSequence(2,7))
    println("to find one word in another sentence" + oldString.contains("Cool"))

    var myArray = arrayOf(1, 3.14, "Abhay")
    println("The Array Values are ${myArray}")

    myArray[2] = 6.28
    println("The Size of the Array is" + myArray.size)

    println("To check the element in an Array is ${myArray.contains(3.14)}")
    println("To check the element in any index in an Array is ${myArray.indexOf(3.14)}")
    println("To check the First element in the array is ${myArray.first()}")
}