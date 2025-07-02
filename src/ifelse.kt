//if else statement
//fun main() {
//
//    val a = 10
//    val b = 10
//val result= if(a>b)
//{
//
//        "a is the greater number"
//    }
//else if (a < b) {
//        "b is the greater number"
//    }
//else {
//        "a is equal to b"
//    }
//    print(result)
//}


//fun main(){
//    val isRaining= true
//    if(isRaining==true){
//        print("Sorry cannt go outside")
//    }
//    else{
//        print("enjoy your day")
//    }
//}

//.
//fun main(){
//   println("enter the first number")
//    val a=readLine()!!.toInt()
//
//    println("enter the second number")
//    val b=readLine()!!.toInt()
//
//    if(a>b){
//        println("a is greater than b")
//    }
//
//    else if(a<b){
//        println("b is greater than a")
//    }
//
//    else{
//        println("a is equal to b")
//    }
//
//}

// evne number
//fun main(){
//    val number=20
//   val result= if(number%2==0) "even " else "odd"
//     print(result)
//}

/// Range and when statement
//fun main(){
//    val number=1
//    val result=number in 1..5
//    print(result)
//}
//




//check the number
//fun main(){
//val number =20
//val result= number in 1..20
//print("$result")
//}

//print the number
//fun main(){
//val r=(1..5).reversed()
//for(i in r ) {
//    print("$i")
//}

//}


//val age =25
//if(age in 1..60)









//fun main(){
//
//   val age=20
//    val result=age in 1..21
//    print(result)
//}



//fun main()
//{
//    var r= 1..5
//    for(i in 5 downTo  2){
//        print("$i")
//    }
//
//}


//EXAAMPLE OF WHEN

//fun main()
//{
//    println("enter the animal name")
//    val animal=readLine()!!
//
//    if(animal== "horse")
//    {
//        println("animal is horse")
//
//    }
//    else if(animal == "cat")
//    {
//        println("animal is cat")
//
//    }
//    else if(animal == "tiger")
//    {
//        println("animal is tiger")
//
//    }
//    else{
//        println("no animal found")
//    }
//
//}


//fun main() {
//    val animal = "cat"
//    when (animal) {
//        "dog" -> println("animal is dog")
//        "elephant" -> println("animal is dog")
//        "cat" -> println("animal is cat")
//        else -> println("no animal is found")
//
//    }
//}


//fun main() {
//    val x = 1
//    when(x) {
//        1 -> println("number one")
//        2 -> println("number tow")
//        3 -> println("number three")
//        4 -> println("number 3")
//        5 -> println("number 4")
//
//    }
//}
//
//fun main(){
// print("emter your grade")
//    val grade=readLine()!!
//
//    val result = when (grade) {
//        "A" -> "Excellent"
//        "B" -> "Good"
//        "C" -> "Fair"
//        else -> "Invalid"
//    }

//    println(result)
//
//
//}
//
//fun main(){
//    print("enter your age")
//
//    var age=readLine()!!.toInt()
//    when(age)
//    {
//       in 1..1)->print("child")
//        11..20->print("adolecent")
//        21..30->print("teen")
//        31..50->print("milf")
//        51..80->print("old")
//    }
//
//}
//fun main() {
//   50 print("Enter your age: ")
//    val age = readLine()!!.toInt()  // Convert input to Int
//
//    when (age) {
//        in 1..10 -> println("Child")
//        in 11..20 -> println("Adolescent")
//        in 21..30 -> println("Young Adult")
//        in 31..50 -> println("Middle-aged")
//        in 51..80 -> println("Old")
//        else -> println("Invalid age")
//    }
//}
