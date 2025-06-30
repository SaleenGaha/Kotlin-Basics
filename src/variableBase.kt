/*Variable is container that hold a value in memory
two type of variable
val=cannot be changed/reasssigned
var=can be changed/reasssigned
 */
//
//fun main(){
//    var mark=50
//    mark=80
//    println(mark) //here var can be reassigned
//    val message="hello this is me Saleen"
//    message="update me"
//error show cause val cannot be reassigned//
//    println(message)
//}
/* it is  recommend that you declare all variables as read-only (val) by default. Declare mutable variables (var) only if necessary. */


/*datatype
A data type tells the compiler what kind of data a variable can hold — like a number, text, true/false, etc.

DATA TYPES
• INTEGER (Byte, Short, Int, Long) •
 FLOATING POINT (Float, Double) •
  BOOLEAN (True, False)
• CHARACTER (Char, String)
*/



//fun main(){
//    var car="Toyata"
//    car="bmw"
//    println(car)
//}
//fun main()
//{
//    var score=19
//    score=80
//    println(score)
//}
//fun main()
//{
//    var score : Int = 22
//    var  marks : Float= 2.2
//    var expression : Boolean=true
//
//    var alphabet: Char="A"
//}
//💲 What is the Dollar Sign ($) in Kotlin?
//In Kotlin, the $ symbol is used for string interpolation, which means inserting the value of a variable or expression directly inside a string.
//
//✅ Basic Example
//kotlin
//Copy
//Edit
//val name = "Saleen"
//println("Hello, $name!")



//fun main()
//{
//    var a=2
//    var b=7
//    var sum=a+b
//    println("the sum of $a and $b is  $sum")
//
//
//}



//fun main(){
//    var passenger=20
//    println("there are $passenger in the bus")
//println("there are  ${passenger+2 }in the bus")
//
//}
// string ($) interpolation
fun main() {
    val a = 5
    val b = 3
    println("Sum is ${a + b}")              // Expression
    println("Maximum is ${maxOf(a, b)}")    // Function
    println("Length is ${"Hello".length}")  // Property
}