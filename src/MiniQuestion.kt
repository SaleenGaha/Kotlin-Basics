import java.lang.Integer.sum


//Declare a val variable named country and assign "Nepal" to it.
//Declare a var variable named population and assign 30000000.
//Print:
//Nepal has a population of 30000000.
//fun main()
//{
//    val country="Nepal"
//    var population=30000000
//    println("$country has a population of $population")
//}

//Simple math
//Create two variables a = 6, b = 3.
//Print their sum, difference, product, and division.
//fun main()
//{
//    var a=6
//    var b=3
//    var sum=a+b
//    var multi=a*b
//    var divison=a/b
//    println("the sum, product and divison is $sum,$multi,$divison")
//}

//String interpolation
//Declare your name and age as variables.
//Print:
//My name is [your_name] and I am [your_age] years old.
//fun main(){
//    var name="Saleen"
//    var age =24
//    println("my name is $name and I am $age years old")
//}
//

//Nullable type
//Declare a String? variable called email and assign it null.
//Print it only if it is not null.
//fun main() {
//    val email: String? = null  // nullable String assigned null
//
//    if (email != null) {
//        println("Email: $email")
//    } else {
//        println("No email provided.")
//    }
//}
////Convert temperature from Celsius to Fahrenheit.
//Fahrenheit = (Celsius × 9/5) + 32
//fun main() {
//    print("enter the temprature in Celsius")
//    val celsius=readLine()!!.toDouble()
//    val fahrenheit= (celsius*9/5) + 32
//
//print("the tenperature in fahrenheit is $f2ahrenheit")
//}

//KM to meter
//fun main()
//{
//    print("enter the value of kilometer")
//    var kilometer=readLine()!!.toInt()
//    var meter=kilometer*1000
//    print("the value in meter is $meter")


//Minutes to Hours and Minutes
//Take input in total minutes and convert to hours and remaining minutes.
//
//Example: 125 minutes → 2 hours 5 minutes
//
//fun main()
//{
//    print("enter the  time in minute")
//    val totalminutes=readLine()!!.toDouble()
//    val hour=totalminutes/60
//     val minutes=totalminutes%60
//    print("the value in hour is $minutes")
//}
//


//
//fun main() {
//    print("enter the time in minute")
//    val minutes = readLine()!!.toDouble()   // ✅ First declaration
//    val hour = minutes / 60                 // ✅ OK
//    val minutes = minutes % 60              // ❌ ERROR!
//    print("the value in hour is $minutes")
//}
////
//You already declared a variable named minutes at the top.
//
//Then, you tried to declare it again with val minutes = minutes % 60
//
//Kotlin does not allow redeclaring a variable with the same name in the same scope.


//✅ Fix 2: Use var and reassign
//If you really want to use the same name:
//
//
//fun main() {
//    print("Enter time in minutes: ")
//    var minutes = readLine()!!.toDouble()
//
//    val hours = minutes / 60
//    minutes %= 60  // reassign to same variable
//
//    println("That’s $hours hour(s) and $minutes minute(s)")
//}
//var means mutable (can be changed)
//
//You are not redeclaring minutes, just modifying it
//
//🔹 6. Inches to Centimeters
//Take input in inches and convert to centimeters.
//1inch=2.54cm
fun main(){
print("enter the value in  inches ")
    val inches=readLine()!!.toDouble()
val centimeter=inches*2.54;
print("the value in centimeter is $centimeter")
}




