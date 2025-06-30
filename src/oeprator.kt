///// arthmetic and relational operatpr
//fun main(){
//    var a=7
//    var b=3
//    println(a+b) //10
//    println(a-b) //4
//    println(a*b) //21
//    println(a.toDouble()/b) ///2.333333333
//
//}
// ///second
//fun main()
//{
//    var num1=20
//    val num2=25
//    println(num1>num2)  //false
//    println(num1<num2)    //true
//    println(num1<=num2)   //true
//    println(num1>=num2)   //false
//    println(num1==num2)   //false
//    println(num1!=num2)           //true
//}
//
//
////third incremenatl and decremnetal oeprator
//incremental and decremental operator
//fun main() {
//    var x = 10
//    println(x++) //post incremenet first read then increase memory ma gayera 11 save grxa
//    println(x)
//}  output 10 11
//fun main() {
//    var x = 10
//    println(++x) //post incremenet first read then increase memory ma gayera 11 save grxa
//    println(x)
//}
////output 11 11
//
//// fourth
//fun main()
//{
//    var a=15
//    var b=10
//    print(++a + b++)
//}
//fun main() {
//    var number: Int = readLine()!!
//    println(number + 5)
//
//}
//
//fun main() {
//    println("Enter your age:")
//    var age: String =readLine()!!.toInt()
//    println("You are $age years old")
//    // take input as Int and store in age
//    // print: "You are {age} years old"
//}
//
//fun main() {
//println("enter the number")
//    val number:Int = readLine()!!.toInt()
//   println(number + 5)
//}
//fun main() {
//    var i = 1
//    while (i <= 3) {
//        println(i)
//        i++
//    }
//}
// logical operator
//fun main()
//{
//    var a=10
//    var b=20
//
//    var result=a>5 && b>10
//    print(result)
//}
//fun main(){
//    var percent= true
//    var background=true
//    var passinexam=percent && background
//    print(passinexam)
//}
//fun main()
//{
//    val above70=true
//    val knowsprogramming=true
//    val callforinterview=above70 && knowsprogramming
//    print(callforinterview)
//}

//fun main()
//{
//    val  messi=true
//    val ronaldo=false
//val fotballer=messi || ronaldo
//
//    print(fotballer)
//
//}
//Short-circuiting means that Kotlin stops evaluating an expression as soon as the result is determined, saving time and avoiding unnecessary operations.

fun main(){
    var a=10
    var b=20
     var result= a==9 && b>10
    print(result)
}